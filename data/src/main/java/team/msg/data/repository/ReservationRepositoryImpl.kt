package team.msg.data.repository

import team.msg.data.dto.reservation.request.patchHomebaseReservation.aspatchHomebaseReservationRequest
import team.msg.data.dto.reservation.request.patchHomebaseReservationCheckStatus.aspatchHomebaseReservationCheckStatusRequest
import team.msg.data.dto.reservation.response.GetDetailHomebaseReservation.asGetDetailHomebaseReservationResponseModel
import team.msg.data.remote.datasource.Reservation.ReservationDataSource
import team.msg.domain.model.reservation.request.patchHomebaseReservation.patchHomebaseReservationRequestModel
import team.msg.domain.model.reservation.request.patchHomebaseReservationCheckStatus.patchHomebaseReservationCheckStatusRequestModel
import team.msg.domain.model.reservation.response.getDetailHomebaseReservation.GetDetailHomebaseReservationResponseModel
import team.msg.domain.repository.ReservationRepository
import java.util.UUID
import javax.inject.Inject

class ReservationRepositoryImpl @Inject constructor(
    private val reservationDataSource: ReservationDataSource
): ReservationRepository {
    override suspend fun getDetailHomebaseReservation(reservationId: UUID): GetDetailHomebaseReservationResponseModel =
        reservationDataSource.getDetailHomebaseReservation(reservationId).asGetDetailHomebaseReservationResponseModel()

    override suspend fun deleteHomebaseReservation(reservationId: UUID) =
        reservationDataSource.deleteHomebaseReservation(reservationId)

    override suspend fun patchHomebaseReservation(
        reservationId: UUID,
        body: patchHomebaseReservationRequestModel
    ) = reservationDataSource.patchHomebaseReservation(
        reservationId = reservationId,
        body = body.aspatchHomebaseReservationRequest()
    )

    override suspend fun patchRepresentative(reservationId: UUID, userId: UUID) =
        reservationDataSource.patchRepresentative(
            reservationId = reservationId,
            userId = userId
        )

    override suspend fun deleteExitHomebaseReservation(reservationId: UUID) =
        reservationDataSource.deleteExitHomebaseReservation(reservationId)

    override suspend fun patchHomebaseReservationCheckStatus(
        reservationId: UUID,
        body: patchHomebaseReservationCheckStatusRequestModel
    ) = reservationDataSource.patchHomebaseReservationCheckStatus(
        reservationId = reservationId,
        body = body.aspatchHomebaseReservationCheckStatusRequest()
    )

    override suspend fun deleteAllHomebaseReservation() =
        reservationDataSource.deleteAllHomebaseReservation()
}