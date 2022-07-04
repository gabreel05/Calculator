package br.com.gabriel.app

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Row(
                modifier = Modifier
                    .fillMaxHeight(0.2f)
                    .fillMaxWidth()
                    .background(Color(0xff7159c1)),
                horizontalArrangement = Arrangement.Start,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(
                    text = "Result",
                    color = Color.White,
                    fontSize = 32.sp,
                    modifier = Modifier
                        .padding(24.dp)
                )
            }
            Row {
                Text("7")
                Text("8")
                Text("9")
            }
            Row {
                Text("4")
                Text("5")
                Text("6")
            }
            Row {
                Text("1")
                Text("2")
                Text("3")
            }
        }
    }
}
