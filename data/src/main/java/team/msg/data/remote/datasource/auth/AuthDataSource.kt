package team.msg.data.remote.datasource.auth

import team.msg.data.dto.auth.request.GAuthLoginRequest
import team.msg.data.dto.auth.response.GAuthAuthLinkResponse
import team.msg.data.dto.auth.response.GAuthLoginResponse

interface AuthDataSource {
    suspend fun gAuthLogin(body: GAuthLoginRequest): GAuthLoginResponse

    suspend fun gAuthAuthLink(): GAuthAuthLinkResponse

    suspend fun logout()
}