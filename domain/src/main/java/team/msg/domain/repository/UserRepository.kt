package team.msg.domain.repository

import team.msg.domain.model.user.request.GetUserInfo.GetUserInfoRequestModel
import team.msg.domain.model.user.request.modifyStudentStatus.ModifyStudentStatusRequestModel
import team.msg.domain.model.user.response.GetUserInfo.GetUserInfoResponseModel
import team.msg.domain.model.user.response.getAllStudentList.GetAllStudentListResponseModel
import team.msg.domain.model.user.response.getMyPageInfo.GetMyPageInfoResponseModel
import java.util.UUID

interface UserRepository {
    suspend fun getMyPageInfo(): GetMyPageInfoResponseModel

    suspend fun getAllStudentList(): List<GetAllStudentListResponseModel>

    suspend fun modifyStudentStatus(
        id: UUID,
        modifyStudentStatusRequestModel: ModifyStudentStatusRequestModel
    )

    suspend fun getUserInfo(getUserInfoRequestModel: GetUserInfoRequestModel): GetUserInfoResponseModel
}