package com.example.myapplication

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class MainViewModel: ViewModel() {
    private val _priceLiveData: MutableLiveData<List<PriceModel>> = MutableLiveData()
    val priceLiveData: LiveData<List<PriceModel>> = _priceLiveData

    private val priceHistory: MutableList<PriceModel> = mutableListOf()

    fun start() {
        viewModelScope.launch {
            while(true) {
                val result = CurrencyService.getService().currentPrice()
                priceHistory.add(result.toPriceModel())
                _priceLiveData.value = priceHistory.toList().takeLast(50).reversed()
                delay(1000L)
            }
        }
    }
}