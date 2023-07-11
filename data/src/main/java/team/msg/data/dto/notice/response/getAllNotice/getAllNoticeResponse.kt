package team.msg.data.dto.notice.response.getAllNotice

import team.msg.domain.model.notice.response.getAllNotice.GetAllNoticeResponseModel

data class getAllNoticeResponse(
    val notice: List<Notice>
)

fun getAllNoticeResponse.asGetAllNoticeResponseModel() = GetAllNoticeResponseModel(
    notice = notice.map { it.asNoticeModel() }
)