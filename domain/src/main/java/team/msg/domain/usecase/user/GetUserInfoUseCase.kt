package team.msg.domain.usecase.user

import team.msg.domain.model.user.request.GetUserInfo.GetUserInfoRequestModel
import team.msg.domain.repository.UserRepository
import javax.inject.Inject

class GetUserInfoUseCase @Inject constructor(
    private val userRepository: UserRepository
) {
    suspend operator fun invoke(getUserInfoRequestModel: GetUserInfoRequestModel) = kotlin.runCatching { userRepository.getUserInfo(getUserInfoRequestModel) }
}