package team.msg.data.network.api

import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.PATCH
import retrofit2.http.Path
import team.msg.data.dto.user.request.getUserInfo.GetUserInfoRequest
import team.msg.data.dto.user.request.modifyStudentStatus.ModifyStudentStatusRequest
import team.msg.data.dto.user.response.getUserInfo.GetUserInfoResponse
import team.msg.data.dto.user.response.getAllStudentList.GetAllStudentListResponse
import team.msg.data.dto.user.response.getMyPageInfo.GetMyPageInfoResponse
import java.util.UUID

interface UserApi {
    @GET("user")
    suspend fun getMyPageInfo(): GetMyPageInfoResponse

    @GET("user/student")
    suspend fun getAllStudentList(): List<GetAllStudentListResponse>

    @PATCH("user/{id}")
    suspend fun modifyStudentStatus(
        @Path("id") id: UUID,
        @Body body: ModifyStudentStatusRequest
    )

    @GET("user/search")
    suspend fun getUserInfo(
        @Body body: GetUserInfoRequest
    ): GetUserInfoResponse
}