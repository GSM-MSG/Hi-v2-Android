package team.msg.domain.repository

import team.msg.domain.model.auth.request.GAuthLoginRequestData
import team.msg.domain.model.auth.response.GAuthAuthLinkResponseData
import team.msg.domain.model.auth.response.GAuthLoginResponseData

interface AuthRepository {
    suspend fun gAuthLogin(body: GAuthLoginRequestData): GAuthLoginResponseData

    suspend fun saveTokenInfo(
        accessToken: String,
        refreshToken: String,
        accessExp: String,
        refreshExp: String,
    )

    suspend fun gAuthAuthLink(): GAuthAuthLinkResponseData

    suspend fun logout()
}