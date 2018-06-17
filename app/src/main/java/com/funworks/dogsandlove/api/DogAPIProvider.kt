package com.funworks.dogsandlove.api

import android.util.Log
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

/**
 * Created by rahulhariharan on 17/06/18.
 */
class DogAPIProvider : DogAPIService {

    override fun getRandomDogs(size: Int): Call<RandomDogs> {
        var randomDogs : Call<RandomDogs> = DogAPIService.create().getRandomDogs(size)
        randomDogs.enqueue(object : Callback<RandomDogs> {
            override fun onFailure(call: Call<RandomDogs>?, t: Throwable?) {}
            override fun onResponse(call: Call<RandomDogs>?, response: Response<RandomDogs>?) {}
        })
        return randomDogs
    }

    override fun getDogsByBreed(breed: String): Call<RandomDogs> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getRandomDogByBreed(breed: String): Call<RandomDog> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getRandomDog(): Call<RandomDog> {
        var randomDog : Call<RandomDog> = DogAPIService.create().getRandomDog()
        randomDog.enqueue(object : Callback<RandomDog> {
            override fun onFailure(call: Call<RandomDog>?, t: Throwable?) {}
            override fun onResponse(call: Call<RandomDog>?, response: Response<RandomDog>?) {}
        })
        return randomDog
    }
}