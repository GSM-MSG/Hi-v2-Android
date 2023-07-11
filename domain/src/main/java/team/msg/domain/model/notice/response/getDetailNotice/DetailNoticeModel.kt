package team.msg.domain.model.notice.response.getDetailNotice

import team.msg.domain.model.user.response.getMyPageInfo.UsersModel
import java.time.LocalDateTime
import java.util.UUID

data class DetailNoticeModel(
    val noticeId: UUID,
    val title: String,
    val content: String,
    val user: UsersModel,
    val createAt: LocalDateTime
)
