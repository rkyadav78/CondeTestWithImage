package com.e.condetestwithimage.network

import com.e.condetestwithimage.model.ModelResponse
import io.reactivex.Single
import retrofit2.http.GET


interface Api {
    //@GET("api/?results=20")
    @GET("top-headlines?country=us&category=business&apiKey=4d9d3dbe7a0848c0a080115afea0b561")
    fun getRandomUserList(): Single<ModelResponse>
}