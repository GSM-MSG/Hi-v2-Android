package team.msg.data.dto.user.response.getMyPageInfo

import team.msg.domain.model.user.response.getMyPageInfo.ReservationModel
import java.util.UUID

data class Reservation(
    val id: UUID,
    val users: List<Users>
)

fun Reservation.asReservationModel() = ReservationModel(
    id = id,
    users = users.map { it.asUsersModel() }
)