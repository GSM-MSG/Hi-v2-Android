package team.msg.data.dto.user.response

import java.util.UUID

data class SearchStudentResponse(
    val member: List<Members>
)

data class Members(
    val id: UUID,
    val name: String,
    val grade: Int,
    val classNum: Int,
    val number: Int
)
