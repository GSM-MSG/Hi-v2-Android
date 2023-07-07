package team.msg.data.dto.reservation.request.patchHomebaseReservation

import team.msg.domain.model.reservation.request.patchHomebaseReservation.patchHomebaseReservationRequestModel

data class patchHomebaseReservationRequest(
    val users: List<UserId>,
    val reason: String
)

fun patchHomebaseReservationRequestModel.aspatchHomebaseReservationRequest() = patchHomebaseReservationRequest(
    users = users.map { it.asUserId() },
    reason = reason
)

