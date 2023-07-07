package team.msg.domain.usecase.reservation

import team.msg.domain.model.reservation.request.patchHomebaseReservation.patchHomebaseReservationRequestModel
import team.msg.domain.repository.ReservationRepository
import java.util.UUID
import javax.inject.Inject

class PatchHomebaseReservationUseCase @Inject constructor(
    private val reservationRepository: ReservationRepository
) {
    suspend operator fun invoke(
        reservationId: UUID,
        body: patchHomebaseReservationRequestModel
    ) = kotlin.runCatching {
        reservationRepository.patchHomebaseReservation(
            reservationId = reservationId,
            body = body
        )
    }
}