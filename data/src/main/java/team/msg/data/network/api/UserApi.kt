package team.msg.data.network.api

import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.PATCH
import retrofit2.http.Path
import team.msg.data.dto.user.request.SearchStudentRequest
import team.msg.data.dto.user.request.StudentStatusRequest
import team.msg.data.dto.user.response.SearchStudentResponse
import team.msg.data.dto.user.response.StudentResponse
import team.msg.data.dto.user.response.UserResponse
import java.util.UUID

interface UserApi {
    @GET("user")
    suspend fun getMyPageInfo(): UserResponse

    @GET("user/student")
    suspend fun getAllStudentList(): List<StudentResponse>

    @PATCH("user/{id}")
    suspend fun modifyStudentStatus(
        @Path("id") id: UUID,
        @Body body: StudentStatusRequest
    )

    @GET("user/search")
    suspend fun getUserInfo(
        @Body body: SearchStudentRequest
    ): SearchStudentResponse
}