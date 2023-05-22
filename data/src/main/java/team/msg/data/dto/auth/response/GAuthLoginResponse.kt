package team.msg.data.dto.auth.response

data class GAuthLoginResponse(
    val accessToken: String,
    val refreshToken: String,
    val accessExp: String,
    val refreshExp: String
)
