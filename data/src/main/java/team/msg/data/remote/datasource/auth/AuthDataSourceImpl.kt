package team.msg.data.remote.datasource.auth

import team.msg.data.dto.auth.request.GAuthLoginRequest
import team.msg.data.dto.auth.response.GAuthLoginResponse
import team.msg.data.network.api.AuthApi
import team.msg.data.util.HiApiHandler
import javax.inject.Inject

class AuthDataSourceImpl @Inject constructor(
    private val authApi: AuthApi
): AuthDataSource {
    override suspend fun gAuthLogin(body: GAuthLoginRequest): GAuthLoginResponse =
        HiApiHandler<GAuthLoginResponse>()
            .httpRequest { authApi.gAuthLogin(body = body) }
            .sendRequest()

    override suspend fun logout() =
        HiApiHandler<Unit>()
            .httpRequest { authApi.logout() }
            .sendRequest()
}