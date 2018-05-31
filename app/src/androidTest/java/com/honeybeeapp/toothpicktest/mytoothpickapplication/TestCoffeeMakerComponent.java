package com.honeybeeapp.toothpicktest.mytoothpickapplication;

import android.content.Context;

import com.honeybeeapp.toothpicktest.mytoothpickapplication.deps.CoffeeMakerComponent;

import javax.inject.Singleton;

import dagger.BindsInstance;
import dagger.Component;

/**
 * Created by djh on 2018/05/30.
 */

@Component(modules = TestCoffeeModule.class)
@Singleton
public interface TestCoffeeMakerComponent extends CoffeeMakerComponent {

    @Component.Builder
    interface Builder {
        @BindsInstance
        Builder context(Context context);
        TestCoffeeMakerComponent build();
    }
}
