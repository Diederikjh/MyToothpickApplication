package com.honeybeeapp.toothpicktest.mytoothpickapplication;

import android.content.Context;

import com.honeybeeapp.toothpicktest.mytoothpickapplication.deps.CoffeeMakerFactory;

import javax.inject.Singleton;

import dagger.BindsInstance;
import dagger.Component;

/**
 * Created by djh on 2018/05/30.
 */

@Component(modules = TestCoffeeModule.class)
@Singleton
public interface TestCoffeeMakerFactory extends CoffeeMakerFactory {

    @Component.Builder
    interface Builder {
        @BindsInstance
        Builder context(Context context);
        TestCoffeeMakerFactory build();
    }
}
