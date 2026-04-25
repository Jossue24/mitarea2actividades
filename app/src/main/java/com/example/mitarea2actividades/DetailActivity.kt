package com.example.mitarea2actividades

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class DetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        val tvRecibido = findViewById<android.widget.TextView>(R.id.tvRecibido)
        val btnRegresar = findViewById<android.widget.Button>(R.id.btnRegresar)

        val mensaje = intent.getStringExtra("DATOS")
        tvRecibido.text = mensaje

        btnRegresar.setOnClickListener { finish() }
    }
}