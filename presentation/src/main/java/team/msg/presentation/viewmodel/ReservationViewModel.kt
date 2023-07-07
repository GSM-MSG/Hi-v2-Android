package team.msg.presentation.viewmodel

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import team.msg.domain.model.reservation.request.patchHomebaseReservation.patchHomebaseReservationRequestModel
import team.msg.domain.model.reservation.request.patchHomebaseReservationCheckStatus.patchHomebaseReservationCheckStatusRequestModel
import team.msg.domain.usecase.reservation.DeleteAllHomebaseReservationUseCase
import team.msg.domain.usecase.reservation.DeleteExitHomebaseReservationUseCase
import team.msg.domain.usecase.reservation.DeleteHomebaseReservationUseCase
import team.msg.domain.usecase.reservation.GetDetailHomebaseReservationUseCase
import team.msg.domain.usecase.reservation.PatchHomebaseReservationCheckStatusUseCase
import team.msg.domain.usecase.reservation.PatchHomebaseReservationUseCase
import team.msg.domain.usecase.reservation.PatchRepresentativeUseCase
import java.util.UUID
import javax.inject.Inject

@HiltViewModel
class ReservationViewModel @Inject constructor(
    private val deleteAllHomebaseReservationUseCase: DeleteAllHomebaseReservationUseCase,
    private val deleteExitHomebaseReservationUseCase: DeleteExitHomebaseReservationUseCase,
    private val deleteHomebaseReservationUseCase: DeleteHomebaseReservationUseCase,
    private val getDetailHomebaseReservationUseCase: GetDetailHomebaseReservationUseCase,
    private val patchHomebaseReservationCheckStatusUseCase: PatchHomebaseReservationCheckStatusUseCase,
    private val patchHomebaseReservationUseCase: PatchHomebaseReservationUseCase,
    private val patchRepresentativeUseCase: PatchRepresentativeUseCase
) : ViewModel() {
    fun deleteAllHomebaseReservation() = viewModelScope.launch {
        deleteAllHomebaseReservationUseCase()
            .onSuccess {
                Log.d("Success", "deleteAllHomebaseReservation: $it")
            }
            .onFailure {
                Log.d("Failure", "deleteAllHomebaseReservation: ${it.message}")
            }
    }

    fun deleteExitHomebaseReservation(reservationId: UUID) = viewModelScope.launch {
        deleteExitHomebaseReservationUseCase(reservationId)
            .onSuccess {
                Log.d("Success", "deleteExitHomebaseReservation: $it")
            }
            .onFailure {
                Log.d("Failure", "deleteExitHomebaseReservation: ${it.message}")
            }
    }

    fun deleteHomebaseReservation(reservationId: UUID) = viewModelScope.launch {
        deleteHomebaseReservationUseCase(reservationId)
            .onSuccess {
                Log.d("Success", "deleteHomebaseReservation: $it")
            }
            .onFailure {
                Log.d("Failure", "deleteHomebaseReservation: ${it.message}")
            }
    }

    fun getDetailHomebaseReservation(reservationId: UUID) = viewModelScope.launch {
        getDetailHomebaseReservationUseCase(reservationId)
            .onSuccess {
                Log.d("Success", "getDetailHomebaseReservation: $it")
            }
            .onFailure {
                Log.d("Failure", "getDetailHomebaseReservation: ${it.message}")
            }
    }

    fun patchHomebaseReservationCheckStatus(
        reservationId: UUID,
        body: patchHomebaseReservationCheckStatusRequestModel
    ) = viewModelScope.launch {
        patchHomebaseReservationCheckStatusUseCase(
            reservationId = reservationId,
            body = body
        )
            .onSuccess {
                Log.d("Success", "patchHomebaseReservationCheckStatus: $it")
            }
            .onFailure {
                Log.d("Failure", "patchHomebaseReservationCheckStatus: ${it.message}")
            }
    }

    fun patchHomebaseReservation(
        reservationId: UUID,
        body: patchHomebaseReservationRequestModel
    ) = viewModelScope.launch {
        patchHomebaseReservationUseCase(
            reservationId = reservationId,
            body = body
        )
            .onSuccess {
                Log.d("Success", "patchHomebaseReservation: $it")
            }
            .onFailure {
                Log.d("Failure", "patchHomebaseReservation: ${it.message}")
            }
    }

    fun patchRepresentative(
        reservationId: UUID,
        userId: UUID
    ) = viewModelScope.launch {
        patchRepresentativeUseCase(
            reservationId = reservationId,
            userId = userId
        )
            .onSuccess {
                Log.d("Success", "patchRepresentative: $it")
            }
            .onFailure {
                Log.d("Failure", "patchRepresentative: $it")
            }
    }
}