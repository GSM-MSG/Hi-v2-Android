package team.msg.data.remote.datasource.Reservation

import team.msg.data.dto.reservation.request.patchHomebaseReservation.patchHomebaseReservationRequest
import team.msg.data.dto.reservation.request.patchHomebaseReservationCheckStatus.patchHomebaseReservationCheckStatusRequest
import team.msg.data.dto.reservation.response.GetDetailHomebaseReservation.GetDetailHomebaseReservationResponse
import team.msg.data.network.api.ReservationApi
import team.msg.data.util.HiApiHandler
import java.util.UUID
import javax.inject.Inject

class ReservationDataSourceImpl @Inject constructor(
    private val reservationApi: ReservationApi
): ReservationDataSource {
    override suspend fun getDetailHomebaseReservation(reservationId: UUID): GetDetailHomebaseReservationResponse =
        HiApiHandler<GetDetailHomebaseReservationResponse>()
            .httpRequest { reservationApi.getDetailHomebaseReservation(reservationId) }
            .sendRequest()

    override suspend fun deleteHomebaseReservation(reservationId: UUID) =
        HiApiHandler<Unit>()
            .httpRequest { reservationApi.deleteHomebaseReservation(reservationId) }
            .sendRequest()

    override suspend fun patchHomebaseReservation(
        reservationId: UUID,
        body: patchHomebaseReservationRequest
    ) = HiApiHandler<Unit>()
            .httpRequest { reservationApi.patchHomebaseReservation(reservationId, body) }
            .sendRequest()

    override suspend fun patchRepresentative(
        reservationId: UUID,
        userId: UUID
    ) = HiApiHandler<Unit>()
            .httpRequest { reservationApi.patchRepresentative(reservationId, userId) }
            .sendRequest()

    override suspend fun deleteExitHomebaseReservation(reservationId: UUID) =
        HiApiHandler<Unit>()
            .httpRequest { reservationApi.deleteExitHomebaseReservation(reservationId) }
            .sendRequest()

    override suspend fun patchHomebaseReservationCheckStatus(
        reservationId: UUID,
        body: patchHomebaseReservationCheckStatusRequest
    ) = HiApiHandler<Unit>()
            .httpRequest { reservationApi.patchHomebaseReservationCheckStatus(reservationId, body) }
            .sendRequest()

    override suspend fun deleteAllHomebaseReservation() =
        HiApiHandler<Unit>()
            .httpRequest { reservationApi.deleteAllHomebaseReservation() }
            .sendRequest()
}