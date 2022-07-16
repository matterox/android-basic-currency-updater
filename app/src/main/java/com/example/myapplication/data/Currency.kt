package com.example.myapplication.data

import com.google.gson.annotations.SerializedName

data class Currency(
    @SerializedName("code")
    val code: String,
    @SerializedName("symbol")
    val symbol: String,
    @SerializedName("rate")
    val rate: String,
    @SerializedName("description")
    val description: String,
    @SerializedName("rate_float")
    val rateFloat: Float
)
