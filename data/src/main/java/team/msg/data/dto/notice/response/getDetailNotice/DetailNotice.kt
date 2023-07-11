package team.msg.data.dto.notice.response.getDetailNotice

import team.msg.data.dto.user.response.getMyPageInfo.Users
import team.msg.data.dto.user.response.getMyPageInfo.asUsersModel
import team.msg.domain.model.notice.response.getDetailNotice.DetailNoticeModel
import java.time.LocalDateTime
import java.util.UUID

data class DetailNotice(
    val noticeId: UUID,
    val title: String,
    val content: String,
    val user: Users,
    val createAt: LocalDateTime
)

fun DetailNotice.asDetailNoticeModel() = DetailNoticeModel(
    noticeId = noticeId,
    title = title,
    content = content,
    user = user.asUsersModel(),
    createAt = createAt
)
