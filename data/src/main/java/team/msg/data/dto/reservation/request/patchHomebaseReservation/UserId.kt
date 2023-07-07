package team.msg.data.dto.reservation.request.patchHomebaseReservation

import team.msg.domain.model.reservation.request.patchHomebaseReservation.UserIdModel
import java.util.UUID

data class UserId(
    val userId: UUID
)

fun UserIdModel.asUserId() = UserId(
    userId = userId
)
