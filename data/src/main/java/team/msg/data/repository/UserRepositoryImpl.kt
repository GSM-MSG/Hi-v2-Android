package team.msg.data.repository

import team.msg.data.dto.user.request.getUserInfo.asGetUserInfoRequest
import team.msg.data.dto.user.request.modifyStudentStatus.asModifyStudentStatusRequest
import team.msg.data.dto.user.response.getAllStudentList.asGetAllStudentListResponseModel
import team.msg.data.dto.user.response.getMyPageInfo.asGetMyPageInfoResponseModel
import team.msg.data.dto.user.response.getUserInfo.asGetUserInfoResponseModel
import team.msg.data.remote.datasource.user.UserDataSource
import team.msg.domain.model.user.request.GetUserInfo.GetUserInfoRequestModel
import team.msg.domain.model.user.request.modifyStudentStatus.ModifyStudentStatusRequestModel
import team.msg.domain.model.user.response.GetUserInfo.GetUserInfoResponseModel
import team.msg.domain.model.user.response.getAllStudentList.GetAllStudentListResponseModel
import team.msg.domain.model.user.response.getMyPageInfo.GetMyPageInfoResponseModel
import team.msg.domain.repository.UserRepository
import java.util.UUID
import javax.inject.Inject

class UserRepositoryImpl @Inject constructor(
    private val userDataSource: UserDataSource
): UserRepository {
    override suspend fun getMyPageInfo(): GetMyPageInfoResponseModel =
        userDataSource.getMyPageInfo().asGetMyPageInfoResponseModel()

    override suspend fun getAllStudentList(): List<GetAllStudentListResponseModel> =
        userDataSource.getAllStudentList().map { it.asGetAllStudentListResponseModel() }

    override suspend fun modifyStudentStatus(
        id: UUID,
        modifyStudentStatusRequestModel: ModifyStudentStatusRequestModel
    ) = userDataSource.modifyStudentStatus(id, modifyStudentStatusRequestModel.asModifyStudentStatusRequest())

    override suspend fun getUserInfo(getUserInfoRequestModel: GetUserInfoRequestModel): GetUserInfoResponseModel =
        userDataSource.getUserInfo(getUserInfoRequestModel.asGetUserInfoRequest()).asGetUserInfoResponseModel()
}