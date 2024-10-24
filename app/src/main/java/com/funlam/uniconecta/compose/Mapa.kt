package com.funlam.uniconecta.compose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Card
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Constraints
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.funlam.uniconecta.R

@Preview
@Composable
fun BottomAppBarMapa() {
    Scaffold(
            bottomBar = {
                BottomAppBar(

                    actions = {
                        Row (
                            modifier = Modifier.fillMaxWidth(),
                            horizontalArrangement = Arrangement.SpaceAround,
                            verticalAlignment = Alignment.CenterVertically
                        ) {

                            IconButton(onClick = { /* do something */ }) {
                                Image(
                                    painter = painterResource(id = R.drawable.iconhome),
                                    contentDescription = "Icono home",
                                    modifier = Modifier.size(24.dp)
                                )
                            }
                            IconButton(onClick = { /* do something */ }) {
                                Image(
                                    painter = painterResource(id = R.drawable.iconmapa),
                                    contentDescription = "Icono mapa",
                                    modifier = Modifier.size(24.dp)
                                )
                            }
                            IconButton(onClick = { /* do something */ }) {
                                Image(
                                    painter = painterResource(id = R.drawable.iconalmacen),
                                    contentDescription = "Icono almacen",
                                    modifier = Modifier.size(24.dp)
                                )
                            }
                            IconButton(onClick = { /* do something */ }) {
                                Image(
                                    painter = painterResource(id = R.drawable.iconcomunidad),
                                    contentDescription = "Icono comunidad",
                                    modifier = Modifier.size(24.dp)
                                )
                            }
                            IconButton(onClick = { /* do something */ }) {
                                Image(
                                    painter = painterResource(id = R.drawable.iconalertas),
                                    contentDescription = "Icono alertas",
                                    modifier = Modifier.size(24.dp)
                                )
                            }
                        }
                    }

                )
            },
        ) { innerPadding ->
            CardMinimalExample()
            Text(
                modifier = Modifier
                    .padding(innerPadding)
                    .fillMaxSize(),

                text = "Mapa campus",
                textAlign = TextAlign.Center,
                fontWeight = FontWeight.W900,
                fontSize = 25.sp,
                fontFamily = FontFamily.Monospace

            )
        }
}


@Composable
fun CardMinimalExample() {
    LazyColumn(
        modifier = Modifier
            .background(color = Color.White)
            .padding(15.dp)
    ) {
        item {
            Image(
                painter = painterResource(id = R.drawable.imgcampus),
                contentDescription = "Imagen Campus  Universidad",
                modifier = Modifier
                    .fillMaxSize()
                    .height(400.dp)
                    .padding(10.dp)
            )
            Row {
                Text(
                    text = "Bloques",
                    textAlign = TextAlign.Center,
                    fontSize = 25.sp,
                    fontWeight = FontWeight.W900,
                    fontFamily = FontFamily.Monospace,
                    modifier = Modifier
                        .padding(15.dp)
                        .fillMaxSize()

                )
            }

            Row() {
                Card(
                    modifier = Modifier
                        .padding(10.dp)
                    )
                {
                    Image(
                        painter = painterResource(id = R.drawable.imgbloque),
                        contentDescription = "Imagen bloque",
                        modifier = Modifier
                            .height(100.dp)
                            .width(100.dp),
                    )
                    Text(
                        modifier = Modifier.padding(horizontal = 20.dp),
                        text = "Bloque 1",
                        fontSize = 15.sp,
                        color = Color.DarkGray

                    )
                }

                Card(
                    modifier = Modifier
                        .padding(10.dp)
                )
                {
                    Image(
                        painter = painterResource(id = R.drawable.imgbloque),
                        modifier = Modifier
                            .height(100.dp)
                            .width(100.dp),
                        contentDescription = "Imagen bloque"
                    )
                    Text(
                        modifier = Modifier.padding(horizontal = 20.dp),
                        text = "Bloque 2",
                        fontSize = 15.sp,
                        color = Color.DarkGray,
                        textAlign = TextAlign.Center
                    )
                }
                Card(
                    modifier = Modifier
                        .padding(10.dp)
                )
                {
                    Image(
                        painter = painterResource(id = R.drawable.imgbloque),
                        modifier = Modifier
                            .height(100.dp)
                            .width(100.dp),
                        contentDescription = "Imagen bloque"
                    )
                    Text(
                        modifier = Modifier.padding(horizontal = 20.dp),
                        text = "Bloque 3",
                        fontSize = 15.sp,
                        color = Color.DarkGray,
                        textAlign = TextAlign.Right

                    )
                }
            }
            Row() {
                Card(
                    modifier = Modifier
                        .padding(10.dp)
                )
                {
                    Image(
                        painter = painterResource(id = R.drawable.imgbloque),
                        modifier = Modifier
                            .height(100.dp)
                            .width(100.dp),

                        contentDescription = "Imagen bloque"
                    )

                    Text(
                        modifier = Modifier.padding(horizontal = 20.dp),
                        text = "Bloque 4",
                        fontSize = 15.sp,
                        color = Color.DarkGray,
                        textAlign = TextAlign.Right
                    )
                }


                Card(
                    modifier = Modifier
                        .padding(10.dp)
                )
                {
                    Image(
                        painter = painterResource(id = R.drawable.imgbloque),
                        modifier = Modifier
                            .height(100.dp)
                            .width(100.dp),
                        contentDescription = "Imagen bloque"
                    )
                    Text(
                        modifier = Modifier.padding(horizontal = 20.dp),
                        text = "Bloque 5",
                        fontSize = 15.sp,
                        color = Color.DarkGray,
                        textAlign = TextAlign.Right
                    )
                }
                Card(
                    modifier = Modifier
                        .padding(10.dp)
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.imgbloque),
                        modifier = Modifier
                            .height(100.dp)
                            .width(100.dp),
                        contentDescription = "Imagen bloque"
                    )
                    Text(
                        modifier = Modifier.padding(horizontal = 20.dp),
                        text = "Bloque 6",
                        fontSize = 15.sp,
                        color = Color.DarkGray,
                        textAlign = TextAlign.Right
                    )
                }
            }
        }
    }
}
