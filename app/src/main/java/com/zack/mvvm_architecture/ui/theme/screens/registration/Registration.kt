package com.zack.mvvm_architecture.ui.theme.screens.registration

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun Registration() {
    var username by remember { mutableStateOf("") }
    var email by remember{ mutableStateOf("")}
    var password by remember { mutableStateOf("")}
    Column (
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color.Magenta)
    ) {
        Text(
            text = "Registration",
            fontFamily = FontFamily.Monospace,
            fontSize = 30.sp,
            color = Color.White
        )
        Spacer(modifier = Modifier.height(30.dp))
        Text(
            text = "Create your new account",
            fontFamily = FontFamily.SansSerif,
            fontSize = 15.sp,
            color = Color.White
        )
        Spacer(modifier = Modifier.height(30.dp))
        OutlinedTextField(value = username,
            onValueChange = { username = it },
            leadingIcon = {
                Icon(
                    imageVector = Icons.Default.Person,
                    contentDescription = "Username"
                )
            },
            label = {
                Text(
                    text = "Enter your username",
                    modifier = Modifier
                        .fillMaxWidth(),
                    color = Color.White,
                    fontFamily = FontFamily.Monospace,
                    fontSize = 15.sp
                )
            })
        OutlinedTextField(value = email,
            onValueChange = { email = it },
            leadingIcon = { Icon(imageVector = Icons.Default.Email, contentDescription = "Email") },
            label = {
                Text(
                    text = "Enter your email",
                    modifier = Modifier
                        .fillMaxWidth(),
                    color = Color.White,
                    fontFamily = FontFamily.Monospace,
                    fontSize = 15.sp
                )
            })
        OutlinedTextField(value = password,
            onValueChange = { password = it },
            leadingIcon = {
                Icon(
                    imageVector = Icons.Default.Lock,
                    contentDescription = "Password"
                )
            },
            label = {
                Text(
                    text = "Enter your password",
                    modifier = Modifier
                        .fillMaxWidth(),
                    color = Color.White,
                    fontFamily = FontFamily.Monospace,
                    fontSize = 15.sp
                )
            })

        Spacer(modifier = Modifier.height(30.dp))

        Button(
            onClick = { /*TODO*/ },
            modifier = Modifier
                .fillMaxWidth()
        ) {
            Text(
                text = "Login",
                fontSize = 20.sp
            )

        }
    }
}
@Preview
@Composable
fun RegistrationPreview()
{
            Registration()

}
