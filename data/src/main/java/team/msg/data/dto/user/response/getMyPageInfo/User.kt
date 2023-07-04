package team.msg.data.dto.user.response.getMyPageInfo

import java.util.UUID

data class User(
    val id: UUID,
    val name: String,
    val grade: Int,
    val classNum: Int,
    val number: Int,
    val useStatus: String,
    val profileImageUrl: String
)
