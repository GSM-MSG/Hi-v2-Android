package team.msg.domain.usecase

import team.msg.domain.repository.AuthRepository
import javax.inject.Inject

class GAuthAuthLinkUseCase @Inject constructor(
    private val authRepository: AuthRepository
) {
    suspend operator fun invoke() = kotlin.runCatching { authRepository.gAuthAuthLink() }
}