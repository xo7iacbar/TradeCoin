package com.example.tradecoin.Data.Network

import com.google.gson.annotations.SerializedName

data class Response(

	@field:SerializedName("RateLimit")
	val rateLimit: RateLimit? = null,

	@field:SerializedName("Type")
	val type: Int? = null,

	@field:SerializedName("Message")
	val message: String? = null,

	@field:SerializedName("MetaData")
	val metaData: MetaData? = null,

	@field:SerializedName("HasWarning")
	val hasWarning: Boolean? = null,

	@field:SerializedName("Data")
	val data: List<DataItem?>? = null,

	@field:SerializedName("SponsoredData")
	val sponsoredData: List<Any?>? = null
)






