package com.honeybeeapp.toothpicktest.mytoothpickapplication.deps;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by djh on 2018/05/30.
 */

@Module
public class CoffeeModule {

    @Provides
    @Singleton /* Means singleton per component. */
    static Heater provideHeater() {
        return new Heater();
    }

    @Provides
    static Pump providePump() {
        return new Pump();
    }

}
