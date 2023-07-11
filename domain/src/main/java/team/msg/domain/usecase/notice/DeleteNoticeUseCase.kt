package team.msg.domain.usecase.notice

import team.msg.domain.repository.NoticeRepository
import java.util.UUID
import javax.inject.Inject

class DeleteNoticeUseCase @Inject constructor(
    private val noticeRepository: NoticeRepository
) {
    suspend operator fun invoke(noticeId: UUID) = kotlin.runCatching {
        noticeRepository.deleteNotice(noticeId)
    }
}