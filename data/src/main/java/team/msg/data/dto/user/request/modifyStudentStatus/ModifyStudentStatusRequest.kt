package team.msg.data.dto.user.request.modifyStudentStatus

import team.msg.domain.model.user.request.modifyStudentStatus.ModifyStudentStatusRequestModel

data class ModifyStudentStatusRequest(
    val status: String
)

fun ModifyStudentStatusRequestModel.asModifyStudentStatusRequest() = ModifyStudentStatusRequest(
    status = status
)