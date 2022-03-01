package com.cursokotlin.mvvmexample.data.model

import com.google.gson.annotations.SerializedName

data class QuoteModel(
    @SerializedName("title") val title: String,
    @SerializedName("body") val body: String
)