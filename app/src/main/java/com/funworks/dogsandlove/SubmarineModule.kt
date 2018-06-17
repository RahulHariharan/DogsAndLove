package com.funworks.dogsandlove

import dagger.Module
import dagger.Provides

/**
 * Created by rahulhariharan on 17/06/18.
 */
@Module
class SubmarineModule {

    @Provides
    fun getPropeller(): Propeller {
      return Propeller()
    }

    @Provides
    fun getReactor() : Reactor {
        return Reactor()
    }

    @Provides
    fun getSubmarine() : Submarine {
        return Submarine()
    }
}
