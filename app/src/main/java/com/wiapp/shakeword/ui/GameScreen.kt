package com.wiapp.shakeword.ui

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.ShapeDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.compose.ShakeWordAppTheme

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun GameScreen() {
    val modifier: Modifier = Modifier

        Column(
            modifier = Modifier
                .padding(30.dp),
            verticalArrangement = Arrangement.spacedBy(16.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                modifier = Modifier.padding(12.dp),
                fontSize = 32.sp,
                text = "ShakeWord"
            )

            Card(
                modifier = Modifier.fillMaxWidth(),
                elevation = CardDefaults.cardElevation(defaultElevation = 6.dp)
            ) {
                Column(
                    modifier = Modifier
                        .padding(12.dp)
                        .align(alignment = Alignment.CenterHorizontally),
                    verticalArrangement = Arrangement.spacedBy(16.dp),
                    horizontalAlignment = Alignment.CenterHorizontally
                ){
                    Text(
                        modifier = Modifier
                            .clip(shape = ShapeDefaults.Medium)
                            .background(MaterialTheme.colorScheme.primary)
                            .align(alignment = Alignment.End)
                            .padding(8.dp),
                        color = MaterialTheme.colorScheme.onPrimary,
                        text = "0/10"
                    )

                    Text(
                        modifier = Modifier
                            .align(alignment = Alignment.CenterHorizontally)
                            .padding(10.dp),
                        text = "Test"
                    )
                    Text(
                        modifier = Modifier
                            .align(alignment = Alignment.CenterHorizontally)
                            .padding(10.dp),
                        text = "Lorem ipsum dolores"
                    )
                    TextField(
                        value = "",
                        onValueChange = {  },
                        label = { Text(text = "Entrez votre texte")}
                    )
                }
            }

            Button(
                modifier = Modifier.fillMaxWidth(),
                onClick = { /*TODO*/ }
            ) {
                Text(text = "Valider")
            }
            Button(
                modifier = Modifier.fillMaxWidth(),
                onClick = { /*TODO*/ }
            ) {
                Text(text = "Passer")
            }
            Text(
                modifier = Modifier
                    .clip(shape = ShapeDefaults.Medium)
                    .background(MaterialTheme.colorScheme.primary)
                    .padding(8.dp),
                color = MaterialTheme.colorScheme.onPrimary,
                text = "Score: 0"
            )
    }
}

@Preview(showBackground = true)
@Composable
fun preview() {
    ShakeWordAppTheme {
        GameScreen()
    }
}
