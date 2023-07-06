package team.msg.domain.model.homebase.request.postHomebaseReservation

import java.util.UUID

data class postHomebaseReservationRequestModel(
    val users: List<UUID>,
    val reason: String
)
