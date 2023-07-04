package team.msg.domain.model.user.response.getMyPageInfo

import java.util.UUID

data class UserModel(
    val id: UUID,
    val name: String,
    val grade: Int,
    val classNum: Int,
    val number: Int,
    val useStatus: String,
    val profileImageUrl: String
)
