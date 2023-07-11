package team.msg.domain.usecase.notice

import team.msg.domain.model.notice.request.postNotice.PostNoticeRequestModel
import team.msg.domain.repository.NoticeRepository
import javax.inject.Inject

class PostNoticeUseCase @Inject constructor(
    private val noticeRepository: NoticeRepository
) {
    suspend operator fun invoke(body: PostNoticeRequestModel) = kotlin.runCatching {
        noticeRepository.postNotice(body)
    }
}