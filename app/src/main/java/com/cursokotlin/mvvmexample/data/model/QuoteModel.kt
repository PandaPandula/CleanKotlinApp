package com.cursokotlin.mvvmexample.data.model

import com.google.gson.annotations.SerializedName

data class QuoteModel(
    @SerializedName("nombre") val title: String,
    @SerializedName("director") val body: String
)