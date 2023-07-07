package team.msg.data.network.api

import retrofit2.http.Body
import retrofit2.http.DELETE
import retrofit2.http.GET
import retrofit2.http.PATCH
import retrofit2.http.POST
import retrofit2.http.Path
import team.msg.data.dto.notice.request.postNotice.postNoticeRequest
import team.msg.data.dto.notice.response.getAllNotice.getAllNoticeResponse
import team.msg.data.dto.notice.response.getDetailNotice.getDetailNoticeResponse
import java.util.UUID

interface NoticeApi {
    @POST("notice")
    suspend fun postNotice(
        @Body body: postNoticeRequest
    )

    @GET("notice")
    suspend fun getAllNotice(): getAllNoticeResponse

    @GET("notice/{id}")
    suspend fun getDetailNotice(
        @Path("id") noticeId: UUID
    ): getDetailNoticeResponse

    @DELETE("notice/{id}")
    suspend fun deleteNotice(
        @Path("id") noticeId: UUID
    )

    @PATCH("notice/{id}")
    suspend fun patchNotice(
        @Path("id") noticeId: UUID,
        @Body body: postNoticeRequest
    )
}