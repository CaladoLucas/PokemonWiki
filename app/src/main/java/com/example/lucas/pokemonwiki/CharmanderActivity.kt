package com.example.lucas.pokemonwiki

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import com.example.lucas.pokemonwiki.Api.Api
import com.google.gson.JsonObject
import kotlinx.android.synthetic.main.activity_charmander.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class CharmanderActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_charmander)

        val txtname = findViewById<TextView>(R.id.txtName)

        val call = Api().loadCharmander(object : Callback<JsonObject>{
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
