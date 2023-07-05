package team.msg.presentation.viewmodel

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import team.msg.domain.model.user.request.GetUserInfo.GetUserInfoRequestModel
import team.msg.domain.model.user.request.modifyStudentStatus.ModifyStudentStatusRequestModel
import team.msg.domain.usecase.user.GetAllStudentListUseCase
import team.msg.domain.usecase.user.GetMyPageInfoUseCase
import team.msg.domain.usecase.user.GetUserInfoUseCase
import team.msg.domain.usecase.user.ModifyStudentStatusUseCase
import java.util.UUID
import javax.inject.Inject

@HiltViewModel
class UserViewModel @Inject constructor(
    private val getAllStudentListUseCase: GetAllStudentListUseCase,
    private val getMyPageInfoUseCase: GetMyPageInfoUseCase,
    private val getUserInfoUseCase: GetUserInfoUseCase,
    private val modifyStudentStatusUseCase: ModifyStudentStatusUseCase
): ViewModel() {
    fun getMyPageInfo() = viewModelScope.launch {
        getMyPageInfoUseCase()
            .onSuccess {
                Log.d("Success", "getMyPageInfo: $it")
            }
            .onFailure {
                Log.d("Failure", "getMyPageInfo: ${it.message}")
            }
    }

    fun getAllStudentList() = viewModelScope.launch {
        getAllStudentListUseCase()
            .onSuccess {
                Log.d("Success", "getAllStudentList: $it")
            }
            .onFailure {
                Log.d("Failure", "getAllStudentList: ${it.message}")
            }
    }

    fun getUserInfo(getUserInfoRequestModel: GetUserInfoRequestModel) = viewModelScope.launch {
        getUserInfoUseCase(getUserInfoRequestModel)
            .onSuccess {
                Log.d("Success", "getUserInfo: $it")
            }
            .onFailure {
                Log.d("Failure", "getUserInfo: $it")
            }
    }

    fun modifyStudentStatus(
        id: UUID,
        modifyStudentStatusRequestModel: ModifyStudentStatusRequestModel
    ) = viewModelScope.launch {
        modifyStudentStatusUseCase(id, modifyStudentStatusRequestModel)
            .onSuccess {
                Log.d("Success", "modifyStudentStatus: $it")
            }
            .onFailure {
                Log.d("Failure", "modifyStudentStatus: ${it.message}")
            }
    }
}