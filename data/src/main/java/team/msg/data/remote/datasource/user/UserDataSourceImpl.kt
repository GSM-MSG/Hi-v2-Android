package team.msg.data.remote.datasource.user

import team.msg.data.dto.user.request.getUserInfo.GetUserInfoRequest
import team.msg.data.dto.user.request.modifyStudentStatus.ModifyStudentStatusRequest
import team.msg.data.dto.user.response.getAllStudentList.GetAllStudentListResponse
import team.msg.data.dto.user.response.getMyPageInfo.GetMyPageInfoResponse
import team.msg.data.dto.user.response.getUserInfo.GetUserInfoResponse
import team.msg.data.network.api.UserApi
import team.msg.data.util.HiApiHandler
import java.util.UUID
import javax.inject.Inject

class UserDataSourceImpl @Inject constructor(
    private val userApi: UserApi
): UserDataSource {
    override suspend fun getMyPageInfo(): GetMyPageInfoResponse =
        HiApiHandler<GetMyPageInfoResponse>()
            .httpRequest { userApi.getMyPageInfo() }
            .sendRequest()

    override suspend fun getAllStudentList(): List<GetAllStudentListResponse> =
        HiApiHandler<List<GetAllStudentListResponse>>()
            .httpRequest { userApi.getAllStudentList() }
            .sendRequest()

    override suspend fun modifyStudentStatus(
        id: UUID,
        modifyStudentStatusRequest: ModifyStudentStatusRequest
    ) = HiApiHandler<Unit>()
        .httpRequest { userApi.modifyStudentStatus(id, modifyStudentStatusRequest) }
        .sendRequest()

    override suspend fun getUserInfo(getUserInfoRequest: GetUserInfoRequest): GetUserInfoResponse =
        HiApiHandler<GetUserInfoResponse>()
            .httpRequest { userApi.getUserInfo(getUserInfoRequest) }
            .sendRequest()
}