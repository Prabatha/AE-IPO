package com.example.latihanmobileapp.ui.main

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.`latihanmobileapp`.R
import com.example.`latihanmobileapp`.data.remote.ApiClient
import com.example.latihanmobileapp.data.response.NewsResponse
import retrofit2.Call
import retrofit2.Response

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        getNews()
        initRecyclerView()
    }

    private fun initRecyclerView() {




    }
}

private fun getNews(){
    ApiClient.create().getNews().enqueue(/* callback = */ object : retrofit2.Callback<NewsResponse> {
        override fun onResponse(call: Call<NewsResponse>, response: Response<NewsResponse>) {
            Log.d("MainActivity",response.body()?.totalResults.toString())
        }

        override fun onFailure(call: Call<NewsResponse>, t: Throwable) {
        }
    })
}