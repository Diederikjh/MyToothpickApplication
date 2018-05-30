package com.honeybeeapp.toothpicktest.mytoothpickapplication.deps;

import javax.inject.Inject;

/**
 * Created by djh on 2018/05/30.
 */


public class CoffeeMaker {

    @Inject
    Heater heater;
    @Inject
    Pump pump;

    @Inject
    public CoffeeMaker() {
    }
}
