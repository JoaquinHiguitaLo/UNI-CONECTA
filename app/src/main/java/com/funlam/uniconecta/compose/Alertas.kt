package com.funlam.uniconecta.compose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.funlam.uniconecta.R

class ThreeActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            alertas()

        }
    }
}

@Preview
@Composable
fun alertas(){
    ScaffoldExample()
    Notificacionlista()
}


@Composable
fun Notificacionlista(){
    Column (modifier = Modifier
        .padding(top = 50.dp)) {
        Card (
            colors = CardDefaults.cardColors(
            containerColor = MaterialTheme.colorScheme.surfaceVariant,
        ),
            modifier = Modifier
                .size(width = 400.dp, height = 160.dp)
                .padding(bottom = 5.dp)
        ) {
            Column (verticalArrangement = Arrangement.spacedBy(5.dp)) {
                Text(
                    text = "Programación Móvil I",
                    modifier = Modifier
                        .padding(5.dp),
                    textAlign = TextAlign.Center,
                    fontWeight = FontWeight.W900
                )
                Text(
                    text = "Entrega de mockups",
                    modifier = Modifier
                        .padding(8.dp),
                    textAlign = TextAlign.Center,
                )
                Text(
                    text = "Entrega: 10 de septiembre 2024",
                    modifier = Modifier
                        .padding(8.dp),
                    textAlign = TextAlign.Right
                )
                HorizontalDivider(thickness = 2.dp)
                Row {
                    Image(
                        painter = painterResource(id = R.drawable.iconimportante),
                        contentDescription = "Icono importante estado",
                        modifier = Modifier
                            .size(20.dp)
                    )
                    Text(
                        text = "Importante",
                        modifier = Modifier
                            .padding(1.dp),
                    )
                }
            }

        }
        Card (
            colors = CardDefaults.cardColors(
                containerColor = MaterialTheme.colorScheme.surfaceVariant,
            ),
            modifier = Modifier
                .size(width = 400.dp, height = 160.dp)
                .padding(bottom = 5.dp)
        ) {
            Column (verticalArrangement = Arrangement.spacedBy(8.dp)) {
                Text(
                    text = "Base de datos",
                    modifier = Modifier
                        .padding(5.dp),
                    textAlign = TextAlign.Center,
                    fontWeight = FontWeight.W900
                )
                Text(
                    text = "Entrega modelo entidad relación",
                    modifier = Modifier
                        .padding(8.dp),
                    textAlign = TextAlign.Center,
                )
                Text(
                    text = "Entrega: 10 de septiembre 2024",
                    modifier = Modifier
                        .padding(8.dp),
                    textAlign = TextAlign.Right,
                )
                HorizontalDivider(thickness = 2.dp)
                Row {
                    Image(
                        painter = painterResource(id = R.drawable.iconimportante),
                        contentDescription = "Icono importante estado",
                        modifier = Modifier
                            .size(20.dp)
                    )
                    Text(
                        text = "Importante",
                        modifier = Modifier
                            .padding(1.dp),
                    )
                }
            }
        }
        Card (
            colors = CardDefaults.cardColors(
                containerColor = MaterialTheme.colorScheme.surfaceVariant,
            ),
            modifier = Modifier
                .size(width = 400.dp, height = 160.dp)
                .padding(bottom = 5.dp)
        ) {
            Column (verticalArrangement = Arrangement.spacedBy(8.dp)) {
                Text(
                    text = "Estadistica",
                    modifier = Modifier
                        .padding(5.dp),
                    textAlign = TextAlign.Center,
                    fontWeight = FontWeight.W900
                )
                Text(
                    text = "Entrega de tablas de frecuencia",
                    modifier = Modifier
                        .padding(8.dp),
                    textAlign = TextAlign.Center,
                )
                Text(
                    text = "Entrega: 15 de septiembre 2024",
                    modifier = Modifier
                        .padding(8.dp),
                    textAlign = TextAlign.Right,
                )
                HorizontalDivider(thickness = 2.dp)
                Row {
                    Image(
                        painter = painterResource(id = R.drawable.iconimportante),
                        contentDescription = "Icono importante estado",
                        modifier = Modifier
                            .size(20.dp)
                    )
                    Text(
                        text = "Importante",
                        modifier = Modifier
                            .padding(1.dp),
                    )
                }
            }

        }
        Card (
            colors = CardDefaults.cardColors(
                containerColor = MaterialTheme.colorScheme.surfaceVariant,
            ),
            modifier = Modifier
                .size(width = 400.dp, height = 160.dp)
                .padding(bottom = 5.dp)
        ) {
            Column (verticalArrangement = Arrangement.spacedBy(8.dp)) {
                Text(
                    text = "Comunicaciones universidad",
                    modifier = Modifier
                        .padding(5.dp),
                    textAlign = TextAlign.Center,
                    fontWeight = FontWeight.W900
                )
                Text(
                    text = "Cine arte septiembre",
                    modifier = Modifier
                        .padding(8.dp),
                    textAlign = TextAlign.Center,
                )
                Text(
                    text = "Función: 19 de septiembre 2024",
                    modifier = Modifier
                        .padding(8.dp),
                    textAlign = TextAlign.Right,
                )
                HorizontalDivider(thickness = 2.dp)
                Row {
                    Image(
                        painter = painterResource(id = R.drawable.iconuniversidad),
                        contentDescription = "Icono universidad estado",
                        modifier = Modifier
                            .size(20.dp)
                    )
                    Text(
                        text = "Entretenimiento",
                        modifier = Modifier
                            .padding(1.dp),
                    )
                }
            }

        }

        }
    }



@Composable
fun ScaffoldExample() {

    Scaffold(

        bottomBar = {
            BottomAppBar(
                containerColor = MaterialTheme.colorScheme.secondary,
                contentColor = MaterialTheme.colorScheme.primary,
            ) {
                Row (
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceAround,
                    verticalAlignment = Alignment.CenterVertically
                ){

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
                            contentDescription = "Icono home",
                            modifier = Modifier.size(24.dp)
                        )
                    }
                    IconButton(onClick = { /* do something */ }) {
                        Image(
                            painter = painterResource(id = R.drawable.iconalmacen),
                            contentDescription = "Icono home",
                            modifier = Modifier.size(24.dp)
                        )
                    }
                    IconButton(onClick = { /* do something */ }) {
                        Image(
                            painter = painterResource(id = R.drawable.iconcomunidad),
                            contentDescription = "Icono home",
                            modifier = Modifier.size(24.dp)
                        )
                    }
                    IconButton(onClick = { /* do something */ }) {
                        Image(
                            painter = painterResource(id = R.drawable.iconalertas),
                            contentDescription = "Icono home",
                            modifier = Modifier.size(24.dp)
                        )
                    }
                }
            }
        },

    ) { innerPadding ->
        Column(
            modifier = Modifier
                .padding(innerPadding),
            verticalArrangement = Arrangement.spacedBy(20.dp),
        ) {
            Text(
                modifier = Modifier
                    .padding(innerPadding)
                    .fillMaxSize(),

                text = "Alertas",
                textAlign = TextAlign.Center,
                fontWeight = FontWeight.W900,
                fontSize = 25.sp,
                fontFamily = FontFamily.Monospace
            )
        }
    }
}

