package com.funlam.uniconecta.compose

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicText
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.funlam.uniconecta.R


@Composable
fun LibraryScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        Text(
            text = "Biblioteca",
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(bottom = 16.dp)
        )

        CourseCard(
            courseName = "Programación Móvil-I",
            evaluation = "Parcial 1",
            rating = "4.5",
            date = "10 de septiembre 2024",
            dotColor = Color(0xFF00796B)
        )
        CourseCard(
            courseName = "Base de datos",
            evaluation = "Parcial 1",
            rating = "Sin calificar",
            date = "10 de septiembre 2024",
            dotColor = Color(0xFFFFC107)
        )
        CourseCard(
            courseName = "Semillero de programación",
            evaluation = "Certificado de participación",
            rating = "En curso",
            date = "19 de septiembre 2024",
            dotColor = Color(0xFFD32F2F)
        )

    }
}

@Composable
fun CourseCard(
    courseName: String,
    evaluation: String,
    rating: String,
    date: String,
    dotColor: Color
) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 8.dp),
        shape = RoundedCornerShape(10.dp),
        elevation = CardDefaults.cardElevation(8.dp)
    ) {
        Column(
            modifier = Modifier
                .padding(16.dp)
                .fillMaxWidth()
        ) {
            Row(verticalAlignment = Alignment.CenterVertically) {
                Box(
                    modifier = Modifier
                        .size(10.dp)
                        .background(dotColor, RoundedCornerShape(50))
                )
                Spacer(modifier = Modifier.width(8.dp))
                Text(
                    text = courseName,
                    fontWeight = FontWeight.Bold,
                    fontSize = 16.sp,
                )
            }
            Spacer(modifier = Modifier.height(8.dp))
            Text(
                text = evaluation,
                fontSize = 14.sp
            )
            Text(
                text = "Calificación: $rating",
                fontSize = 14.sp,
                color = Color.Gray
            )
            Spacer(modifier = Modifier.height(8.dp))
            Text(
                text = "Fecha: $date",
                fontSize = 14.sp,
                color = Color(0xFFFFA000)
            )
            Spacer(modifier = Modifier.height(8.dp))
            Button(
                onClick = { /* Acción del botón */ },
                modifier = Modifier
                    .align(Alignment.End)
                    .defaultMinSize(minWidth = 100.dp),
                colors = ButtonDefaults.buttonColors(containerColor = Color(0xFFBDBDBD))
            ) {
                Text("Ver más")
            }
        }
    }
}



@Preview
@Composable
fun PreviewLibraryScreen() {
    LibraryScreen()


}