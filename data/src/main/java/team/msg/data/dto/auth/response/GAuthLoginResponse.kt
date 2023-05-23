package team.msg.data.dto.auth.response

import com.google.gson.annotations.SerializedName
import kotlinx.serialization.Serializable

@Serializable
data class GAuthLoginResponse(
    @SerializedName("accessToken") val accessToken: String,
    @SerializedName("refreshToken") val refreshToken: String,
    @SerializedName("accessExp") val accessExp: String,
    @SerializedName("refreshExp") val refreshExp: String
)
