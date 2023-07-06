package team.msg.domain.usecase.auth

import team.msg.domain.repository.AuthRepository
import javax.inject.Inject

data class LogoutUseCase @Inject constructor(
    private val authRepository: AuthRepository
) {
    suspend operator fun invoke() = kotlin.runCatching {
        authRepository.logout()
    }
}
