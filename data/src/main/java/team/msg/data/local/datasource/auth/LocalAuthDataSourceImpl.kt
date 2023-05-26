package team.msg.data.local.datasource.auth

import androidx.datastore.core.DataStore
import androidx.datastore.preferences.core.Preferences
import androidx.datastore.preferences.core.edit
import androidx.datastore.preferences.core.stringPreferencesKey
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map
import javax.inject.Inject

class LocalAuthDataSourceImpl @Inject constructor(
    private val dataSource: DataStore<Preferences>
): LocalAuthDataSource {

    override suspend fun getAccessToken(): Flow<String> = dataSource.data.map {
        it[stringPreferencesKey("accessToken")] ?: ""
    }

    override suspend fun setAccessToken(accessToken: String) {
        dataSource.edit {
            it[stringPreferencesKey("accessToken")] = accessToken
        }
    }

    override suspend fun getAccessExp(): Flow<String> = dataSource.data.map {
        it[stringPreferencesKey("accessExpiredAt")] ?: ""
    }

    override suspend fun setAccessExp(accessExp: String) {
        dataSource.edit {
            it[stringPreferencesKey("accessExpiredAt")] = accessExp
        }
    }

    override suspend fun getRefreshToken(): Flow<String> = dataSource.data.map {
        it[stringPreferencesKey("refreshToken")] ?: ""
    }

    override suspend fun setRefreshToken(refreshToken: String) {
        dataSource.edit {
            it[stringPreferencesKey("refreshToken")] = refreshToken
        }
    }

    override suspend fun getRefreshExp(): Flow<String> = dataSource.data.map {
        it[stringPreferencesKey("refreshExpiredAt")] ?: ""
    }

    override suspend fun setRefreshExp(refreshExp: String) {
        dataSource.edit {
            it[stringPreferencesKey("refreshExpiredAt")] = refreshExp
        }
    }

    override suspend fun saveTokenInfo(
        accessToken: String,
        refreshToken: String,
        accessExp: String,
        refreshExp: String,
    ) {
        dataSource.run {
            setAccessToken(accessToken)
            setRefreshToken(refreshToken)
            setAccessExp(accessExp)
            setRefreshExp(refreshExp)
        }
    }

}