package team.msg.domain.model.reservation.request.patchHomebaseReservation

data class patchHomebaseReservationRequestModel(
    val users: List<UserIdModel>,
    val reason: String
)
