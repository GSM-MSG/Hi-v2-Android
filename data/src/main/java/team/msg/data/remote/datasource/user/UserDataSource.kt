package team.msg.data.remote.datasource.user

import team.msg.data.dto.user.request.getUserInfo.GetUserInfoRequest
import team.msg.data.dto.user.request.modifyStudentStatus.ModifyStudentStatusRequest
import team.msg.data.dto.user.response.getAllStudentList.GetAllStudentListResponse
import team.msg.data.dto.user.response.getMyPageInfo.GetMyPageInfoResponse
import team.msg.data.dto.user.response.getUserInfo.GetUserInfoResponse
import java.util.UUID

interface UserDataSource {
    suspend fun getMyPageInfo(): GetMyPageInfoResponse

    suspend fun getAllStudentList(): List<GetAllStudentListResponse>

    suspend fun modifyStudentStatus(
        id: UUID,
        modifyStudentStatusRequest: ModifyStudentStatusRequest
    )

    suspend fun getUserInfo(getUserInfoRequest: GetUserInfoRequest): GetUserInfoResponse
}