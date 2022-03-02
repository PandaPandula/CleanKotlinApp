package com.cursokotlin.mvvmexample.data.network.service

import com.cursokotlin.mvvmexample.core.RetrofitHelper
import com.cursokotlin.mvvmexample.data.model.ImageModel
import com.cursokotlin.mvvmexample.data.network.apis.ImagesApiClient
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class ImagesService {
    private val retrofit = RetrofitHelper.getImagesRetrofit()

    suspend fun getImage(): List<ImageModel> {
       return withContext(Dispatchers.IO){
           val response = retrofit.create(ImagesApiClient::class.java).getImage()
           response.body() ?: emptyList()
       }
    }

}