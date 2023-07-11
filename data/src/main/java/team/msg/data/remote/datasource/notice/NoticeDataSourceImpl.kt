package team.msg.data.remote.datasource.notice

import team.msg.data.dto.notice.request.postNotice.postNoticeRequest
import team.msg.data.dto.notice.response.getAllNotice.getAllNoticeResponse
import team.msg.data.dto.notice.response.getDetailNotice.getDetailNoticeResponse
import team.msg.data.network.api.NoticeApi
import team.msg.data.util.HiApiHandler
import java.util.UUID
import javax.inject.Inject

class NoticeDataSourceImpl @Inject constructor(
    private val noticeApi: NoticeApi
): NoticeDataSource {
    override suspend fun postNotice(body: postNoticeRequest) =
        HiApiHandler<Unit>()
            .httpRequest { noticeApi.postNotice(body) }
            .sendRequest()

    override suspend fun getAllNotice(): getAllNoticeResponse =
        HiApiHandler<getAllNoticeResponse>()
            .httpRequest { noticeApi.getAllNotice() }
            .sendRequest()

    override suspend fun getDetailNotice(noticeId: UUID): getDetailNoticeResponse =
        HiApiHandler<getDetailNoticeResponse>()
            .httpRequest { noticeApi.getDetailNotice(noticeId) }
            .sendRequest()

    override suspend fun deleteNotice(noticeId: UUID) =
        HiApiHandler<Unit>()
            .httpRequest { noticeApi.deleteNotice(noticeId) }
            .sendRequest()

    override suspend fun patchNotice(noticeId: UUID, body: postNoticeRequest) =
        HiApiHandler<Unit>()
            .httpRequest { noticeApi.patchNotice(noticeId, body) }
            .sendRequest()

}