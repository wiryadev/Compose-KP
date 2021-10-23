package com.wiryadev.composekp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.Text
import com.wiryadev.composekp.ui.theme.ComposeKPTheme

class AdvanceActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        
        setContent { 
            ComposeKPTheme {
                Text(text = "Advance Activity")
            }
        }
    }
}