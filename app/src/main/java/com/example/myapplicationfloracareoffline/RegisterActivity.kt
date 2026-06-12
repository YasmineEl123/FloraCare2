package com.example.myapplicationfloracareoffline

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.floatingactionbutton.FloatingActionButton

class RegisterActivity  : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        val btnRegister = findViewById<Button>(R.id.btnRegister)
        val btnRetour = findViewById<FloatingActionButton>(R.id.btnRetour)
        val txtLogin = findViewById<TextView>(R.id.txtLogin)

        btnRegister.setOnClickListener {
            // Code d'inscription
        }

        txtLogin.setOnClickListener {
            finish() // Retour à LoginActivity
        }

        btnRetour.setOnClickListener {
            finish()
        }
    }
}