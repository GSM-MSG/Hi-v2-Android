package team.msg.domain.model.homebase.response.getAllHomebaseReservation

import team.msg.domain.model.user.response.getMyPageInfo.ReservationModel

data class GetAllHomebaseReservationResponseModel(
    val reservations: List<ReservationModel>
)
