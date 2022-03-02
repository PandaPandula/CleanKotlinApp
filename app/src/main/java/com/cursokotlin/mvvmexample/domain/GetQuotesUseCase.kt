package com.cursokotlin.mvvmexample.domain

import com.cursokotlin.mvvmexample.data.network.repos.QuoteRepository

class GetQuotesUseCase {

    private val repository = QuoteRepository()

    suspend operator fun invoke() = repository.getAllQuotes()

}