package team.msg.data.dto.notice.response.getDetailNotice

import team.msg.domain.model.notice.response.getDetailNotice.PathModel
import java.util.UUID

data class Path(
    val id: UUID
)

fun Path.asPathModel() = PathModel(id)
