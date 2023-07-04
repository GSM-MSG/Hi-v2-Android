package team.msg.data.dto.user.response.getMyPageInfo

import java.util.UUID

data class Users(
    val userId: UUID,
    val name: String,
    val grade: Int,
    val classNum: Int,
    val number: Int
)
