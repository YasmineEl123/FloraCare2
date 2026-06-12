package com.example.myapplicationfloracareoffline

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.material3.FloatingActionButton
import com.google.android.material.floatingactionbutton.FloatingActionButton

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val btnLogin = findViewById<Button>(R.id.btnLogin)
        val btnRetour = findViewById<FloatingActionButton>(R.id.btnRetour)
        val txtRegister = findViewById<TextView>(R.id.txtRegister)

        btnLogin.setOnClickListener(){
        }

        txtRegister.setOnClickListener {

        }

        btnRetour.setOnClickListener {
            finish()
        }
    }
}