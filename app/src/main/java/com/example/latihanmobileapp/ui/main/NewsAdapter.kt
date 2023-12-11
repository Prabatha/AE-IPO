package com.example.latihanmobileapp.ui.main

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.`latihanmobileapp`.R
import com.example.`latihanmobileapp`.data.response.ArticlesItem

class NewsAdapter (private val listener: (ArticlesItem)->Unit)  :
    RecyclerView.Adapter<NewsAdapter.ViewHolder>(){

    private var news : MutableList<ArticlesItem>  = mutableListOf<ArticlesItem>()

    fun setNews(news: MutableList<ArticlesItem>){
        this.news = news
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.item_news, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(news[position])
    }

    override fun getItemCount(): Int {
        return news.size
    }

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind(news: ArticlesItem) {

            itemView.setOnClickListener {
                listener(news)
            }
        }

    }

}

