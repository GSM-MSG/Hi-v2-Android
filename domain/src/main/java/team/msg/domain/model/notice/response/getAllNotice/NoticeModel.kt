package team.msg.domain.model.notice.response.getAllNotice

import team.msg.domain.model.user.response.getMyPageInfo.UsersModel
import java.time.LocalDateTime
import java.util.UUID

data class NoticeModel(
    val noticeId: UUID,
    val title: String,
    val user: UsersModel,
    val createAt: LocalDateTime
)
