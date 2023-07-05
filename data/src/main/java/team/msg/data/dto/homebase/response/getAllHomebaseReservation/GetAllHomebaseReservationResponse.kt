package team.msg.data.dto.homebase.response.getAllHomebaseReservation

import team.msg.data.dto.user.response.getMyPageInfo.Reservation

data class GetAllHomebaseReservationResponse(
    val reservations: List<Reservation>
)
