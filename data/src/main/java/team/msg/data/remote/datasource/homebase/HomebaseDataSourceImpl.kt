package team.msg.data.remote.datasource.homebase

import team.msg.data.dto.homebase.request.postHomebaseReservation.postHomebaseReservationRequest
import team.msg.data.dto.homebase.response.getAllHomebaseReservation.GetAllHomebaseReservationResponse
import team.msg.data.network.api.HomebaseApi
import team.msg.data.util.HiApiHandler
import javax.inject.Inject

class HomebaseDataSourceImpl @Inject constructor(
    private val homebaseApi: HomebaseApi
): HomebaseDataSource {
    override suspend fun getAllHomebaseReservation(
        period: Int,
        floor: Int
    ): GetAllHomebaseReservationResponse =
        HiApiHandler<GetAllHomebaseReservationResponse>()
            .httpRequest { homebaseApi.getAllHomebaseReservation(period, floor) }
            .sendRequest()

    override suspend fun postHomebaseReservation(
        period: Int,
        floor: Int,
        body: postHomebaseReservationRequest
    ) = HiApiHandler<Unit>()
            .httpRequest { homebaseApi.postHomebaseReservation(period, floor, body) }
            .sendRequest()

    override suspend fun deletePeriodReservation(period: Int) =
        HiApiHandler<Unit>()
            .httpRequest { homebaseApi.deletePeriodReservation(period) }
            .sendRequest()
}