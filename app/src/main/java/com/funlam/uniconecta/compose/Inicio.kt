package com.funlam.uniconecta.compose


import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Book
import androidx.compose.material.icons.filled.CalendarToday
import androidx.compose.material.icons.filled.Group
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Place
import androidx.compose.material.icons.filled.Schedule
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.funlam.uniconecta.R

import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.material3.Shapes
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController


private val LightColorScheme = lightColorScheme(
    primary = Color(0xFFFF9800), // Naranja
    onPrimary = Color.White,
    secondary = Color(0xFF6200EE), // Morado
    onSecondary = Color.White,
    background = Color(0xFFF5F5F5), // Fondo claro
    onBackground = Color.Black
)
private val Shapes = Shapes(
    small = RoundedCornerShape(4.dp),
    medium = RoundedCornerShape(8.dp),
    large = RoundedCornerShape(16.dp)
)



@Composable
fun MyAppTheme(content: @Composable () -> Unit) {
    MaterialTheme(
        colorScheme = LightColorScheme,
        typography = Typography, // Aquí podrías definir tus estilos tipográficos
        shapes = Shapes, // Aquí podrías definir tus formas
        content = content)
}


@Composable
fun MainScreen(navController: NavController) {
    var selectedTab by remember { mutableStateOf(0) } // Estado para la pestaña seleccionada

    Scaffold(

    ) { innerPadding ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(innerPadding)
                .padding(16.dp)
        ) {
            // Title
            Text(
                text = "UNICONECTA",
                fontSize = 24.sp,
                color = Color(0xFFFF9800),
                modifier = Modifier.align(Alignment.CenterHorizontally)
            )

            Spacer(modifier = Modifier.height(16.dp))

            // Header Image
            Image(
                painter = painterResource(id = R.drawable.campusimage), // Verifica que este recurso exista
                contentDescription = "Campus Image",
                modifier = Modifier
                    .fillMaxWidth()
                    .height(200.dp),
                contentScale = ContentScale.Crop
            )

            Spacer(modifier = Modifier.height(16.dp))

            // Search Box
            var searchText by remember { mutableStateOf("") }
            OutlinedTextField(
                value = searchText,
                onValueChange = { searchText = it },
                placeholder = { Text("Buscar") },
                leadingIcon = { Icon(imageVector = Icons.Default.Search, contentDescription = "Search Icon") },
                modifier = Modifier.fillMaxWidth(),
                shape = RoundedCornerShape(8.dp)
            )

            Spacer(modifier = Modifier.height(24.dp))

            // Grid Buttons
            GridMenu()
        }
    }
}






@Composable
fun GridMenu() {
    Column {
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceEvenly
        ) {
            MenuButton(icon = Icons.Default.Place, text = "Campus Virtual")
            MenuButton(icon = Icons.Default.Group, text = "Comunidad")
            MenuButton(icon = Icons.Default.Notifications, text = "Alertas")
        }

        Spacer(modifier = Modifier.height(16.dp))

        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceEvenly
        ) {
            MenuButton(icon = Icons.Default.Book, text = "Biblioteca")
            MenuButton(icon = Icons.Default.CalendarToday, text = "Calendario")
            MenuButton(icon = Icons.Default.Schedule, text = "Horario")
        }
    }
}

@Composable
fun MyApp() {
    val navController = rememberNavController()

    NavHost(navController, startDestination = "main_screen") {
        composable("main_screen") { MainScreen(navController) }
        composable("campus_virtual") { BottomAppBarMapaScreen() }
        composable("alertas") { alertas() }
        composable("biblioteca") { LibraryScreen()}
        composable("calendario") { CalendarScreen()}

    }
}


@Composable
fun MenuButton(icon: ImageVector, text: String) {
    Button(
        onClick = { /* Aquí puedes agregar la acción al hacer clic */ },
        modifier = Modifier
            .padding(8.dp)
            .width(100.dp), // Ajusta el ancho según lo necesites
        colors = ButtonDefaults.buttonColors(
            containerColor = Color.White // Cambia el color de fondo aquí
        )
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Icon(
                imageVector = icon,
                contentDescription = null,
                modifier = Modifier.size(60.dp),
                tint = Color(0xFFFF9800) // Color del icono
            )
            Spacer(modifier = Modifier.height(4.dp)) // Espacio entre el icono y el texto
            Text(text = text, fontSize = 12.sp, color = Color.Black) // Color del texto
        }
    }
}


@Composable
fun BottomAppBarMapa() {
    Text(text = "Campus Virtual Screen")
}

@Composable
fun ComunidadScreen() {
    // Implementación de la pantalla de Comunidad
    Text(text = "Comunidad Screen")
}

@Composable
fun AlertasScreen() {
    // Implementación de la pantalla de Alertas
    Text(text = "Alertas Screen")
}








