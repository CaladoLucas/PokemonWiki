package com.example.lucas.pokemonwiki

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.lucas.pokemonwiki.Api.Api
import com.google.gson.JsonObject
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class BulbassaurActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bulbassaur)

        val call = Api().loadBulba(object : Callback<JsonObject>{
            override fun onFailure(call: Call<JsonObject>, t:Throwable){

            }
            override fun onResponse(call: Call<JsonObject>, response: Response<JsonObject>?){
                response?.body().let {
                    val pokemon = it
                    Log.i("POKEMON",pokemon!!.get("name").toString())
                }
            }
        })
    }
}
