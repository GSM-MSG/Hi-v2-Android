package team.msg.data.dto.reservation.response.GetDetailHomebaseReservation

import team.msg.data.dto.user.response.getMyPageInfo.Users
import team.msg.data.dto.user.response.getMyPageInfo.asUsersModel
import team.msg.domain.model.reservation.response.getDetailHomebaseReservation.GetDetailHomebaseReservationResponseModel

data class GetDetailHomebaseReservationResponse(
    val users: List<Users>,
    val reason: String,
    val checkStatus: Boolean
)

fun GetDetailHomebaseReservationResponse.asGetDetailHomebaseReservationResponseModel() = GetDetailHomebaseReservationResponseModel(
    users = users.map { it.asUsersModel() },
    reason = reason,
    checkStatus = checkStatus
)