package team.msg.data.dto.user.response.getMyPageInfo

import team.msg.domain.model.user.response.getMyPageInfo.GetMyPageInfoResponseModel

data class GetMyPageInfoResponse(
    val user: User,
    val reservations: List<Reservation>
)

fun GetMyPageInfoResponse.asGetMyPageInfoResponseModel() = GetMyPageInfoResponseModel(
    user = user.asUserModel(),
    reservations = reservations.map { it.asReservationModel() }
)