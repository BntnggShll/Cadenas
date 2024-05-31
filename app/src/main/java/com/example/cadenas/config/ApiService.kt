package com.example.cadenas.config

import com.example.cadenas.model.MenuModel
import com.example.cadenas.model.SlidersModel
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiService {

    @GET("cadenas/index.php?folder=dashboard&file=sliders")
    fun getSlider(): Call<SlidersModel>

    @GET("cadenas/index.php?folder=dashboard&file=produk")
    fun getProduk(): Call<MenuModel>

    @GET("cadenas/index.php?folder=produk&file=pakaian")
    fun getPakaian(
        @Query("id_user") iduser: String
    ): Call<MenuModel>
}