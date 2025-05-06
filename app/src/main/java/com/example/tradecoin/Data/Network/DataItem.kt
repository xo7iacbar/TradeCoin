package com.example.tradecoin.Data.Network


data class DataItem(

    @field:SerializedName("ConversionInfo")
    val conversionInfo: ConversionInfo? = null,

    @field:SerializedName("CoinInfo")
    val coinInfo: CoinInfo? = null
)