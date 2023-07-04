package team.msg.data.dto.user.response.getUserInfo

import team.msg.domain.model.user.response.GetUserInfo.MembersModel
import java.util.UUID

data class Members(
    val id: UUID,
    val name: String,
    val grade: Int,
    val classNum: Int,
    val number: Int
)

fun Members.asMembersModel() = MembersModel(
    id = id,
    name = name,
    grade = grade,
    classNum = classNum,
    number = number
)