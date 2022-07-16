package com.example.myapplication.data

import com.google.gson.annotations.SerializedName

data class Bpi(
    @SerializedName("USD")
    val usd: Currency,
    @SerializedName("GBP")
    val gbp: Currency,
    @SerializedName("EUR")
    val euro: Currency
)
