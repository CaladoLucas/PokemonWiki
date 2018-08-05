package com.example.lucas.pokemonwiki

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnBulbassaur.setOnClickListener{
            startActivity(Intent(this,BulbassaurActivity::class.java))
        }
        btnCharmander.setOnClickListener{
            startActivity(Intent(this,CharmanderActivity::class.java))
        }
        btnSquirtle.setOnClickListener{
            startActivity(Intent(this,SquirtleActivity::class.java))
        }
    }
}
