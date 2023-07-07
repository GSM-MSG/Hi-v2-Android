package team.msg.domain.usecase.reservation

import team.msg.domain.model.reservation.request.patchHomebaseReservationCheckStatus.patchHomebaseReservationCheckStatusRequestModel
import team.msg.domain.repository.ReservationRepository
import java.util.UUID
import javax.inject.Inject

class PatchHomebaseReservationCheckStatusUseCase @Inject constructor(
    private val reservationRepository: ReservationRepository
) {
    suspend operator fun invoke(
        reservationId: UUID,
        body: patchHomebaseReservationCheckStatusRequestModel
    ) = kotlin.runCatching {
        reservationRepository.patchHomebaseReservationCheckStatus(
            reservationId = reservationId,
            body = body
        )
    }
}