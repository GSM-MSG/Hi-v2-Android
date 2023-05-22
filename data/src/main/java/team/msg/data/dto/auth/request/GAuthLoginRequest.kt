package team.msg.data.dto.auth.request

import kotlinx.serialization.Serializable

@Serializable
data class GAuthLoginRequest(
    val code: String
)
