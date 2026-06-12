package com.example.myapplicationfloracareoffline

import android.content.Intent
import android.os.Bundle
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat.startActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.floatingactionbutton.FloatingActionButton

class PlantListActivity  : AppCompatActivity() {

    private lateinit var recyclerPlants: RecyclerView
    private lateinit var etSearch: EditText
    private lateinit var btnAjouter: FloatingActionButton
    private lateinit var btnRetour: FloatingActionButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_plant_list)

        // Liaison avec le XML
        recyclerPlants = findViewById(R.id.recyclerPlants)
        etSearch = findViewById(R.id.etSearch)
        btnAjouter = findViewById(R.id.btnAjouter)
        btnRetour = findViewById(R.id.btnRetour)

        // RecyclerView
        recyclerPlants.layoutManager = LinearLayoutManager(this)

        // Exemple avec une liste vide
        val plantes = ArrayList<String>()

        plantes.add("Mon beau Ficus")
        plantes.add("Monstera Sauvage")
        plantes.add("Cactus du Bureau")

        val adapter = PlantAdapter(plantes)

        recyclerPlants.adapter = adapter

        // Bouton Ajouter
        btnAjouter.setOnClickListener {

            val intent = Intent(
                this,
                PlantDetailActivity::class.java
            )

            startActivity(intent)
        }

        // Bouton Retour
        btnRetour.setOnClickListener {
            finish()
        }
    }
}