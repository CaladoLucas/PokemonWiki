package com.example.lucas.pokemonwiki.Api

import com.google.gson.JsonObject
import retrofit2.Call
import retrofit2.http.GET

interface ApiDef {
    @GET("pokemon/1/")
    fun bulbassaur() : Call<JsonObject>
}