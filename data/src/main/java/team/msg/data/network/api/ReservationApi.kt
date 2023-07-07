package team.msg.data.network.api

import retrofit2.http.Body
import retrofit2.http.DELETE
import retrofit2.http.GET
import retrofit2.http.PATCH
import retrofit2.http.Path
import team.msg.data.dto.reservation.request.patchHomebaseReservation.patchHomebaseReservationRequest
import team.msg.data.dto.reservation.request.patchHomebaseReservationCheckStatus.patchHomebaseReservationCheckStatusRequest
import team.msg.data.dto.reservation.response.GetDetailHomebaseReservation.GetDetailHomebaseReservationResponse
import java.util.UUID

interface ReservationApi {
    @GET("reservation/{id}")
    suspend fun getDetailHomebaseReservation(
        @Path("id") reservationId: UUID
    ): GetDetailHomebaseReservationResponse

    @DELETE("reservation/{id}")
    suspend fun deleteHomebaseReservation(
        @Path("id") reservationId: UUID
    )

    @PATCH("reservation/{id}")
    suspend fun patchHomebaseReservation(
        @Path("id") reservationId: UUID,
        @Body body: patchHomebaseReservationRequest
    )

    @PATCH("reservation/{id}/{user_id}")
    suspend fun patchRepresentative(
        @Path("userId") userId: UUID
    )

    @DELETE("reservation/{id}/exit")
    suspend fun deleteExitHomebaseReservation(
        @Path("id") reservationId: UUID
    )

    @PATCH("reservation/{id}/check-status")
    suspend fun patchHomebaseReservationCheckStatus(
        @Path("id") reservationId: UUID,
        @Body body: patchHomebaseReservationCheckStatusRequest
    )

    @DELETE("reservation/kill-all")
    suspend fun deleteAllHomebaseReservation()
}