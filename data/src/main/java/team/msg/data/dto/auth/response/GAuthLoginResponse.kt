package team.msg.data.dto.auth.response

import com.google.gson.annotations.SerializedName
import kotlinx.serialization.Serializable
import team.msg.domain.model.auth.response.GAuthLoginResponseData

@Serializable
data class GAuthLoginResponse(
    @SerializedName("accessToken") val accessToken: String,
    @SerializedName("refreshToken") val refreshToken: String,
    @SerializedName("accessExp") val accessExp: String,
    @SerializedName("refreshExp") val refreshExp: String
)

fun GAuthLoginResponse.toLoginResponseData() =
    GAuthLoginResponseData(
        accessToken = this.accessToken,
        refreshToken = this.refreshToken,
        accessExp = this.accessExp,
        refreshExp = this.refreshExp
    )
