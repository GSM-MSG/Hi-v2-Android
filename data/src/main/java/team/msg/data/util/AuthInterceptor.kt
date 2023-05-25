package team.msg.data.util

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
import java.text.SimpleDateFormat
import javax.inject.Inject

class AuthInterceptor @Inject constructor(
    private val dataSource: LocalAuthDataSource
): Interceptor {

    override fun intercept(chain: Interceptor.Chain): Response {
        val request = chain.request()
        val builder =  request.newBuilder()
        val dateFormat = SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss")
        val currentTime = dateFormat.format(System.currentTimeMillis()).toString()
        val ignorePath = listOf("/auth")
        val ignoreMethod = listOf("POST")
        val path = request.url.encodedPath
        val method = request.method

        ignorePath.forEachIndexed { index, s ->
            if (s == path && ignoreMethod[index] == method) {
                return chain.proceed(request)
            }
        }

        runBlocking {
            val accessExp = dataSource.getAccessExp().first()
            val refreshExp = dataSource.getRefreshExp().first()

            if (refreshExp >= currentTime) throw NeedLoginException()

            if (accessExp >= currentTime) {
                val client = OkHttpClient()
                val refreshRequest = Request.Builder()
                    .url(BuildConfig.BASE_URL + "auth")
                    .patch("".toRequestBody("application/json".toMediaTypeOrNull()))
                    .addHeader("RefreshToken","Bearer ${dataSource.getRefreshToken().first()}")
                    .build()
                val jsonParser = JsonParser()
                val response = client.newCall(refreshRequest).execute()
                if (response.isSuccessful) {
                    val token = jsonParser.parse(response.body!!.string()) as JsonObject
                    dataSource.setAccessToken(token["accessToken"].toString())
                    dataSource.setRefreshToken(token["refreshToken"].toString())
                    dataSource.setAccessExp(token["accessExpiredAt"].toString())
                    dataSource.setRefreshExp(token["refreshExpiredAt"].toString())
                } else throw  NeedLoginException()
            }
            builder.addHeader("Authorization", "Bearer ${dataSource.getAccessToken().first()}")
        }
        return chain.proceed(builder.build())
    }
}