package com.honeybeeapp.toothpicktest.mytoothpickapplication.deps;

import dagger.Component;

/**
 * Created by djh on 2018/05/30.
 */

@Component
public interface CoffeeMakerFactory {
    CoffeeMaker createMaker();
}
