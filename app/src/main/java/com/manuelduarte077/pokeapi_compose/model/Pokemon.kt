package com.manuelduarte077.pokeapi_compose.model


data class PokemonList(val results: List<Pokemon>)

data class Pokemon(val name: String, val url: String) {

    val id: Int
        get() {
            val components = url.split("/")
            return components[components.size - 2].toIntOrNull() ?: 0
        }

    val imageUrl: String
        get() = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/$id.png"

}