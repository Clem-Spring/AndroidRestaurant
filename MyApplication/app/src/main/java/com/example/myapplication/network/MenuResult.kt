package com.example.myapplication.network

import com.example.myapplication.Category
import com.google.gson.annotations.SerializedName
import java.io.Serializable

class MenuResult(@SerializedName("data") val data: List<Category>): Serializable {
}