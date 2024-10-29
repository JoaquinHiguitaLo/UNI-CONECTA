package com.funlam.uniconecta.compose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.text.BasicText
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.CalendarToday
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import java.time.LocalDate

class CalendarioActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CalendarScreen()
        }
    }
}

@Preview
@Composable
fun CalendarScreen() {
    Scaffold(
        topBar = { CalendarAppBar() },
        content = { paddingValues ->  // Acepta el paddingValues
            CalendarContent(paddingValues)  // Pasa el padding a CalendarContent
        }
    )
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CalendarAppBar() {
    TopAppBar(
        title = { Text("Calendario", fontSize = 20.sp, fontWeight = FontWeight.Bold) },
        actions = {
            IconButton(onClick = { /* Acción del ícono */ }) {
                Icon(Icons.Filled.CalendarToday, contentDescription = null)
            }
        }
    )
}

@Composable
fun CalendarContent(paddingValues: PaddingValues) {  // Acepta el paddingValues
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(paddingValues)  // Aplica el padding
            .padding(16.dp)  // Padding adicional, si lo deseas
    ) {
        Text(
            text = "Septiembre 2022",
            fontSize = 18.sp,
            fontWeight = FontWeight.Bold,
            color = Color(0xFFEEAA00) // Color similar al de la captura
        )

        Spacer(modifier = Modifier.height(16.dp))

        CalendarGrid()

        Spacer(modifier = Modifier.height(16.dp))

        EventList(events = listOf(
            "Entrega de mockups",
            "Entrega de modelo entidad-relación"
        ))
    }
}

@Composable
fun CalendarGrid() {
    val daysInMonth = listOf(
        "DO", "LU", "MA", "MI", "JU", "VI", "SA",
        "", "", "", "", "1", "2", "3",
        "4", "5", "6", "7", "8", "9", "10", // Día seleccionado (10)
        "11", "12", "13", "14", "15", "16", "17",
        "18", "19", "20", "21", "22", "23", "24",
        "25", "26", "27", "28", "29", "30", ""
    )

    Column {
        Row(
            horizontalArrangement = Arrangement.SpaceBetween,
            modifier = Modifier.fillMaxWidth()
        ) {
            for (i in 0..6) {
                Text(daysInMonth[i], modifier = Modifier.weight(1f), textAlign = androidx.compose.ui.text.style.TextAlign.Center)
            }
        }

        for (week in 1..5) {
            Row(
                horizontalArrangement = Arrangement.SpaceBetween,
                modifier = Modifier.fillMaxWidth()
            ) {
                for (day in 0..6) {
                    val index = (week * 7) + day
                    DayCell(daysInMonth.getOrNull(index))
                }
            }
        }
    }
}

@Composable
fun DayCell(day: String?) {
    val selectedDate = "10"
    val isSelected = day == selectedDate

    Box(
        contentAlignment = Alignment.Center,
        modifier = Modifier
            .size(40.dp)
            .background(if (isSelected) Color(0xFF008080) else Color.Transparent)
    ) {
        Text(text = day ?: "", color = if (isSelected) Color.White else Color.Black)
    }
}

@Composable
fun EventList(events: List<String>) {
    Column {
        events.forEachIndexed { index, event ->
            Row(
                verticalAlignment = Alignment.CenterVertically
            ) {
                BasicText(text = event)
                Spacer(modifier = Modifier.width(16.dp))
                Text(
                    text = (10 + index).toString(), // Asignando fechas a eventos
                    fontSize = 32.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color(0xFFFF8800)
                )
            }
        }
    }
}
