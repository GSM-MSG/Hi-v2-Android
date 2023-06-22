package team.msg.data.network.api

import retrofit2.http.Body
import retrofit2.http.DELETE
import retrofit2.http.GET
import retrofit2.http.PATCH
import retrofit2.http.POST
import team.msg.data.dto.auth.request.GAuthLoginRequest
import team.msg.data.dto.auth.response.GAuthLoginResponse

interface AuthApi {
    @POST("auth")
    suspend fun gAuthLogin(
        @Body body: GAuthLoginRequest
    ): GAuthLoginResponse

    @GET("auth")
    suspend fun getGAuthAuthLink(): String

    @DELETE("auth")
    suspend fun logout()
}