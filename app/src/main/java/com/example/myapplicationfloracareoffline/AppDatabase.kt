package com.example.myapplicationfloracareoffline

import androidx.room3.Database
import androidx.room3.Entity
import androidx.room3.RoomDatabase


@Database (
    entities = [PlantEntity::class],
    version = 1
)
abstract class AppDatabase  : RoomDatabase(){
    abstract fun plantDao () : PlantDao

}