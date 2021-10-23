package com.wiryadev.composekp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.ContentAlpha
import androidx.compose.material.LocalContentAlpha
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.wiryadev.composekp.ui.theme.ComposeKPTheme

class AdvanceActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            ComposeKPTheme {
                Column(
                    modifier = Modifier
                        .fillMaxSize()
                        .background(color = MaterialTheme.colors.secondary),
                ) {
                    Composable1()
                    Composable2()
                }
            }
        }
    }
}

@Composable
fun Composable1() {
    CompositionLocalProvider(LocalContentAlpha provides ContentAlpha.medium) {
        Column(
            modifier = Modifier
                .padding(8.dp)
                .fillMaxWidth()
                .background(
                    color = MaterialTheme.colors.background,
                    shape = MaterialTheme.shapes.medium,
                )
                .padding(12.dp),
            verticalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            Text(
                text = "Title",
                style = MaterialTheme.typography.h4
            )
            Text(
                text = "Body",
                style = MaterialTheme.typography.body1
            )
            Text(
                text = "Sub",
                style = MaterialTheme.typography.subtitle1
            )
        }
    }

}

@Composable
fun Composable2() {
    Row(
        modifier = Modifier
            .padding(8.dp)
            .fillMaxWidth()
            .background(
                color = MaterialTheme.colors.background,
                shape = MaterialTheme.shapes.medium,
            )
            .padding(12.dp),
        horizontalArrangement = Arrangement.SpaceEvenly
    ) {
        Text(
            text = "Title",
            style = MaterialTheme.typography.h4,
        )
        Text(
            text = "Body",
            style = MaterialTheme.typography.body1
        )
        Text(
            text = "Sub",
            style = MaterialTheme.typography.subtitle1
        )
    }
}

@Preview
@Composable
fun PreviewAdvance() {
    ComposeKPTheme {
        Column(
            modifier = Modifier.fillMaxSize(),
        ) {
            Composable1()
            Composable2()
        }
    }
}