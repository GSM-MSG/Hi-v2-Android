package team.msg.data.dto.auth.response

import com.google.gson.annotations.SerializedName

data class GAuthAuthLinkResponse(
    @SerializedName("authLink")
    val authLink: String
)
