package com.cursokotlin.mvvmexample.data.network.apis

import com.cursokotlin.mvvmexample.data.model.ImageModel
import com.cursokotlin.mvvmexample.data.model.QuoteModel
import retrofit2.Response
import retrofit2.http.GET

interface ImagesApiClient {
    @GET("/images/search")
    suspend fun getImage(): Response<List<ImageModel>>
}