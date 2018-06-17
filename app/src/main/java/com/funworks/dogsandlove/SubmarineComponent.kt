package com.funworks.dogsandlove

import dagger.Component

/**
 * Created by rahulhariharan on 17/06/18.
 */

@Component(modules = arrayOf(SubmarineModule::class))
interface SubmarineComponent {
    fun inject(activity: MainActivity)
}