package team.msg.data.dto.auth.request

import com.google.gson.annotations.SerializedName
import kotlinx.serialization.Serializable

@Serializable
data class GAuthLoginRequest(
    @SerializedName("code") val code: String
)
