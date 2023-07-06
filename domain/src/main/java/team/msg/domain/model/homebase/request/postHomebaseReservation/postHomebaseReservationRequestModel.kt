package team.msg.domain.model.homebase.request.postHomebaseReservation

data class postHomebaseReservationRequestModel(
    val users: List<UserIdModel>,
    val reason: String
)
