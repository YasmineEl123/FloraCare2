package com.example.myapplicationfloracareoffline

import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.material3.FloatingActionButton
import com.google.android.material.floatingactionbutton.FloatingActionButton

class PlantDetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_plant_detail)

        val btnRetour = findViewById<FloatingActionButton>(R.id.btnRetour)
        val btnSave = findViewById<Button>(R.id.btnSave)
        val btnCancel = findViewById<Button>(R.id.btnCancel)

        btnRetour.setOnClickListener {
            finish()
        }

        btnCancel.setOnClickListener {
            finish()
        }

        btnSave.setOnClickListener {
            Toast.makeText(this, "Plante enregistrée", Toast.LENGTH_SHORT).show()
        }
    }
}