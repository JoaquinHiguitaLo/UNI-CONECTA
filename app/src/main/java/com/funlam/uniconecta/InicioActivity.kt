package com.funlam.uniconecta

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.funlam.uniconecta.compose.BottomAppBarMapa
import com.funlam.uniconecta.compose.MainScreen
import com.funlam.uniconecta.compose.MyAppTheme

class InicioActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyAppTheme {
                
            }
        }
    }
}
