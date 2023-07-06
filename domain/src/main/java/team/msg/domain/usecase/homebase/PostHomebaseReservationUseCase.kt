package team.msg.domain.usecase.homebase

import team.msg.domain.model.homebase.request.postHomebaseReservation.postHomebaseReservationRequestModel
import team.msg.domain.repository.HomebaseRepository
import javax.inject.Inject

class PostHomebaseReservationUseCase @Inject constructor(
    private val homebaseRepository: HomebaseRepository
) {
    suspend operator fun invoke(
        period: Int,
        floor: Int,
        body: postHomebaseReservationRequestModel
    ) = kotlin.runCatching {
        homebaseRepository.postHomebaseReservation(period, floor, body)
    }
}