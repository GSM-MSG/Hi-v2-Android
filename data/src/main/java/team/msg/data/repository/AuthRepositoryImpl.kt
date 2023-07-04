package team.msg.data.repository

import team.msg.data.dto.auth.request.GAuthLoginRequest
import team.msg.data.dto.auth.response.toLoginResponseData
import team.msg.data.local.datasource.auth.LocalAuthDataSource
import team.msg.data.remote.datasource.auth.AuthDataSource
import team.msg.domain.model.auth.request.GAuthLoginRequestData
import team.msg.domain.model.auth.response.GAuthLoginResponseData
import team.msg.domain.repository.AuthRepository
import javax.inject.Inject

class AuthRepositoryImpl @Inject constructor(
  private val authDataSource: AuthDataSource,
  private val localAuthDataSource: LocalAuthDataSource
): AuthRepository {
    override suspend fun gAuthLogin(body: GAuthLoginRequestData): GAuthLoginResponseData =
        authDataSource.gAuthLogin(GAuthLoginRequest(body.code)).toLoginResponseData()

    override suspend fun saveTokenInfo(
        accessToken: String,
        refreshToken: String,
        accessExp: String,
        refreshExp: String
    ) {
        localAuthDataSource.saveTokenInfo(accessToken, refreshToken, accessExp, refreshExp)
    }

    override suspend fun logout() = authDataSource.logout()
}