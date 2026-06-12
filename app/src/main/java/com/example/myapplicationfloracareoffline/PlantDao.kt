package com.example.myapplicationfloracareoffline

import androidx.room3.Dao
import androidx.room3.Delete
import androidx.room3.Insert
import androidx.room3.Query

@Dao
interface PlantDao {
    @Insert
    suspend fun insertPlant(plant : PlantEntity)
    @Query("SELECT * FROM plants")
    suspend fun getAllPlants(): List<PlantEntity>
    @Delete
    suspend fun deletePlant(plant: PlantEntity)


}