package org.donmacond.anvil.core.ui.screens

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun InfoScreen(
    onInfoClick: () -> Unit
) {

    Box(
        modifier = Modifier.Companion
            .fillMaxSize()
            .padding(24.dp),
        contentAlignment = Alignment.Companion.Center
    ) {
        Column(horizontalAlignment = Alignment.Companion.CenterHorizontally) {
            Text("⚙️ Info", fontSize = 24.sp)
            Spacer(modifier = Modifier.Companion.height(16.dp))
            Button(
                onClick = {

            }) {
                Text("Назад на главный")
            }
        }
    }
}


@Preview(showBackground = true)
@Composable
fun InfoScreenPreview() {
    InfoScreen(onInfoClick = {})

}