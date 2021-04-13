package com.devtides.androidcoroutinesflow.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.asLiveData
import com.devtides.androidcoroutinesflow.model.NewsRepository

class ListViewModel: ViewModel() {

    private var newsRepository: NewsRepository = NewsRepository()

    val newsArticles = newsRepository.getNewsArticles().asLiveData()

}