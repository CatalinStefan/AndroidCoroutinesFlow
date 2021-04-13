package com.devtides.androidcoroutinesflow.view

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.devtides.androidcoroutinesflow.R
import com.devtides.androidcoroutinesflow.databinding.ItemNewsArticleBinding
import com.devtides.androidcoroutinesflow.model.NewsArticle
import com.devtides.coroutinesretrofit.view.loadImage

class NewsListAdapter: RecyclerView.Adapter<NewsListAdapter.NewsItemViewHolder>() {

    private val newsItems = arrayListOf<NewsArticle>()

    inner class NewsItemViewHolder(val binding: ItemNewsArticleBinding): RecyclerView.ViewHolder(binding.root)

    fun onAddNewsItem(item: NewsArticle) {
        newsItems.add(0, item)
        notifyItemInserted(0)
    }

    override fun onCreateViewHolder(parent: ViewGroup, p1: Int): NewsItemViewHolder {
        val binding = ItemNewsArticleBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return NewsItemViewHolder(binding)
    }

    override fun getItemCount() = newsItems.size

    override fun onBindViewHolder(holder: NewsItemViewHolder, position: Int) {
        val model = newsItems[position]
        with(holder) {
            binding.newsImage.loadImage(model.urlToImage)
            binding.newsAuthor.text = model.author
            binding.newsTitle.text = model.title
            binding.newsPublishedAt.text = model.publishedAt
        }

//
    }


}