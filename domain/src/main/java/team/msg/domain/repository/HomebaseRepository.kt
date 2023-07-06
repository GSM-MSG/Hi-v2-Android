package team.msg.domain.repository

import team.msg.domain.model.homebase.request.postHomebaseReservation.postHomebaseReservationRequestModel
import team.msg.domain.model.homebase.response.getAllHomebaseReservation.GetAllHomebaseReservationResponseModel

interface HomebaseRepository {
    suspend fun getAllHomebaseReservation(
        period: Int,
        floor: Int
    ): GetAllHomebaseReservationResponseModel

    suspend fun postHomebaseReservation(
        period: Int,
        floor: Int,
        body: postHomebaseReservationRequestModel
    )

    suspend fun deletePeriodReservation(period: Int)
}