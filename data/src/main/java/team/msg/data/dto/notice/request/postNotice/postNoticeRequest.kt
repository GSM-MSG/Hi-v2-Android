package team.msg.data.dto.notice.request.postNotice

import team.msg.domain.model.notice.request.postNotice.PostNoticeRequestModel

data class postNoticeRequest(
    val title: String,
    val content: String
)

fun PostNoticeRequestModel.asPostNoticeRequest() = postNoticeRequest(
    title = title,
    content = content
)