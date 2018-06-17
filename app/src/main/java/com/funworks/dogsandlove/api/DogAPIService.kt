package com.funworks.dogsandlove.api

import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET

/**
 * Created by rahulhariharan on 17/06/18.
 */
interface DogAPIService {

    @GET("/api/breeds/image/random")
    fun getRandomDog() : Call<RandomDog>

    companion object Factory {
        fun create() : DogAPIService {
            return Retrofit.Builder()
                    .baseUrl("https://dog.ceo/")
                    .addConverterFactory(GsonConverterFactory.create())
                    .build().create(DogAPIService::class.java)
        }
    }

}