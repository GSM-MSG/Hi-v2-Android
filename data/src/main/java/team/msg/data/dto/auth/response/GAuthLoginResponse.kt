package team.msg.data.dto.auth.response

import kotlinx.serialization.Serializable

@Serializable
data class GAuthLoginResponse(
    val accessToken: String,
    val refreshToken: String,
    val accessExp: String,
    val refreshExp: String
)
