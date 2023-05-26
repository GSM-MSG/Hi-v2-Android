package team.msg.data.repository

import team.msg.data.dto.auth.request.GAuthLoginRequest
import team.msg.data.dto.auth.response.toLoginResponseData
import team.msg.data.remote.datasource.auth.AuthDataSource
import team.msg.domain.model.auth.request.GAuthLoginRequestData
import team.msg.domain.model.auth.response.GAuthLoginResponseData
import team.msg.domain.repository.AuthRepository
import javax.inject.Inject

class AuthRepositoryImpl @Inject constructor(
  private val  authDataSource: AuthDataSource
): AuthRepository {
    override suspend fun gAuthLogin(body: GAuthLoginRequestData): GAuthLoginResponseData =
        authDataSource.gAuthLogin(GAuthLoginRequest(body.code)).toLoginResponseData()
}