package com.cursokotlin.mvvmexample.domain

import com.cursokotlin.mvvmexample.data.network.repos.ImagesRepository

class GetImageUseCase {
    private val repo = ImagesRepository()

    suspend operator fun invoke() = repo.getImage()
}
