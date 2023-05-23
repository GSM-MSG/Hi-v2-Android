package team.msg.domain.usecase

import team.msg.domain.model.auth.request.GAuthLoginRequestData
import team.msg.domain.repository.AuthRepository
import javax.inject.Inject

class GAuthLoginUseCase @Inject constructor(
    private val authRepository: AuthRepository
) {
    suspend operator fun invoke(body: GAuthLoginRequestData) =
        authRepository.gAuthLogin(body)
}