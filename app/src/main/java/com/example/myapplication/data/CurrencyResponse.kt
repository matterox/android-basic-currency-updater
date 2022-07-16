package com.example.myapplication.data

import com.google.gson.annotations.SerializedName

data class CurrencyResponse(
    @SerializedName("time")
    val time: Time,
    @SerializedName("disclaimer")
    val disclaimer: String,
    @SerializedName("chartName")
    val chartName: String,
    @SerializedName("bpi")
    val bpi: Bpi
)
