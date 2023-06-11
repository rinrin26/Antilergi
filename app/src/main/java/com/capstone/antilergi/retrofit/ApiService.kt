package com.capstone.antilergi.retrofit

import com.capstone.antilergi.model.ArticleResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query


interface ApiService {
    @GET("search/article")
    fun searchArticle(@Query("q") alergi: String): Call<ArticleResponse>
}