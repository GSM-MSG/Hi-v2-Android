package team.msg.domain.usecase.homebase

import team.msg.domain.repository.HomebaseRepository
import javax.inject.Inject

class GetAllHomebaseReservationUseCase @Inject constructor(
    private val homebaseRepository: HomebaseRepository
) {
    suspend operator fun invoke(period: Int, floor: Int) = kotlin.runCatching {
        homebaseRepository.getAllHomebaseReservation(period, floor)
    }
}