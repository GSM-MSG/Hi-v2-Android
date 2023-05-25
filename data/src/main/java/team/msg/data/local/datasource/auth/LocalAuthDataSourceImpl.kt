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
        it[stringPreferencesKey("access_token")] ?: ""
    }

    override suspend fun setAccessToken(accessToken: String) {
        dataSource.edit {
            it[stringPreferencesKey("access_token")] = accessToken
        }
    }

    override suspend fun getAccessExp(): Flow<String> = dataSource.data.map {
        it[stringPreferencesKey("access_exp")] ?: ""
    }

    override suspend fun setAccessExp(accessExp: String) {
        dataSource.edit {
            it[stringPreferencesKey("access_exp")] = accessExp
        }
    }

    override suspend fun getRefreshToken(): Flow<String> = dataSource.data.map {
        it[stringPreferencesKey("refresh_token")] ?: ""
    }

    override suspend fun setRefreshToken(refreshToken: String) {
        dataSource.edit {
            it[stringPreferencesKey("refresh_token")] = refreshToken
        }
    }

    override suspend fun getRefreshExp(): Flow<String> = dataSource.data.map {
        it[stringPreferencesKey("refresh_exp")] ?: ""
    }

    override suspend fun setRefreshExp(refreshExp: String) {
        dataSource.edit {
            it[stringPreferencesKey("refresh_exp")] = refreshExp
        }
    }

}