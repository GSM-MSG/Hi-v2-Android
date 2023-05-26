package team.msg.data.local.datasource.auth

import kotlinx.coroutines.flow.Flow

interface LocalAuthDataSource {

    suspend fun getAccessToken(): Flow<String>
    suspend fun setAccessToken(accessToken: String)

    suspend fun getAccessExp(): Flow<String>
    suspend fun setAccessExp(accessExp: String)

    suspend fun getRefreshToken(): Flow<String>
    suspend fun setRefreshToken(refreshToken: String)

    suspend fun getRefreshExp(): Flow<String>
    suspend fun setRefreshExp(refreshExp: String)

    suspend fun saveTokenInfo(
        accessToken: String,
        refreshToken: String,
        accessExp: String,
        refreshExp: String,
    )

}