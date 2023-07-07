package team.msg.data.dto.notice.response.getAllNotice

import team.msg.data.dto.user.response.getMyPageInfo.Users
import java.time.LocalDateTime
import java.util.UUID

data class Notice(
    val noticeId: UUID,
    val title: String,
    val user: Users,
    val createAt: LocalDateTime
)
