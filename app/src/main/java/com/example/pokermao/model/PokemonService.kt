package com.example.pokermao.model

import retrofit2.Call
import retrofit2.http.GET

interface PokemonService {
    @GET("/api/pokemon/health")
    fun checkHealth(): Call<HealthResponse>
}