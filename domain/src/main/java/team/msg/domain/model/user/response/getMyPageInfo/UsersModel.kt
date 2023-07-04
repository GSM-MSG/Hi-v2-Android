package team.msg.domain.model.user.response.getMyPageInfo

import java.util.UUID

data class UsersModel(
    val userId: UUID,
    val name: String,
    val grade: Int,
    val classNum: Int,
    val number: Int
)
