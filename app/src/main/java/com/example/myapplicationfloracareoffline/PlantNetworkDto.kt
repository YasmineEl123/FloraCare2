package com.example.myapplicationfloracareoffline

data class PlantNetworkDto (
    val id: Int,
    val userId: Int,
    val name: String,
    val species: String,
    val wateringIntervalDays: Int,
    val lastWateredTimestamp: Long,
    val imageUrl: String?
)