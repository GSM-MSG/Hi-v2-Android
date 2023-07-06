package team.msg.domain.usecase.homebase

import team.msg.domain.repository.HomebaseRepository
import javax.inject.Inject

class DeletePeriodReservationUseCase @Inject constructor(
    private val homebaseRepository: HomebaseRepository
) {
    suspend operator fun invoke(period: Int) = kotlin.runCatching {
        homebaseRepository.deletePeriodReservation(period)
    }
}