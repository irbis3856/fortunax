package com.gwenapp.fortunax

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.gwenapp.fortunax.ui.theme.FortunaxTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            FortunaxTheme {
                // A surface container using the 'background' color from the theme
                Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background) {
                    Column(modifier = Modifier.fillMaxSize()) {
                        Row() {
                            Text(
                                text = "Hello1 World!",
                                fontSize = 30.sp
                            )
                            Button(onClick = {}) {

                            }
                        }
                        Spacer(modifier = Modifier.weight(10.0f))
                        Row() {
                            Text(
                                text = "Hello2 World!",
                                fontSize = 30.sp
                            )
                            Button(onClick = {}) {

                            }
                        }
                    }
                }
            }
        }
    }
}
