package team.msg.hi_v2.modules

import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import team.msg.data.remote.datasource.auth.AuthDataSource
import team.msg.data.remote.datasource.auth.AuthDataSourceImpl
import team.msg.data.remote.datasource.homebase.HomebaseDataSource
import team.msg.data.remote.datasource.homebase.HomebaseDataSourceImpl
import team.msg.data.remote.datasource.user.UserDataSource
import team.msg.data.remote.datasource.user.UserDataSourceImpl

@Module
@InstallIn(SingletonComponent::class)
abstract class DataSourceModule {
    @Binds
    abstract fun bindsAuthDataSource(
        authDataSourceImpl: AuthDataSourceImpl
    ): AuthDataSource

    @Binds
    abstract fun bindsUserDataSource(
        userDataSourceImpl: UserDataSourceImpl
    ): UserDataSource

    @Binds
    abstract fun bindsHomebaseDataSource(
        homebaseDataSourceImpl: HomebaseDataSourceImpl
    ): HomebaseDataSource
}