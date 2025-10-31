package org.donmacond.anvil.core.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.airbnb.lottie.compose.LottieAnimation
import com.airbnb.lottie.compose.LottieCompositionSpec
import com.airbnb.lottie.compose.animateLottieCompositionAsState
import com.airbnb.lottie.compose.rememberLottieComposition

@Composable
fun HomeScreen( onConnectClick: () -> Unit) {

    Column(
        modifier = Modifier.Companion
            .fillMaxSize()
            .padding(bottom = 140.dp)
            .background(MaterialTheme.colorScheme.background)
            .statusBarsPadding(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.Companion.CenterHorizontally,
    ) {
        AnimationButtonConnectVpn(
            assetFileName = "lottie/ButtonActivateVpnFire.json",
            onClick = onConnectClick
        )
    }
}

@Composable
fun AnimationButtonConnectVpn(
    modifier: Modifier = Modifier.Companion,
    onClick: () -> Unit,
    assetFileName: String,

    ) {
    val composition by rememberLottieComposition(
        LottieCompositionSpec.Asset(assetFileName)
    )
    var isPlaying by remember { mutableStateOf(false) }


    val progressAnimation by animateLottieCompositionAsState(
        composition = composition,
        isPlaying = isPlaying,
        iterations = 1,
        speed = if (isPlaying) 1f else -1f,

        )

    Box(
        modifier = modifier
            .size(150.dp)
            .clip(CircleShape)
            .background(MaterialTheme.colorScheme.primaryContainer)
            .clickable {

                onClick()
            },
        contentAlignment = Alignment.Companion.Center
    ) {
        LottieAnimation(
            composition = composition,
            progress = { progressAnimation },
            modifier = Modifier.Companion.fillMaxSize(),

            )
    }
}


@Preview(showSystemUi = true)
@Composable
fun HomeScreenPreview() {
    HomeScreen(
        onConnectClick = {   }
    )
}