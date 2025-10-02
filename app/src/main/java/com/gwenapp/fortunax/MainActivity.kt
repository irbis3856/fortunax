@file:Suppress("LocalVariableName")

package com.gwenapp.fortunax

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Anchor
import androidx.compose.material.icons.filled.LocationOn
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.gwenapp.fortunax.ui.theme.FortunaxTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            var screen_2 by remember { mutableStateOf(true) }
            FortunaxTheme {
                // A surface container using the 'background' color from the theme
                Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background) {
                    Column(modifier = Modifier.fillMaxSize()) {
                        // make a vertical "space"
                        Spacer(modifier = Modifier.height(20.dp))
                        Row() {
                            Text(
                                text = "Hello1 World!",
                                fontSize = 30.sp
                            )
                            // horizonzal "space"
                            Spacer(modifier = Modifier.width(50.dp))
                            Button(onClick = {
                                // when you click here you can hide/unhide the bottom button
                                screen_2 = !screen_2
                            }) {
                                Text(text = "toggle")
                                Icon(
                                    modifier = Modifier
                                        .padding(2.dp),
                                    imageVector = Icons.Default.LocationOn,
                                    tint = Color.LightGray,
                                    contentDescription = "description text here"
                                )
                            }
                        }
                        if (screen_2) { // --> should this part be drawn? only if "screen_2" equals "true"
                            // make a vertical "space" that will expand
                            Spacer(modifier = Modifier.weight(10.0f))
                            Row() {
                                Text(
                                    text = "Hello2 World!",
                                    fontSize = 30.sp
                                )
                                // horizonzal "space"
                                Spacer(modifier = Modifier.width(50.dp))
                                Button(onClick = {}) {
                                    Icon(
                                        modifier = Modifier
                                            .padding(4.dp),
                                        imageVector = Icons.Default.Anchor,
                                        tint = Color.LightGray,
                                        contentDescription = "description text here"
                                    )
                                }
                            }
                        }
                        // make a vertical "space"
                        Spacer(modifier = Modifier.height(20.dp))
                    }
                }
            }
        }
    }
}
