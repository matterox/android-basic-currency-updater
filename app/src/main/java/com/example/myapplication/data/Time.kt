package com.example.myapplication.data

import com.google.gson.annotations.SerializedName

data class Time(
    @SerializedName("updated")
    val updated: String,
    @SerializedName("updatedISO")
    val updatedISO: String,
    @SerializedName("updateduk")
    val updateduk: String
)
