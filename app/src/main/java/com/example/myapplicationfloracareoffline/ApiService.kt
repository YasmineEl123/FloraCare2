package com.example.myapplicationfloracareoffline

import retrofit2.http.GET

interface ApiService {
    @GET("plant")
    suspend fun getPlant() : List<PlantNetworkDto>


}