package com.funworks.dogsandlove.api

import android.util.Log
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

/**
 * Created by rahulhariharan on 17/06/18.
 */
class DogAPIProvider : DogAPIService {

    override fun getRandomDog(): Call<RandomDog> {
        var randomDog : Call<RandomDog> = DogAPIService.create().getRandomDog()
        randomDog.enqueue(object : Callback<RandomDog> {
            override fun onFailure(call: Call<RandomDog>?, t: Throwable?) {
               Log.v("error_",call.toString())
            }

            override fun onResponse(call: Call<RandomDog>?, response: Response<RandomDog>?) {
                Log.v("success_", response.toString())
            }

        })
        return randomDog
    }
}