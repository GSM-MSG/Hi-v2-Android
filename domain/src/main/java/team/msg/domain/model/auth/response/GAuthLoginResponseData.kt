package team.msg.domain.model.auth.response

data class GAuthLoginResponseData(
    val accessToken: String,
    val refreshToken: String,
    val accessExp: String,
    val refreshExp: String
)