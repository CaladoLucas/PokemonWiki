package com.example.lucas.pokemonwiki.Api

import com.google.gson.JsonObject
import retrofit2.Callback
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class Api {
    val service : ApiDef
    init {
        val retrofit = Retrofit.Builder()
                .baseUrl("http://pokeapi.co/api/v2/")
                .addConverterFactory(GsonConverterFactory.create())
                .build()
        service = retrofit.create(ApiDef::class.java)
    }

    fun loadBulba(cb:Callback<JsonObject>){
        service.bulbassaur().enqueue(cb)
    }
}