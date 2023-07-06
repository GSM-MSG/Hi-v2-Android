package team.msg.data.dto.homebase.request.postHomebaseReservation

import team.msg.domain.model.homebase.request.postHomebaseReservation.UserIdModel
import java.util.UUID

data class UserId(
    val id: UUID
)

fun UserIdModel.asUserId() = UserId(
    id = id
)