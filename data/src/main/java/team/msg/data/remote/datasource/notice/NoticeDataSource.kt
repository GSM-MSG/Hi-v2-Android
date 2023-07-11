package team.msg.data.remote.datasource.notice

import team.msg.data.dto.notice.request.postNotice.postNoticeRequest
import team.msg.data.dto.notice.response.getAllNotice.getAllNoticeResponse
import team.msg.data.dto.notice.response.getDetailNotice.getDetailNoticeResponse
import java.util.UUID

interface NoticeDataSource {
    suspend fun postNotice(body: postNoticeRequest)

    suspend fun getAllNotice(): getAllNoticeResponse

    suspend fun getDetailNotice(noticeId: UUID): getDetailNoticeResponse

    suspend fun deleteNotice(noticeId: UUID)

    suspend fun patchNotice(
        noticeId: UUID,
        body: postNoticeRequest
    )
}