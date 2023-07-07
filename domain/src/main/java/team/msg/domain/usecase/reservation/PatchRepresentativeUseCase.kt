package team.msg.domain.usecase.reservation

import team.msg.domain.repository.ReservationRepository
import java.util.UUID
import javax.inject.Inject

class PatchRepresentativeUseCase @Inject constructor(
    private val reservationRepository: ReservationRepository
) {
    suspend operator fun invoke(
        reservationId: UUID,
        userId: UUID
    ) = kotlin.runCatching {
        reservationRepository.patchRepresentative(
            reservationId = reservationId,
            userId = userId
        )
    }
}