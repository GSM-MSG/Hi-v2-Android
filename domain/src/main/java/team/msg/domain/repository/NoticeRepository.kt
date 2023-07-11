package team.msg.domain.repository

import team.msg.domain.model.notice.request.postNotice.PostNoticeRequestModel
import team.msg.domain.model.notice.response.getAllNotice.GetAllNoticeResponseModel
import team.msg.domain.model.notice.response.getDetailNotice.GetDetailNoticeResponseModel
import java.util.UUID

interface NoticeRepository {
    suspend fun postNotice(body: PostNoticeRequestModel)

    suspend fun getAllNotice(): GetAllNoticeResponseModel

    suspend fun getDetailNotice(noticeId: UUID): GetDetailNoticeResponseModel

    suspend fun deleteNotice(noticeId: UUID)

    suspend fun patchNotice(
        noticeId: UUID,
        body: PostNoticeRequestModel
    )
}