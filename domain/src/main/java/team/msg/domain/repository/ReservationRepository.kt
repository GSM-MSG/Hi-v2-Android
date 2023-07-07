package team.msg.domain.repository

import team.msg.domain.model.reservation.request.patchHomebaseReservation.patchHomebaseReservationRequestModel
import team.msg.domain.model.reservation.request.patchHomebaseReservationCheckStatus.patchHomebaseReservationCheckStatusRequestModel
import team.msg.domain.model.reservation.response.getDetailHomebaseReservation.GetDetailHomebaseReservationResponseModel
import java.util.UUID

interface ReservationRepository {
    suspend fun getDetailHomebaseReservation(reservationId: UUID): GetDetailHomebaseReservationResponseModel

    suspend fun deleteHomebaseReservation(reservationId: UUID)

    suspend fun patchHomebaseReservation(
        reservationId: UUID,
        body: patchHomebaseReservationRequestModel
    )

    suspend fun patchRepresentative(
        reservationId: UUID,
        userId: UUID
    )

    suspend fun deleteExitHomebaseReservation(reservationId: UUID)

    suspend fun patchHomebaseReservationCheckStatus(
        reservationId: UUID,
        body: patchHomebaseReservationCheckStatusRequestModel
    )

    suspend fun deleteAllHomebaseReservation()
}