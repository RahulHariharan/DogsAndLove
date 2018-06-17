package com.funworks.dogsandlove

import android.app.Application

/**
 * Created by rahulhariharan on 17/06/18.
 */
class DogsAndLoveApplication : Application {

    constructor() : super()

    companion object {
        //platformStatic allow access it from java code
        @JvmStatic lateinit var graph: SubmarineComponent
    }

    lateinit var submarineComponent : SubmarineComponent

    override fun onCreate() {
        super.onCreate()
    }
}