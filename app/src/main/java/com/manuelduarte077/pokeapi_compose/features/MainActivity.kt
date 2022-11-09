package com.manuelduarte077.pokeapi_compose.features

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.manuelduarte077.pokeapi_compose.ui.theme.PokeAPIComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PokeAPIComposeTheme {

                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    PokemonList()
                }

            }
        }
    }
}

@Composable
fun PokemonList() {
    Column {
        Text(text = "Hello")
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    PokeAPIComposeTheme {
        PokemonList()
    }
}