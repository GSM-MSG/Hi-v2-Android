package team.msg.data.dto.reservation.request.patchHomebaseReservation

data class patchHomebaseReservationRequest(
    val users: List<UserId>,
    val reason: String
)
