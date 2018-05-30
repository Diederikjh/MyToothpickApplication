package com.honeybeeapp.toothpicktest.mytoothpickapplication;

import android.content.Context;

import com.honeybeeapp.toothpicktest.mytoothpickapplication.deps.Heater;
import com.honeybeeapp.toothpicktest.mytoothpickapplication.deps.Pump;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by djh on 2018/05/30.
 */

@Module
public class TestCoffeeModule {

    @Provides
    @Singleton /* Means singleton per component. */
    static Heater provideHeater(Context context) {
        return new TestContextAwareHeaterDemo(context);
    }

    @Provides
    static Pump providePump() {
        return new TestPump();
    }

}
