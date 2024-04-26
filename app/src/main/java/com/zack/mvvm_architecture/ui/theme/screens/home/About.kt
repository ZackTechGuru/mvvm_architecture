package com.zack.mvvm_architecture.ui.theme.screens.home

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.OutlinedIconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp

@Composable
fun HomeScreen() {
    Column (horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Blue)
    ){
        Text(text = "This is a homepage",
            color = Color.Red,
            fontFamily = FontFamily.SansSerif,
            fontSize = 30.sp)

        OutlinedIconButton(onClick = { /*TODO*/ },
            modifier = Modifier
                .fillMaxWidth()
                .background(color = Color.Red)) {
            Text(text = "About")

        }
    }

}
@Preview
@Composable
private fun Homeprev(){
    HomeScreen()
}