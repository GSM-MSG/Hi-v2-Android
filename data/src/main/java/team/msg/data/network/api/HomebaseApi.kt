package team.msg.data.network.api

import retrofit2.http.Body
import retrofit2.http.DELETE
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Query
import team.msg.data.dto.homebase.request.postHomebaseReservation.postHomebaseReservationRequest
import team.msg.data.dto.homebase.response.getAllHomebaseReservation.GetAllHomebaseReservationResponse

interface HomebaseApi {
    @GET("homebase")
    suspend fun getAllHomebaseReservation(
        @Query("period") period: Int,
        @Query("floor") floor: Int
    ): GetAllHomebaseReservationResponse

    @POST("homebase")
    suspend fun postHomebaseReservation(
        @Query("period") period: Int,
        @Query("floor") floor: Int,
        @Body body: postHomebaseReservationRequest
    )

    @DELETE("homebase")
    suspend fun deletePeriodReservation(
        @Query("period") period: Int
    )
}