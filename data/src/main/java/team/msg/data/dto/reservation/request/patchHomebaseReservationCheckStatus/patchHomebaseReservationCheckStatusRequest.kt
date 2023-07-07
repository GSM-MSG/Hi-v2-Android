package team.msg.data.dto.reservation.request.patchHomebaseReservationCheckStatus

import team.msg.domain.model.reservation.request.patchHomebaseReservationCheckStatus.patchHomebaseReservationCheckStatusRequestModel

data class patchHomebaseReservationCheckStatusRequest(
    val checkStatus: Boolean
)

fun patchHomebaseReservationCheckStatusRequestModel.aspatchHomebaseReservationCheckStatusRequest() = patchHomebaseReservationCheckStatusRequest(
    checkStatus = checkStatus
)