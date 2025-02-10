package com.example.apiconsumercrudandroid

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.apiconsumercrudandroid.ui.theme.ApiconsumercrudandroidTheme
import com.example.apiconsumercrudandroid.views.Consumer
import com.example.apiconsumercrudandroid.views.PhotoConsumer

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ApiconsumercrudandroidTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    val navController = rememberNavController()
                    NavHost(navController = navController, startDestination = "initial"){
                        composable(
                            route = "initial"
                        ) {
                            Consumer(innerPadding)
                        }

                        composable(
                            route = "PhotoConsumer"
                        ) {
                            PhotoConsumer(innerPadding)
                        }
                    }
                }
            }
        }
    }
}
