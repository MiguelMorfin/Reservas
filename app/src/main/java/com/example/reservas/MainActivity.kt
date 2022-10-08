package com.example.reservas

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity


var btniniciarsesion: Button? = null

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        btniniciarsesion = findViewById(R.id.btniniciarsesion)

        btniniciarsesion!!.setOnClickListener{

                val intent = Intent(this, Recibidor::class.java)
            startActivity(intent)
        }

    }
}