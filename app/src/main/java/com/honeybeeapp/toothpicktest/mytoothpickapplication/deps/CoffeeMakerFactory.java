package com.honeybeeapp.toothpicktest.mytoothpickapplication.deps;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by djh on 2018/05/30.
 */

@Component(modules = CoffeeModule.class)
@Singleton
public interface CoffeeMakerFactory {
    CoffeeMaker createMaker();
}
