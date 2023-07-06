package team.msg.data.repository

import team.msg.data.dto.homebase.request.postHomebaseReservation.aspostHomebaseReservationRequest
import team.msg.data.dto.homebase.response.getAllHomebaseReservation.asGetAllHomebaseReservationResponseModel
import team.msg.data.remote.datasource.homebase.HomebaseDataSource
import team.msg.domain.model.homebase.request.postHomebaseReservation.postHomebaseReservationRequestModel
import team.msg.domain.model.homebase.response.getAllHomebaseReservation.GetAllHomebaseReservationResponseModel
import team.msg.domain.repository.HomebaseRepository
import javax.inject.Inject

class HomebaseRepositoryImpl @Inject constructor(
    private val homebaseDataSource: HomebaseDataSource
): HomebaseRepository {
    override suspend fun getAllHomebaseReservation(
        period: Int,
        floor: Int
    ): GetAllHomebaseReservationResponseModel {
        return homebaseDataSource.getAllHomebaseReservation(period, floor).asGetAllHomebaseReservationResponseModel()
    }

    override suspend fun postHomebaseReservation(
        period: Int,
        floor: Int,
        body: postHomebaseReservationRequestModel
    ) {
        homebaseDataSource.postHomebaseReservation(period, floor, body.aspostHomebaseReservationRequest())
    }

    override suspend fun deletePeriodReservation(period: Int) {
        homebaseDataSource.deletePeriodReservation(period)
    }
}