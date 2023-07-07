package team.msg.data.remote.datasource.Reservation

import team.msg.data.dto.reservation.request.patchHomebaseReservation.patchHomebaseReservationRequest
import team.msg.data.dto.reservation.request.patchHomebaseReservationCheckStatus.patchHomebaseReservationCheckStatusRequest
import team.msg.data.dto.reservation.response.GetDetailHomebaseReservation.GetDetailHomebaseReservationResponse
import java.util.UUID

interface ReservationDataSource {
    suspend fun getDetailHomebaseReservation(reservationId: UUID): GetDetailHomebaseReservationResponse

    suspend fun deleteHomebaseReservation(reservationId: UUID)

    suspend fun patchHomebaseReservation(
        reservationId: UUID,
        body: patchHomebaseReservationRequest
    )

    suspend fun patchRepresentative(
        reservationId: UUID,
        userId: UUID
    )

    suspend fun deleteExitHomebaseReservation(reservationId: UUID)

    suspend fun patchHomebaseReservationCheckStatus(
        reservationId: UUID,
        body: patchHomebaseReservationCheckStatusRequest
    )

    suspend fun deleteAllHomebaseReservation()
}