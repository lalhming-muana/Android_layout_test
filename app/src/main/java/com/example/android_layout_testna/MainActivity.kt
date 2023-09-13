package com.example.android_layout_testna

import android.graphics.drawable.Icon
import android.os.Bundle
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.*
import androidx.compose.ui.graphics.*
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material3.Icon
import androidx.compose.material.icons.filled.Info
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material.icons.rounded.ShoppingCart
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.android_layout_testna.ui.theme.Android_layout_testnaTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Android_layout_testnaTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting()
                }
            }
        }
    }
}

@Composable
fun Greeting(modifier: Modifier = Modifier) {
    Column(verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.fillMaxSize()
                           ){
    TopHalf()

    Icon(
        imageVector = Icons.Default.ShoppingCart, // Use the correct Compose icon import
        contentDescription = "Shopping Cart Icon",
        modifier = Modifier.size(20.dp), // Set the icon size
        tint = Color.Red // Customize the icon color

        )


    Text(
        text ="Inside the Greeting line 2",
        modifier = modifier
    )


    }
}


@Composable
    fun TopHalf(modifier: Modifier = Modifier){
    Column(){
        val imageFile = painterResource(R.drawable.android_logo)
        Image(
            painter = imageFile,
            contentDescription = null,
            modifier =Modifier.size(100.dp)
                .background(Color(0XFF111405))

        )
        Text(
            text ="inside the first line of Top Half",
            modifier = modifier
        )
        Text(
            text ="inside the second line of Top Half",
            modifier = modifier
        )

    }
}
@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Android_layout_testnaTheme {
        Greeting()
    }
}