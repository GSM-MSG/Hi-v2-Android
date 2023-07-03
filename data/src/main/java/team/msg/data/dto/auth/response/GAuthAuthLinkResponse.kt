package team.msg.data.dto.auth.response

import com.google.gson.annotations.SerializedName
import team.msg.domain.model.auth.response.GAuthAuthLinkResponseData

data class GAuthAuthLinkResponse(
    @SerializedName("authLink")
    val authLink: String
)

fun GAuthAuthLinkResponse.asGAuthAuthLinkResponseData() = GAuthAuthLinkResponseData(
    authLink = authLink
)