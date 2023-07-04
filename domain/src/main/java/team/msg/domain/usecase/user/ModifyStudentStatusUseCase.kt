package team.msg.domain.usecase.user

import team.msg.domain.model.user.request.modifyStudentStatus.ModifyStudentStatusRequestModel
import team.msg.domain.repository.UserRepository
import java.util.UUID
import javax.inject.Inject

class ModifyStudentStatusUseCase @Inject constructor(
    private val userRepository: UserRepository
) {
    suspend operator fun invoke(id: UUID, modifyStudentStatusRequestModel: ModifyStudentStatusRequestModel) = userRepository.modifyStudentStatus(id, modifyStudentStatusRequestModel)
}