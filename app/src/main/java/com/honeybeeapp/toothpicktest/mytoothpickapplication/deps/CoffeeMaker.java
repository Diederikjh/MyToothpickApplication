package com.honeybeeapp.toothpicktest.mytoothpickapplication.deps;

import javax.inject.Inject;

/**
 * Created by djh on 2018/05/30.
 */


public class CoffeeMaker {

    public Heater getHeater() {
        return heater;
    }

    public Pump getPump() {
        return pump;
    }

    @Inject
    Heater heater;
    @Inject
    Pump pump;

    @Inject
    public CoffeeMaker() {
    }
}
