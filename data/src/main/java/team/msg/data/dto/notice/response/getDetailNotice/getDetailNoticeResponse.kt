package team.msg.data.dto.notice.response.getDetailNotice

import team.msg.domain.model.notice.response.getDetailNotice.GetDetailNoticeResponseModel

data class getDetailNoticeResponse(
    val path: Path,
    val body: DetailNotice
)

fun getDetailNoticeResponse.asGetDetailNoticeResponseModel() = GetDetailNoticeResponseModel(
    path = path.asPathModel(),
    body = body.asDetailNoticeModel()
)