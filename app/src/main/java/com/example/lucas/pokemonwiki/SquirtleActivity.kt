package com.example.lucas.pokemonwiki

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import com.example.lucas.pokemonwiki.Api.Api
import com.google.gson.JsonObject
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class SquirtleActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_squirtle)
        val txtname = findViewById<TextView>(R.id.txtName)

        val call = Api().loadSquirtle(object : Callback<JsonObject> {
            override fun onFailure(call: Call<JsonObject>, t:Throwable){

            }
            override fun onResponse(call: Call<JsonObject>, response: Response<JsonObject>?){
                response?.body().let {
                    val pokemon = it
                    Log.i("POKEMON",pokemon!!.get("name").toString())
                    txtname.text = pokemon.get("name").toString()
                }
            }
        })
    }
}
