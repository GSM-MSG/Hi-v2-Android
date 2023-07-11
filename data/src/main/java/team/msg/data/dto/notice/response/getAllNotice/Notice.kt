package team.msg.data.dto.notice.response.getAllNotice

import team.msg.data.dto.user.response.getMyPageInfo.Users
import team.msg.data.dto.user.response.getMyPageInfo.asUsersModel
import team.msg.domain.model.notice.response.getAllNotice.NoticeModel
import java.time.LocalDateTime
import java.util.UUID

data class Notice(
    val noticeId: UUID,
    val title: String,
    val user: Users,
    val createAt: LocalDateTime
)

fun Notice.asNoticeModel() = NoticeModel(
    noticeId = noticeId,
    title = title,
    user =  user.asUsersModel(),
    createAt = createAt
)