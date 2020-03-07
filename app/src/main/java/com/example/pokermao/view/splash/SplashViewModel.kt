package com.example.pokermao.view.splash

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.pokermao.repository.PokemonRepository

//implementação orientada a interface ao ivés de implementação
class SplashViewModel(val pokemonRepository: PokemonRepository) : ViewModel() {
    val messageError: MutableLiveData<String> = MutableLiveData()
    fun checkHealth() {
        pokemonRepository.checkHealth(
            onComplete = {
                messageError.value = ""
            },
            onError = {
                messageError.value = it?.message
            }
        )
    }
}