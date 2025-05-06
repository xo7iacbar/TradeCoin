package com.example.tradecoin.Data.Network


data class CoinInfo(

    @field:SerializedName("Internal")
    val internal: String? = null,

    @field:SerializedName("Rating")
    val rating: Rating? = null,

    @field:SerializedName("BlockTime")
    val blockTime: Int? = null,

    @field:SerializedName("ImageUrl")
    val imageUrl: String? = null,

    @field:SerializedName("MaxSupply")
    val maxSupply: Any? = null,

    @field:SerializedName("DocumentType")
    val documentType: String? = null,

    @field:SerializedName("Algorithm")
    val algorithm: String? = null,

    @field:SerializedName("Url")
    val url: String? = null,

    @field:SerializedName("Name")
    val name: String? = null,

    @field:SerializedName("Type")
    val type: Int? = null,

    @field:SerializedName("ProofType")
    val proofType: String? = null,

    @field:SerializedName("NetHashesPerSecond")
    val netHashesPerSecond: Any? = null,

    @field:SerializedName("AssetLaunchDate")
    val assetLaunchDate: String? = null,

    @field:SerializedName("FullName")
    val fullName: String? = null,

    @field:SerializedName("Id")
    val id: String? = null,

    @field:SerializedName("BlockNumber")
    val blockNumber: Int? = null,

    @field:SerializedName("BlockReward")
    val blockReward: Any? = null
)