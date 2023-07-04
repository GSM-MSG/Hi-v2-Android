package team.msg.domain.model.user.response.getMyPageInfo

import java.util.UUID

data class ReservationModel(
    val id: UUID,
    val users: List<UsersModel>
)
