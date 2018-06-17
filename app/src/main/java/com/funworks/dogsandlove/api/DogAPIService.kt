package com.funworks.dogsandlove.api

import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET
import retrofit2.http.Path

/**
 * Created by rahulhariharan on 17/06/18.
 */
interface DogAPIService {

    @GET("/api/breeds/image/random")
    fun getRandomDog() : Call<RandomDog>

    @GET("/api/breeds/image/random/{size}")
    fun getRandomDogs(@Path("size") size : Int) : Call<RandomDogs>

    @GET("/api/breed/{breed}/images")
    fun getDogsByBreed(@Path("breed") breed: String) : Call<RandomDogs>

    @GET("/api/breed/{breed}/images/random")
    fun getRandomDogByBreed(@Path("breed") breed: String) : Call<RandomDog>

    companion object Factory {
        fun create() : DogAPIService {
            return Retrofit.Builder()
                    .baseUrl("https://dog.ceo/")
                    .addConverterFactory(GsonConverterFactory.create())
                    .build().create(DogAPIService::class.java)
        }
    }

}