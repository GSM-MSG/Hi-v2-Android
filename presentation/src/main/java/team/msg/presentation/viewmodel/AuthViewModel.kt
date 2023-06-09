package team.msg.presentation.viewmodel

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import team.msg.domain.model.auth.request.GAuthLoginRequestData
import team.msg.domain.usecase.auth.GAuthLoginUseCase
import team.msg.domain.usecase.auth.LogoutUseCase
import team.msg.domain.usecase.auth.SaveTokenInfoUseCase
import javax.inject.Inject

@HiltViewModel
class AuthViewModel @Inject constructor(
    private val gAuthLoginUseCase: GAuthLoginUseCase,
    private val saveTokenInfoUseCase: SaveTokenInfoUseCase,
    private val logoutUseCase: LogoutUseCase
): ViewModel() {
    fun gAuthLogin(code: String) = viewModelScope.launch {
        gAuthLoginUseCase(GAuthLoginRequestData(code))
            .onSuccess {
            saveTokenInfoUseCase(
                accessToken = it.accessToken,
                refreshToken = it.refreshToken,
                accessExp = it.accessExp,
                refreshExp = it.refreshExp
            )
        }.onFailure {
            Log.d("Failure", "gAuthLogin: ${it.message}")
        }
    }

    fun logout() = viewModelScope.launch {
        logoutUseCase()
            .onSuccess {
                Log.d("Success", "logout: $it")
            }
            .onFailure {
                Log.d("Failure", "logout: ${it.message}")
            }
    }
}