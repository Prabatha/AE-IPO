package com.example.latihanmobileapp.data.response

import com.google.gson.annotations.SerializedName as SerializedName1

data class NewsResponse(

	@field:SerializedName1("totalResults")
	val totalResults: Int? = null,

	@field:SerializedName1("articles")
	val articles: List<ArticlesItem?>? = null,

	@field:SerializedName1("status")
	val status: String? = null
)

data class Source(

	@field:SerializedName1("name")
	val name: String? = null,

	@field:SerializedName1("id")
	val id: Any? = null
)

data class ArticlesItem(

	@field:SerializedName1("publishedAt")
	val publishedAt: String? = null,

	@field:SerializedName1("author")
	val author: String? = null,

	@field:SerializedName1("urlToImage")
	val urlToImage: String? = null,

	@field:SerializedName1("description")
	val description: String? = null,

	@field:SerializedName1("source")
	val source: Source? = null,

	@field:SerializedName1("title")
	val title: String? = null,

	@field:SerializedName1("url")
	val url: String? = null,

	@field:SerializedName1("content")
	val content: String? = null
)
