package team.msg.data.dto.homebase.response.getAllHomebaseReservation

import team.msg.data.dto.user.response.getMyPageInfo.Reservation
import team.msg.data.dto.user.response.getMyPageInfo.asReservationModel
import team.msg.domain.model.homebase.response.getAllHomebaseReservation.GetAllHomebaseReservationResponseModel

data class GetAllHomebaseReservationResponse(
    val reservations: List<Reservation>
)

fun GetAllHomebaseReservationResponse.asGetAllHomebaseReservationResponseModel() = GetAllHomebaseReservationResponseModel(
    reservations = reservations.map { it.asReservationModel() }
)