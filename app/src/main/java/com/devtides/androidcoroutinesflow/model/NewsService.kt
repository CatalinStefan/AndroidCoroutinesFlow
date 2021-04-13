package com.devtides.androidcoroutinesflow.model

import retrofit2.http.GET

interface NewsService {
    @GET("news.json")
    suspend fun getNews(): List<NewsArticle>
}