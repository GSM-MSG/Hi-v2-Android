package team.msg.presentation.viewmodel

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import team.msg.domain.model.homebase.request.postHomebaseReservation.postHomebaseReservationRequestModel
import team.msg.domain.usecase.homebase.DeletePeriodReservationUseCase
import team.msg.domain.usecase.homebase.GetAllHomebaseReservationUseCase
import team.msg.domain.usecase.homebase.PostHomebaseReservationUseCase
import javax.inject.Inject
import kotlin.math.log

@HiltViewModel
class HomebaseViewModel @Inject constructor(
    private val getAllHomebaseReservationUseCase: GetAllHomebaseReservationUseCase,
    private val postHomebaseReservationUseCase: PostHomebaseReservationUseCase,
    private val deletePeriodReservationUseCase: DeletePeriodReservationUseCase
) : ViewModel() {
    fun getAllHomebaseReservation(
        period: Int,
        floor: Int
    ) {
        viewModelScope.launch {
            getAllHomebaseReservationUseCase(period, floor)
                .onSuccess {
                    Log.d("Success", "getAllHomebaseReservation: $it")
                }
                .onFailure {
                    Log.d("Failure", "getAllHomebaseReservation: ${it.message}")
                }
        }
    }

    fun postHomebaseReservation(
        period: Int,
        floor: Int,
        body: postHomebaseReservationRequestModel
    ) {
        viewModelScope.launch {
            postHomebaseReservationUseCase(period, floor, body)
                .onSuccess {
                    Log.d("Success", "postHomebaseReservation: $it")
                }
                .onFailure {
                    Log.d("Failure", "postHomebaseReservation: ${it.message}")
                }
        }
    }

    fun deletePeriodReservation(period: Int) {
        viewModelScope.launch {
            deletePeriodReservationUseCase(period)
                .onSuccess {
                    Log.d("Success", "deletePeriodReservation: $it")
                }
                .onFailure {
                    Log.d("Failure", "deletePeriodReservation: ${it.message}")
                }
        }
    }
}