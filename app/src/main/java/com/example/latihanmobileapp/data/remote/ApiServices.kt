package com.example.latihanmobileapp.data.remote

import com.example.latihanmobileapp.data.response.NewsResponse
import retrofit2.Call
import retrofit2.http.GET

interface ApiServices {

    @GET("/everything?q=+IPO+Indonesia&apiKey=69f7592adf904e22a41c6219a04007b8")
    fun getNews(): Call<NewsResponse>
}