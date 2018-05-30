package com.honeybeeapp.toothpicktest.mytoothpickapplication.deps;

import android.content.Context;

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
    static Heater provideHeater(Context context) {
        return new ContextAwareHeaterFull(context);
    }

    @Provides
    static Pump providePump() {
        return new Pump();
    }

}
