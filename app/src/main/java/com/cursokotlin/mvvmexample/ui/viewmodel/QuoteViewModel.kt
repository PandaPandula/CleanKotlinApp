package com.cursokotlin.mvvmexample.ui.viewmodel

import android.widget.ImageView
import androidx.databinding.ObservableBoolean
import androidx.databinding.ObservableField
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.cursokotlin.mvvmexample.data.model.ImageModel
import com.cursokotlin.mvvmexample.data.model.QuoteModel
import com.cursokotlin.mvvmexample.domain.GetImageUseCase
import com.cursokotlin.mvvmexample.domain.GetQuotesUseCase
import com.cursokotlin.mvvmexample.domain.GetRandomQuoteUseCase
import com.squareup.picasso.Picasso
import kotlinx.coroutines.launch
import java.util.*

class QuoteViewModel : ViewModel() {

    val quoteModel = ObservableField<QuoteModel>()
    val isLoading = ObservableField<Boolean>()
    val imageModel = ObservableField<ImageModel>()

    var getQuotesUseCase = GetQuotesUseCase()
    var getRandomQuoteUseCase = GetRandomQuoteUseCase()
    var getImageUseCase =  GetImageUseCase()

    fun onCreate() {
        viewModelScope.launch {
            isLoading.set(true)
            val result = getQuotesUseCase()
            val imageCat = getImageUseCase()
            if(!result.isNullOrEmpty()){
                quoteModel.set(result[0])
                if (!imageCat.isNullOrEmpty()) imageModel.set(imageCat[0])
                isLoading.set(false)
            }
        }
    }

    fun randomQuote() {
        viewModelScope.launch {
            isLoading.set(true)
            val quote = getRandomQuoteUseCase()
            val image = getImageUseCase()
            if(quote!=null){
                quoteModel.set(quote)
                if (!image.isNullOrEmpty()) imageModel.set(image[0])
            }
            isLoading.set(false)
        }
    }
}