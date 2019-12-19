package com.devtides.coroutinesretrofit.view

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.devtides.androidcoroutinesflow.R
import com.devtides.androidcoroutinesretrofit.model.NewsArticle
import kotlinx.android.synthetic.main.item_news_article.view.*

class NewsListAdapter: RecyclerView.Adapter<NewsListAdapter.NewsItemViewHolder>() {

    private val newsItems = arrayListOf<NewsArticle>()

    fun onAddNewsItem(item: NewsArticle) {
        newsItems.add(0, item)
        notifyItemInserted(0)
    }

    override fun onCreateViewHolder(parent: ViewGroup, p1: Int) = NewsItemViewHolder(
        LayoutInflater.from(parent.context).inflate(R.layout.item_news_article, parent, false)
    )

    override fun getItemCount() = newsItems.size

    override fun onBindViewHolder(holder: NewsItemViewHolder, position: Int) {
        holder.bind(newsItems[position])
    }

    class NewsItemViewHolder(view: View): RecyclerView.ViewHolder(view) {

        private val imageView = view.newsImage
        private val author = view.newsAuthor
        private val title = view.newsTitle
        private val publishedAt = view.newsPublishedAt

        fun bind(newsItem: NewsArticle) {
            imageView.loadImage(newsItem.urlToImage)
            author.text = newsItem.author
            title.text = newsItem.title
            publishedAt.text = newsItem.publishedAt
        }
    }
}