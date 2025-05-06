package com.example.tradecoin.Data.Network

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory


class Network {
    val base_url="https://min-api.cryptocompare.com"
    fun getRetrofit():Retrofit{
        return Retrofit.Builder().baseUrl(base_url).addConverterFactory((GsonConverterFactory.create())).build()
    }
}

