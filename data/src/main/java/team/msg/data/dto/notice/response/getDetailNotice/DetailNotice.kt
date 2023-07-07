package team.msg.data.dto.notice.response.getDetailNotice

import team.msg.data.dto.user.response.getMyPageInfo.Users
import java.time.LocalDateTime
import java.util.UUID

data class DetailNotice(
    val noticeId: UUID,
    val title: String,
    val content: String,
    val user: Users,
    val createAt: LocalDateTime
)
