package team.msg.domain.usecase.user

import team.msg.domain.repository.UserRepository
import javax.inject.Inject

class GetMyPageInfoUseCase @Inject constructor(
    private val userRepository: UserRepository
) {
    suspend operator fun invoke() = kotlin.runCatching {
        userRepository.getMyPageInfo()
    }
}