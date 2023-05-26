package team.msg.design_system.theme

import androidx.compose.runtime.Stable
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import team.msg.design_system.R

object HiTypography {
    private val pretendard = FontFamily(
        Font(R.font.pretendard_extralight, FontWeight.ExtraLight),
        Font(R.font.pretendard_thin, FontWeight.Thin),
        Font(R.font.pretendard_light, FontWeight.Light),
        Font(R.font.pretendard_regular, FontWeight.Normal),
        Font(R.font.pretendard_medium, FontWeight.Medium),
        Font(R.font.pretendard_bold, FontWeight.Bold),
        Font(R.font.pretendard_semibold, FontWeight.SemiBold),
        Font(R.font.pretendard_extrabold, FontWeight.ExtraBold),
        Font(R.font.pretendard_black, FontWeight.Black)
    )

}