package com.zack.mvvm_architecture.ui.theme.screens.signin

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun SignIn() {

    Column (horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Magenta)
            ) {
        Text(text = "WELCOME TO OUR APP",
            fontFamily = FontFamily.Monospace,
            fontSize = 30.sp,
            color = Color.White)
        Spacer(modifier = Modifier.height(70.dp))
        Text(text = "Fresh food for every one",
            fontFamily = FontFamily.Monospace,
            fontSize = 20.sp,
            color = Color.White)
        Spacer(modifier = Modifier.height(30.dp))
        Text(text = "Join our hungry community! Sign in to browse our menus, track your order in real time and enjoy delicious food delivered hot and fresh.",
            fontFamily = FontFamily.SansSerif,
            fontSize = 12.sp,
            color = Color.White
        )
        Spacer(modifier = Modifier.height(30.dp))
        Button(onClick = { /*TODO*/ },
            modifier = Modifier
                .fillMaxWidth()) {
            Text(text = "Sign in",
                fontSize = 20.sp)
        }
        Spacer(modifier = Modifier.height(50.dp))
        Text(text = "Create an account",
            color = Color.White)



    }




}

@Preview
@Composable
private fun SignPrev() {
    SignIn()

}