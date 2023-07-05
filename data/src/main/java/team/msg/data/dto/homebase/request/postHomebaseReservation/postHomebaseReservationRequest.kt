package team.msg.data.dto.homebase.request.postHomebaseReservation

data class postHomebaseReservationRequest(
    val users: List<UserId>,
    val reason: String
)
