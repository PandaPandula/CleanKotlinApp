package com.cursokotlin.mvvmexample.data.network.apis

import com.cursokotlin.mvvmexample.data.model.QuoteModel
import retrofit2.Response
import retrofit2.http.GET

interface QuoteApiClient {
    @GET("/peliculas")
    suspend fun getAllQuotes(): Response<List<QuoteModel>>
}