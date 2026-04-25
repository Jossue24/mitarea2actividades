package com.example.mitarea2actividades

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val etMensaje = findViewById<android.widget.EditText>(R.id.etMensaje)
        val btnEnviar = findViewById<android.widget.Button>(R.id.btnEnviar)

        btnEnviar.setOnClickListener {
            val intent = android.content.Intent(this, DetailActivity::class.java)
            intent.putExtra("DATOS", etMensaje.text.toString())
            startActivity(intent)
        }
    }
}