package team.msg.domain.model.user.response.getAllStudentList

import java.util.UUID

data class GetAllStudentListResponseModel(
    val id: UUID,
    val email: String,
    val name: String,
    val grade: Int,
    val classNum: Int,
    val number: Int,
    val useStatus: String
)
