package com.wiryadev.composekp

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.wiryadev.composekp.ui.theme.ComposeKPTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeKPTheme {
                // A surface container using the 'background' color from the theme
                Scaffold {
                    Column(
                        modifier = Modifier.fillMaxSize(),
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.Center,
                    ) {
                        Button(
                            onClick = {
                                startActivity(Intent(this@MainActivity, BasicActivity::class.java))
                            }
                        ) {
                            Text(text = "Go To Basic")
                        }
                        Spacer(modifier = Modifier.height(32.dp))
                        Button(
                            onClick = {
                                startActivity(
                                    Intent(
                                        this@MainActivity,
                                        AdvanceActivity::class.java
                                    )
                                )
                            }
                        ) {
                            Text(text = "Go To Advanced")
                        }
                    }
                }
            }
        }
    }
}
