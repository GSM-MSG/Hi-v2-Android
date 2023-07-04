package team.msg.data.dto.user.response.getMyPageInfo

import team.msg.domain.model.user.response.getMyPageInfo.UsersModel
import java.util.UUID

data class Users(
    val userId: UUID,
    val name: String,
    val grade: Int,
    val classNum: Int,
    val number: Int
)

fun Users.asUsersModel() = UsersModel(
    userId = userId,
    name = name,
    grade = grade,
    classNum = classNum,
    number = number
)
