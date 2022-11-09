package com.manuelduarte077.pokeapi_compose.viewModel

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import com.manuelduarte077.pokeapi_compose.api.PokemonAPI
import com.manuelduarte077.pokeapi_compose.model.Pokemon

class PokemonListViewModel : ViewModel() {

    var pokemonList: List<Pokemon> by mutableStateOf(listOf())

    init {
        loadData()
    }

    private fun loadData() {

        PokemonAPI.loadPokemon({ pokemon -> pokemonList = pokemon }, { println("Error") })

    }

}