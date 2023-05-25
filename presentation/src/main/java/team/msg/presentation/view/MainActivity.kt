package team.msg.presentation.view

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.msg.gauthsignin.GAuthSigninWebView
import com.msg.gauthsignin.component.GAuthButton
import com.msg.gauthsignin.component.utils.Types
import dagger.hilt.android.AndroidEntryPoint
import team.msg.presentation.BuildConfig
import team.msg.presentation.R
import team.msg.presentation.viewmodel.LoginViewModel

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    private val loginViewModel by viewModels<LoginViewModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LoginScreen()
        }
    }

    @Composable
    fun LoginScreen(modifier: Modifier = Modifier) {
        Column(
            modifier = modifier
                .fillMaxWidth()
                .padding(horizontal = 20.dp)
        ) {
            Spacer(modifier.height(28.dp))
            Image(
                painter = painterResource(R.drawable.hi_logo),
                contentDescription = "Hi-v2 Logo",
                modifier = modifier.size(24.dp, 31.dp)
            )
            Spacer(modifier.height(28.dp))
            Text(
                "반가워요!",
                fontSize = 32.sp,
                fontWeight = FontWeight.Bold
            )
            Spacer(modifier.height(12.dp))
            Text(
                "불편했던 홈베이스 신청,\nHi에서 온라인으로 쉽게 해 보아요!",
                fontSize = 16.sp,
                fontWeight = FontWeight.Medium,
                color = Color(0xFF999999)
            )
            Spacer(modifier.height(20.dp))
            Image(
                painterResource(R.drawable.login_bg),
                contentDescription = "login_bg"
            )
            Spacer(modifier.weight(1f))
            Column(
                modifier = modifier.fillMaxWidth(),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                GAuthButton(
                    style = Types.Style.DEFAULT,
                    actionType = Types.ActionType.SIGNIN,
                    colors = Types.Colors.COLORED,
                    horizontalPaddingValue = 76.dp
                ) {
                    setContent {
                        GAuthSigninWebView(
                            clientId = BuildConfig.CLIENT_ID,
                            redirectUri = BuildConfig.REDIRECT_URI
                        ) {
                            loginViewModel.gAuthLogin(it)
                        }
                    }
                }
                Spacer(modifier.height(12.dp))
                Text(
                    "서비스 이용약관 | 개인정보 처리 방침",
                    fontSize = 12.sp,
                    fontWeight = FontWeight.Normal,
                    color = Color(0xFF999999)
                )
                Spacer(modifier.height(28.dp))
            }
        }
    }
}


