package com.devtides.androidcoroutinesflow.model

import com.google.gson.annotations.SerializedName


data class NewsArticle(
    val author: String? = null,
    val title: String? = null,
    val description: String? = null,
    val url: String? = null,
    @SerializedName("imageUrl")
    val urlToImage: String? = null,
    val publishedAt: String? = null
)