package team.msg.data.dto.user.response.getMyPageInfo

data class GetMyPageInfoResponse(
    val user: User,
    val reservations: List<Reservation>
)
