package team.msg.data.dto.reservation.response.GetDetailHomebaseReservation

import team.msg.data.dto.user.response.getMyPageInfo.Users

data class GetDetailHomebaseReservationResponse(
    val users: List<Users>,
    val reason: String,
    val checkStatus: Boolean
)