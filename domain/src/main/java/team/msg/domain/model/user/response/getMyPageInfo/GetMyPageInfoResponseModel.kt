package team.msg.domain.model.user.response.getMyPageInfo

data class GetMyPageInfoResponseModel(
    val user: UserModel,
    val reservations: List<ReservationModel>
)
