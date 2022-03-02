package com.cursokotlin.mvvmexample.data.network.repos

import com.cursokotlin.mvvmexample.data.model.ImageModel
import com.cursokotlin.mvvmexample.data.network.service.ImagesService

class ImagesRepository {
    private val api = ImagesService()

    suspend fun getImage() : List<ImageModel> {
        return api.getImage()
    }

}