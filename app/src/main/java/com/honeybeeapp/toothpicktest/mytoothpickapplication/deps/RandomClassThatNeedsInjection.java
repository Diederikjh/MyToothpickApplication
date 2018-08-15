package com.honeybeeapp.toothpicktest.mytoothpickapplication.deps;

import android.util.Log;

import javax.inject.Inject;

public class RandomClassThatNeedsInjection {

    private static final String LOG_TAG = RandomClassThatNeedsInjection.class.getName();

    private final CustomersDao mCustomersDao;

    // Rather set inject constructor, instead of requiring a different component
    // for adhoc injections.
    @Inject
    public RandomClassThatNeedsInjection(CustomersDao customersDao) {
        mCustomersDao = customersDao;
    }
    
    public void doRandomStuff(){
        Log.d(LOG_TAG, "Doing mah thing! :)");
    }
        
}
