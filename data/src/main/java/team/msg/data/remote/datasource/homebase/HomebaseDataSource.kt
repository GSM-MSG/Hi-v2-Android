package team.msg.data.remote.datasource.homebase

import team.msg.data.dto.homebase.request.postHomebaseReservation.postHomebaseReservationRequest
import team.msg.data.dto.homebase.response.getAllHomebaseReservation.GetAllHomebaseReservationResponse

interface HomebaseDataSource {
    suspend fun getAllHomebaseReservation(
        period: Int,
        floor: Int
    ): GetAllHomebaseReservationResponse

    suspend fun postHomebaseReservation(
        period: Int,
        floor: Int,
        body: postHomebaseReservationRequest
    )

    suspend fun deletePeriodReservation(period: Int)
}