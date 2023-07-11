package team.msg.hi_v2.modules

import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import team.msg.data.repository.AuthRepositoryImpl
import team.msg.data.repository.HomebaseRepositoryImpl
import team.msg.data.repository.NoticeRepositoryImpl
import team.msg.data.repository.ReservationRepositoryImpl
import team.msg.data.repository.UserRepositoryImpl
import team.msg.domain.repository.AuthRepository
import team.msg.domain.repository.HomebaseRepository
import team.msg.domain.repository.NoticeRepository
import team.msg.domain.repository.ReservationRepository
import team.msg.domain.repository.UserRepository

@Module
@InstallIn(SingletonComponent::class)
abstract class RepositoryModule {
    @Binds
    abstract fun bindsAuthRepository(
        authRepositoryImpl: AuthRepositoryImpl
    ): AuthRepository

    @Binds
    abstract fun bindsUserRepository(
        userRepositoryImpl: UserRepositoryImpl
    ): UserRepository

    @Binds
    abstract fun bindsHomebaseRepository(
        homebaseRepositoryImpl: HomebaseRepositoryImpl
    ): HomebaseRepository

    @Binds
    abstract fun bindsReservationRepository(
        reservationRepositoryImpl: ReservationRepositoryImpl
    ): ReservationRepository

    @Binds
    abstract fun bindsNoticeRepository(
        noticeRepositoryImpl: NoticeRepositoryImpl
    ): NoticeRepository
}