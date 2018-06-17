package com.funworks.dogsandlove.api

import com.google.gson.annotations.SerializedName

/**
 * Created by rahulhariharan on 17/06/18.
 */
data class RandomDog(@SerializedName("status") val status : String,
                     @SerializedName("message") val message : String)