package team.msg.domain.model.reservation.response.getDetailHomebaseReservation

import team.msg.domain.model.user.response.getMyPageInfo.UsersModel

data class GetDetailHomebaseReservationResponseModel(
    val users: List<UsersModel>,
    val reason: String,
    val checkStatus: Boolean
)
