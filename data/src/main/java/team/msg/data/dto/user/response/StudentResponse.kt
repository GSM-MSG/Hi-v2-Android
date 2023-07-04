package team.msg.data.dto.user.response

import java.util.UUID

data class StudentResponse(
    val id: UUID,
    val email: String,
    val name: String,
    val grade: Int,
    val classNum: Int,
    val number: Int,
    val useStatus: String
)
