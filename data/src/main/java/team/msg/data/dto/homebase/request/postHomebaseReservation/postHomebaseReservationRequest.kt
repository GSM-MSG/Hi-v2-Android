package team.msg.data.dto.homebase.request.postHomebaseReservation

import team.msg.domain.model.homebase.request.postHomebaseReservation.postHomebaseReservationRequestModel
import java.util.UUID

data class postHomebaseReservationRequest(
    val users: List<UUID>,
    val reason: String
)

fun postHomebaseReservationRequestModel.aspostHomebaseReservationRequest() = postHomebaseReservationRequest(
    users = users,
    reason = reason
)