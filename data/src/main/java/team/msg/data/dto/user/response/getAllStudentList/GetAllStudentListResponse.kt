package team.msg.data.dto.user.response.getAllStudentList

import team.msg.domain.model.user.response.getAllStudentList.GetAllStudentListResponseModel
import java.util.UUID

data class GetAllStudentListResponse(
    val id: UUID,
    val email: String,
    val name: String,
    val grade: Int,
    val classNum: Int,
    val number: Int,
    val useStatus: String
)

fun GetAllStudentListResponse.asGetAllStudentListResponseModel() = GetAllStudentListResponseModel(
    id = id,
    email = email,
    name = name,
    grade = grade,
    classNum = classNum,
    number = number,
    useStatus = useStatus
)