package team.msg.data.repository

import team.msg.data.dto.notice.request.postNotice.asPostNoticeRequest
import team.msg.data.dto.notice.response.getAllNotice.asGetAllNoticeResponseModel
import team.msg.data.dto.notice.response.getDetailNotice.asGetDetailNoticeResponseModel
import team.msg.data.remote.datasource.notice.NoticeDataSource
import team.msg.domain.model.notice.request.postNotice.PostNoticeRequestModel
import team.msg.domain.model.notice.response.getAllNotice.GetAllNoticeResponseModel
import team.msg.domain.model.notice.response.getDetailNotice.GetDetailNoticeResponseModel
import team.msg.domain.repository.NoticeRepository
import java.util.UUID
import javax.inject.Inject

class NoticeRepositoryImpl @Inject constructor(
    private val noticeDataSource: NoticeDataSource
): NoticeRepository {
    override suspend fun postNotice(body: PostNoticeRequestModel) =
        noticeDataSource.postNotice(body.asPostNoticeRequest())

    override suspend fun getAllNotice(): GetAllNoticeResponseModel =
        noticeDataSource.getAllNotice().asGetAllNoticeResponseModel()

    override suspend fun getDetailNotice(noticeId: UUID): GetDetailNoticeResponseModel =
        noticeDataSource.getDetailNotice(noticeId).asGetDetailNoticeResponseModel()

    override suspend fun deleteNotice(noticeId: UUID) =
        noticeDataSource.deleteNotice(noticeId)

    override suspend fun patchNotice(noticeId: UUID, body: PostNoticeRequestModel) =
        noticeDataSource.patchNotice(
            noticeId = noticeId,
            body = body.asPostNoticeRequest()
        )
}