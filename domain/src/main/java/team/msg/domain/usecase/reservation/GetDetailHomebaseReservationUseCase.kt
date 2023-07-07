package team.msg.domain.usecase.reservation

import team.msg.domain.repository.ReservationRepository
import java.util.UUID
import javax.inject.Inject

class GetDetailHomebaseReservationUseCase  @Inject constructor(
    private val reservationRepository: ReservationRepository
) {
    suspend operator fun invoke(reservationId: UUID) = kotlin.runCatching {
        reservationRepository.getDetailHomebaseReservation(reservationId)
    }
}