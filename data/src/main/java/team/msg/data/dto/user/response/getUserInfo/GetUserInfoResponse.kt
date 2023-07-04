package team.msg.data.dto.user.response.getUserInfo

import team.msg.domain.model.user.response.GetUserInfo.GetUserInfoResponseModel

data class GetUserInfoResponse(
    val members: List<Members>
)

fun GetUserInfoResponse.asGetUserInfoResponseModel() = GetUserInfoResponseModel(
    membersModel = members.map { it.asMembersModel() }
)