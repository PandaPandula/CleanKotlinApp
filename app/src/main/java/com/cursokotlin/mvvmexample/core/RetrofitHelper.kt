package com.cursokotlin.mvvmexample.core

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitHelper {
    fun getMoviesRetrofit(): Retrofit {
        return Retrofit.Builder()
            .baseUrl("https://621dfd99849220b1fc8bc84b.mockapi.io/api/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }
    fun getImagesRetrofit(): Retrofit {
        return Retrofit.Builder()
            .baseUrl("https://api.thecatapi.com/v1/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }


}