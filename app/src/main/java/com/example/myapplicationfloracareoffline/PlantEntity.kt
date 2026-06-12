package com.example.myapplicationfloracareoffline

import androidx.room3.Entity
import androidx.room3.PrimaryKey


@Entity(tableName = "plant")
data class PlantEntity (
    @PrimaryKey(autoGenerate = true)
    val id: Int,
    val userId: Int,
    val name: String,
    val species: String,
    val wateringIntervalDays: Int,
    val lastWateredTimestamp: Long,
    val localImageUri: String?,
    val remoteImageUrl: String?,
    val syncStatus: SyncStatus

)

