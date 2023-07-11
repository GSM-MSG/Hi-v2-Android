package team.msg.presentation.viewmodel

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import team.msg.domain.model.notice.request.postNotice.PostNoticeRequestModel
import team.msg.domain.usecase.notice.DeleteNoticeUseCase
import team.msg.domain.usecase.notice.GetDetailNoticeUseCase
import team.msg.domain.usecase.notice.PatchNoticeUseCase
import team.msg.domain.usecase.notice.PostNoticeUseCase
import java.util.UUID
import javax.inject.Inject

@HiltViewModel
class NoticeViewModel @Inject constructor(
    private val deleteNoticeUseCase: DeleteNoticeUseCase,
    private val getAllNoticeUseCase: DeleteNoticeUseCase,
    private val getDetailNoticeUseCase: GetDetailNoticeUseCase,
    private val patchNoticeUseCase: PatchNoticeUseCase,
    private val postNoticeUseCase: PostNoticeUseCase
): ViewModel() {
    fun deleteNotice(noticeId: UUID) = viewModelScope.launch {
        deleteNoticeUseCase(noticeId)
            .onSuccess {
                Log.d("Success", "deleteNotice: $it")
            }
            .onFailure {
                Log.d("Failure", "deleteNotice: ${it.message}")
            }
    }

    fun getAllNotice(noticeId: UUID) = viewModelScope.launch {
        getAllNoticeUseCase(noticeId)
            .onSuccess {
                Log.d("Success", "getAllNotice: $it")
            }
            .onFailure {
                Log.d("Failure", "getAllNotice: ${it.message}")
            }
    }

    fun getDetailNotice(noticeId: UUID) = viewModelScope.launch {
        getDetailNoticeUseCase(noticeId)
            .onSuccess {
                Log.d("Success", "getDetailNotice: $it")
            }
            .onFailure {
                Log.d("Failure", "getDetailNotice: ${it.message}")
            }
    }

    fun patchNotice(
        noticeId: UUID,
        body: PostNoticeRequestModel
    ) = viewModelScope.launch {
        patchNoticeUseCase(
            noticeId = noticeId,
            body = body
        )
            .onSuccess {
                Log.d("Success", "patchNotice: $it")
            }
            .onFailure {
                Log.d("Failure", "patchNotice: ${it.message}")
            }
    }

    fun postNotice(body: PostNoticeRequestModel) = viewModelScope.launch {
        postNoticeUseCase(body)
            .onSuccess {
                Log.d("Success", "postNotice: $it")
            }
            .onFailure {
                Log.d("Failure", "postNotice: ${it.message}")
            }
    }
}