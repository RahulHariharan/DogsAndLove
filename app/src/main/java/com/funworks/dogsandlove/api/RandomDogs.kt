package com.funworks.dogsandlove.api

import com.google.gson.annotations.SerializedName

/**
 * Created by rahulhariharan on 18/06/18.
 */
data class RandomDogs(@SerializedName("status") val status : String,
                      @SerializedName("message") val messages : List<String>)