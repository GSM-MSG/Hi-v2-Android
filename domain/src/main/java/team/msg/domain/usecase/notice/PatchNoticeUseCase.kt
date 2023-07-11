package team.msg.domain.usecase.notice

import team.msg.domain.model.notice.request.postNotice.PostNoticeRequestModel
import team.msg.domain.repository.NoticeRepository
import java.util.UUID
import javax.inject.Inject

class PatchNoticeUseCase @Inject constructor(
    private val noticeRepository: NoticeRepository
) {
    suspend operator fun invoke(
        noticeId: UUID,
        body: PostNoticeRequestModel
    ) = kotlin.runCatching {
        noticeRepository.patchNotice(
            noticeId = noticeId,
            body = body
        )
    }
}