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
import androidx.compose.material.icons.filled.Email
import androidx.compose.material3.Icon
import androidx.compose.material.icons.filled.Info
import androidx.compose.material.icons.filled.Phone
import androidx.compose.material.icons.filled.Share
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material.icons.rounded.ShoppingCart
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
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
    Box(Modifier.background(Color(0xFFEEF5D6))) {

        Column(
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier.fillMaxSize()
        ) {
            TopHalf()
            BottomHalf()


        }
    }
}


@Composable
    fun TopHalf(modifier: Modifier = Modifier){
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        val imageFile = painterResource(R.drawable.android_logo)
        Image(
            painter = imageFile,
            contentDescription = null,
            modifier = Modifier
                .size(100.dp)
                .background(Color(0XFF111405))

        )
        Text(
            text ="Lalhmingmuana",
            modifier = modifier.padding(10.dp),
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold

        )
        Text(
            text ="Android developer",
            modifier = modifier
        )

    }
}


@Composable
fun BottomHalf(modifier: Modifier = Modifier){
    Column(Modifier.padding(start=10.dp,
                            end=10.dp,
                            top=170.dp,
                            bottom=10.dp)){
        Row(Modifier.padding(10.dp)) {
            Icon(
                imageVector = Icons.Default.Share, // Use the correct Compose icon import
                contentDescription = "Share Icon",
                modifier = Modifier.size(20.dp), // Set the icon size
                tint = Color(0xFFa1344e)
             // Customize the icon color

            )


            Text(
                text = "@lalhming_muana",
                modifier = modifier.padding(start =10.dp,
                    end =10.dp,
                    top=0.dp,
                    bottom = 10.dp)
            )
        }
        Row(Modifier.padding(10.dp)) {
            Icon(
                imageVector = Icons.Default.Email, // Use the correct Compose icon import
                contentDescription = "Email Icon",
                modifier = Modifier.size(20.dp), // Set the icon size
                tint = Color.Black // Customize the icon color

            )


            Text(
                text = "edd_vai@yahoo.co.in",
                modifier = modifier.padding(start =10.dp,
                    end =10.dp,
                    top=0.dp,
                    bottom = 10.dp)
            )
        }

        Row(Modifier.padding(10.dp)) {
            Icon(
                imageVector = Icons.Default.Phone, // Use the correct Compose icon import
                contentDescription = "Phone Icon",
                modifier = Modifier.size(20.dp), // Set the icon size
                tint = Color.Black // Customize the icon color

            )


            Text(
                text = "(+90)9089528085",
                modifier = modifier.padding(start =10.dp,
                    end =10.dp,
                    top=0.dp,
                    bottom = 10.dp)
            )
        }



    }
}
@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Android_layout_testnaTheme {
        Greeting()
    }
}