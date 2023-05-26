package team.msg.data.util

import android.util.Log
import com.google.gson.JsonObject
import com.google.gson.JsonParser
import kotlinx.coroutines.flow.first
import kotlinx.coroutines.runBlocking
import okhttp3.Interceptor
import okhttp3.MediaType.Companion.toMediaTypeOrNull
import okhttp3.OkHttpClient
import okhttp3.Request
import okhttp3.RequestBody.Companion.toRequestBody
import okhttp3.Response
import team.msg.data.BuildConfig
import team.msg.data.local.datasource.auth.LocalAuthDataSource
import team.msg.domain.exception.NeedLoginException
import java.time.LocalDateTime
import javax.inject.Inject

class AuthInterceptor @Inject constructor(
    private val dataSource: LocalAuthDataSource
) : Interceptor {

    override fun intercept(chain: Interceptor.Chain): Response {
        val request = chain.request()
        val builder = request.newBuilder()
        val ignorePath = listOf("/auth")
        val ignoreMethod = listOf("POST")
        val path = request.url.encodedPath
        val method = request.method
        val currentTime = LocalDateTime.now()

        ignorePath.forEachIndexed { index, s ->
            if (s == path && ignoreMethod[index] == method) {
                return chain.proceed(request)
            }
        }

        runBlocking {
            val accessExp = LocalDateTime.parse(dataSource.getAccessExp().first())
            val refreshExp = LocalDateTime.parse(dataSource.getRefreshExp().first())
            val refreshToken = dataSource.getRefreshToken().first()
            Log.d("intercept", "refreshToken: $refreshToken")
            Log.d("intercept", "accessExp: $accessExp")
            Log.d("intercept", "refreshExp: $refreshExp")

            if (currentTime.isAfter(refreshExp)) throw NeedLoginException()

            if (currentTime.isAfter(accessExp)) {
                val client = OkHttpClient()
                val refreshRequest = Request.Builder()
                    .url(BuildConfig.BASE_URL + "auth")
                    .patch("".toRequestBody("application/json".toMediaTypeOrNull()))
                    .addHeader("RefreshToken", "Bearer $refreshToken")
                    .build()
                val jsonParser = JsonParser()
                val response = client.newCall(refreshRequest).execute()
                if (response.isSuccessful) {
                    val token = jsonParser.parse(response.body!!.string()) as JsonObject
                    dataSource.setAccessToken(token["accessToken"].toString())
                    dataSource.setRefreshToken(token["refreshToken"].toString())
                    dataSource.setAccessExp(token["accessExpiredAt"].toString())
                    dataSource.setRefreshExp(token["refreshExpiredAt"].toString())
                } else throw NeedLoginException()
            }
            builder.addHeader("Authorization", "Bearer ${dataSource.getAccessToken().first()}")
        }
        return chain.proceed(builder.build())
    }
}