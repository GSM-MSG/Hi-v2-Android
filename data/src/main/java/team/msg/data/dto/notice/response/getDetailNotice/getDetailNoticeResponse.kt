package team.msg.data.dto.notice.response.getDetailNotice

import team.msg.data.dto.user.response.getMyPageInfo.Users
import java.time.LocalDateTime
import java.util.UUID

data class getDetailNoticeResponse(
    val path: Path,
    val body: DetailNotice
)
