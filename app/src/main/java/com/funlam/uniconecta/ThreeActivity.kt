package com.funlam.uniconecta

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.funlam.uniconecta.compose.BottomAppBarMapa

class ThreeActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BottomAppBarMapa()
        }

        val receivedData = intent.getStringExtra("key_name")
    }
}
