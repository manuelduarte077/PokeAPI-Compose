package com.manuelduarte077.pokeapi_compose.features

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.manuelduarte077.pokeapi_compose.ui.theme.PokeAPIComposeTheme
import com.manuelduarte077.pokeapi_compose.viewModel.PokemonListViewModel

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

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun PokemonList() {

    val viewModel = PokemonListViewModel()

    Scaffold(
        topBar = {
            MediumTopAppBar(
                title = {
                    Text(text = "Pokémon list")
                }
            )
        }
    ) { padding ->
        LazyColumn(contentPadding = padding) {
            items(viewModel.pokemonList) { pokemon ->
                PokemonCard(pokemon)
            }
        }

    }


}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    PokeAPIComposeTheme {
        PokemonList()
    }
}