package com.example.myapplication.repository

import com.example.myapplication.data.CurrencyResponse
import retrofit2.http.GET

interface CurrencyApi {
    @GET("v1/bpi/currentprice.json")
    suspend fun currentPrice(): CurrencyResponse
}