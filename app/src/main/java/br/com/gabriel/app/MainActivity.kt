package br.com.gabriel.app

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Column(
                modifier = Modifier
                    .fillMaxSize()
            ) {
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
                            .padding(40.dp)
                    )
                }
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .background(Color.DarkGray),
                    horizontalArrangement = Arrangement.SpaceAround
                ) {
                    Column(
                        modifier = Modifier
                            .fillMaxHeight(),
                        verticalArrangement = Arrangement.SpaceAround
                    ) {
                        Card {
                            Text(
                                text = "C",
                                 modifier = Modifier
                                    .background(Color.LightGray)
                                    .padding(40.dp),
                                fontSize = 24.sp,
                                fontWeight = FontWeight.Bold
                            )
                        }

                        Card {
                            Text(
                                text = "7",
                                modifier = Modifier
                                    .background(Color.LightGray)
                                    .padding(40.dp),
                                fontSize = 24.sp,
                                fontWeight = FontWeight.Bold
                            )
                        }
                        Card {
                            Text(
                                text = "4",
                                modifier = Modifier
                                    .background(Color.LightGray)
                                    .padding(40.dp),
                                fontSize = 24.sp,
                                fontWeight = FontWeight.Bold
                            )
                        }
                        Card {
                            Text(
                                text = "1",
                                modifier = Modifier
                                    .background(Color.LightGray)
                                    .padding(40.dp),
                                fontSize = 24.sp,
                                fontWeight = FontWeight.Bold
                            )
                        }

                    }
                    Column(
                        modifier = Modifier
                            .fillMaxHeight(),
                        verticalArrangement = Arrangement.SpaceAround
                    ) {
                        Card {
                            Text(
                                text = "<",
                                modifier = Modifier
                                    .background(Color.LightGray)
                                    .padding(40.dp),
                                fontSize = 24.sp,
                                fontWeight = FontWeight.Bold
                            )
                        }
                        Card {
                            Text(
                                text = "8",
                                modifier = Modifier
                                    .background(Color.LightGray)
                                    .padding(40.dp),
                                fontSize = 24.sp,
                                fontWeight = FontWeight.Bold
                            )
                        }
                        Card {
                            Text(
                                text = "5",
                                modifier = Modifier
                                    .background(Color.LightGray)
                                    .padding(40.dp),
                                fontSize = 24.sp,
                                fontWeight = FontWeight.Bold
                            )
                        }
                        Card {
                            Text(
                                text = "2",
                                modifier = Modifier
                                    .background(Color.LightGray)
                                    .padding(40.dp),
                                fontSize = 24.sp,
                                fontWeight = FontWeight.Bold
                            )
                        }

                    }
                    Column(
                        modifier = Modifier
                            .fillMaxHeight(),
                        verticalArrangement = Arrangement.SpaceAround
                    ) {
                        Card {
                            Text(
                                text = "/",
                                modifier = Modifier
                                    .background(Color.LightGray)
                                    .padding(40.dp),
                                fontSize = 24.sp,
                                fontWeight = FontWeight.Bold
                            )
                        }
                        Card {
                            Text(
                                text = "9",
                                modifier = Modifier
                                    .background(Color.LightGray)
                                    .padding(40.dp),
                                fontSize = 24.sp,
                                fontWeight = FontWeight.Bold
                            )
                        }
                        Card {
                            Text(
                                text = "6",
                                modifier = Modifier
                                    .background(Color.LightGray)
                                    .padding(40.dp),
                                fontSize = 24.sp,
                                fontWeight = FontWeight.Bold
                            )
                        }
                        Card {
                            Text(
                                text = "6",
                                modifier = Modifier
                                    .background(Color.LightGray)
                                    .padding(40.dp),
                                fontSize = 24.sp,
                                fontWeight = FontWeight.Bold
                            )
                        }

                    }
                    Column(
                        modifier = Modifier
                            .fillMaxHeight(),
                        verticalArrangement = Arrangement.SpaceAround
                    ) {
                        Card {
                            Text(
                                text = "*",
                                modifier = Modifier
                                    .background(Color.LightGray)
                                    .padding(40.dp),
                                fontSize = 24.sp,
                                fontWeight = FontWeight.Bold
                            )
                        }
                        Card {
                            Text(
                                text = "-",
                                modifier = Modifier
                                    .background(Color.LightGray)
                                    .padding(40.dp),
                                fontSize = 24.sp,
                                fontWeight = FontWeight.Bold
                            )
                        }
                        Card {
                            Text(
                                text = "+",
                                modifier = Modifier
                                    .background(Color.LightGray)
                                    .padding(40.dp),
                                fontSize = 24.sp,
                                fontWeight = FontWeight.Bold
                            )
                        }
                        Card {
                            Text(
                                text = "=",
                                modifier = Modifier
                                    .background(Color.LightGray)
                                    .padding(40.dp),
                                fontSize = 24.sp,
                                fontWeight = FontWeight.Bold
                            )
                        }
                    }
                }
            }
        }
    }
}
