package com.example.myapplication

import com.example.myapplication.data.CurrencyResponse

data class PriceModel(
    val currentPrice: Float,
    val timeStamp: String
)

fun CurrencyResponse.toPriceModel(): PriceModel {
    return  PriceModel(
        currentPrice = this.bpi.usd.rateFloat,
        timeStamp = this.time.updated,
    )
}
