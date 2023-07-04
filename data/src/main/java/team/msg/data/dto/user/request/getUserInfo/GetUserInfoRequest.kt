package team.msg.data.dto.user.request.getUserInfo

import team.msg.domain.model.user.request.GetUserInfo.GetUserInfoRequestModel

data class GetUserInfoRequest(
    val keyword: String
)

fun GetUserInfoRequestModel.asGetUserInfoRequest() = GetUserInfoRequest(
    keyword = keyword
)
