package team.msg.data.dto.user.response.getMyPageInfo

import java.util.UUID

data class Reservation(
    val id: UUID,
    val users: List<Users>
)
