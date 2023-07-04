package team.msg.data.dto.user.response.getMyPageInfo

import team.msg.domain.model.user.response.getMyPageInfo.UserModel
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

fun User.asUserModel() = UserModel(
    id = id,
    name = name,
    grade = grade,
    classNum = classNum,
    number = number,
    useStatus = useStatus,
    profileImageUrl = profileImageUrl
)
