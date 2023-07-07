package team.msg.domain.usecase.reservation

import team.msg.domain.repository.ReservationRepository
import javax.inject.Inject

class DeleteAllHomebaseReservationUseCase @Inject constructor(
    private val reservationRepository: ReservationRepository
) {
    suspend operator fun invoke() = kotlin.runCatching {
        reservationRepository.deleteAllHomebaseReservation()
    }
}