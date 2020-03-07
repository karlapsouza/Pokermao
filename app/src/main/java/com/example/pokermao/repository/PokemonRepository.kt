package com.example.pokermao.repository

interface PokemonRepository {
    fun checkHealth(
        //Avisa quando dá erro ou sucesso
        onComplete:() -> Unit,
        onError: (Throwable?) -> Unit
    )
}