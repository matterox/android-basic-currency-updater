package com.example.myapplication

import com.example.myapplication.repository.CurrencyApi
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object CurrencyService {
    fun getService() = service.value
    private val service: Lazy<CurrencyApi> = lazy {
        val retrofit: Retrofit = Retrofit.Builder()
            .baseUrl("https://api.coindesk.com/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()

        return@lazy retrofit.create(CurrencyApi::class.java)
    }
}