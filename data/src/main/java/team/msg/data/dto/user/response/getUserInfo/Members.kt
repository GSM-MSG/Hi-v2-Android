package team.msg.data.dto.user.response.getUserInfo

import java.util.UUID

data class Members(
    val id: UUID,
    val name: String,
    val grade: Int,
    val classNum: Int,
    val number: Int
)