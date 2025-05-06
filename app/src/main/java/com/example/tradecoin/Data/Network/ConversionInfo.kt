package com.example.tradecoin.Data.Network

data class ConversionInfo(

    @field:SerializedName("SubBase")
    val subBase: String? = null,

    @field:SerializedName("ConversionSymbol")
    val conversionSymbol: String? = null,

    @field:SerializedName("TotalVolume24H")
    val totalVolume24H: Any? = null,

    @field:SerializedName("SubsNeeded")
    val subsNeeded: List<String?>? = null,

    @field:SerializedName("Supply")
    val supply: Int? = null,

    @field:SerializedName("RAW")
    val rAW: List<String?>? = null,

    @field:SerializedName("CurrencyFrom")
    val currencyFrom: String? = null,

    @field:SerializedName("Conversion")
    val conversion: String? = null,

    @field:SerializedName("Market")
    val market: String? = null,

    @field:SerializedName("CurrencyTo")
    val currencyTo: String? = null,

    @field:SerializedName("TotalTopTierVolume24H")
    val totalTopTierVolume24H: Any? = null,

    @field:SerializedName("MktCapPenalty")
    val mktCapPenalty: Int? = null,

    @field:SerializedName("DirectPairAvailable")
    val directPairAvailable: Boolean? = null
)
