package com.wiryadev.composekp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.wiryadev.composekp.ui.theme.ComposeKPTheme

class BasicActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeKPTheme {
                Scaffold {
                    Box(
                        modifier = Modifier.fillMaxSize(),
                        contentAlignment = Alignment.Center,
                    ) {
                        ClickableComposable()
                    }
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun Greeting() {
    Text(
        text = "Hello World!",
        color = Color.Blue,
        fontWeight = FontWeight.Bold,
    )
}

@Preview(showBackground = true)
@Composable
fun ShowImage() {
    Image(
        painter = painterResource(
            id = R.drawable.cat
        ),
        contentDescription = "Cat"
    )
}

@Preview(showBackground = true)
@Composable
fun ColumnExample() {
    Column {
        Greeting()
        Greeting()
    }
}

@Preview(showBackground = true)
@Composable
fun RowExample() {
    Row {
        Greeting()
        Greeting()
    }
}

@Preview(showBackground = true)
@Composable
fun BoxPreview() {
    Box {
        ShowImage()
        Text(
            text = "Menimpa Gambar",
            fontSize = 36.sp,
            fontWeight = FontWeight.Bold,
        )
    }
}

@Preview(showBackground = true)
@Composable
fun ClickableComposable() {
    val counter = remember {
        mutableStateOf(0)
    }

    Button(
        onClick = { counter.value++ },
        shape = MaterialTheme.shapes.large,
    ) {
        Text(text = "Diklik: ${counter.value} kali")
    }
}