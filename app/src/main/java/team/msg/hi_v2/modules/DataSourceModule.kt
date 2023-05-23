package team.msg.hi_v2.modules

import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import team.msg.data.remote.datasource.auth.AuthDataSource
import team.msg.data.remote.datasource.auth.AuthDataSourceImpl

@Module
@InstallIn(SingletonComponent::class)
abstract class DataSourceModule {
    @Binds
    abstract fun bindsAuthDataSource(
        authDataSourceImpl: AuthDataSourceImpl
    ): AuthDataSource
}