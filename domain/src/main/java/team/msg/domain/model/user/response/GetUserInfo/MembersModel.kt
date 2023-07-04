package team.msg.domain.model.user.response.GetUserInfo

import java.util.UUID

data class MembersModel(
    val id: UUID,
    val name: String,
    val grade: Int,
    val classNum: Int,
    val number: Int
)
