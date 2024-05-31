package com.example.cadenas.model

data class MenuModel(
    val success : Int,
    val message : String,
    val list_pakaian : ArrayList<DataKategoriMenu>
){

    data class DataKategoriMenu(
        val image : String,
        val nama : String,
        val harga : String,
        val promo : String
    )

}
