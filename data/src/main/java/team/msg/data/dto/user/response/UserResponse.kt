package team.msg.data.dto.user.response

import java.util.UUID

data class UserResponse(
    val body: Body
)

data class User(
    val id: UUID,
    val name: String,
    val grade: Int,
    val classNum: Int,
    val number: Int,
    val useStatus: String,
    val profileImageUrl: String
)

data class Users(
    val userId: UUID,
    val name: String,
    val grade: Int,
    val classNum: Int,
    val number: Int
)

data class Reservation(
    val id: UUID,
    val users: List<Users>
)

data class Body(
    val user: User,
    val reservations: List<Reservation>
)
