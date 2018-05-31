package com.honeybeeapp.toothpicktest.mytoothpickapplication.deps;

import android.content.Context;

import javax.inject.Singleton;

import dagger.BindsInstance;
import dagger.Component;

/**
 * Created by djh on 2018/05/30.
 */

@Component(modules = CoffeeModule.class)
@Singleton
public interface CoffeeMakerComponent {
    CoffeeMaker createMaker();

    @Component.Builder
    interface Builder {
        @BindsInstance
        Builder context(Context context);
        CoffeeMakerComponent build();
    }
}
