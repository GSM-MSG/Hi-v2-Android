package team.msg.data.dto.homebase.request.postHomebaseReservation

import team.msg.domain.model.homebase.request.postHomebaseReservation.postHomebaseReservationRequestModel

data class postHomebaseReservationRequest(
    val users: List<UserId>,
    val reason: String
)

fun postHomebaseReservationRequestModel.aspostHomebaseReservationRequest() = postHomebaseReservationRequest(
    users = users.map { it.asUserId() },
    reason = reason
)