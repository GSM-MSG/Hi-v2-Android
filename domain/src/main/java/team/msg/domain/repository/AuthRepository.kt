package team.msg.domain.repository

import team.msg.domain.model.auth.request.GAuthLoginRequestData
import team.msg.domain.model.auth.response.GAuthLoginResponseData

interface AuthRepository {
    suspend fun gAuthLogin(body: GAuthLoginRequestData): GAuthLoginResponseData
}