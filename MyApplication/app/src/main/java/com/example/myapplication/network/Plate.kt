package com.example.myapplication.network

import com.google.gson.annotations.SerializedName
import java.io.Serializable

class Plate (
    @SerializedName("name_fr") val name: String,
    @SerializedName("images")val img: List<String>,
    @SerializedName("prices")val prices: List<Price>,
    @SerializedName("Ingredients")val ingredients: List<Ingredient>
    ): Serializable {

}
