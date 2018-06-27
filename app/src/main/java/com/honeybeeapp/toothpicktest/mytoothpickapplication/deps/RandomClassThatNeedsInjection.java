package com.honeybeeapp.toothpicktest.mytoothpickapplication.deps;

import android.content.Context;

import com.honeybeeapp.toothpicktest.mytoothpickapplication.di.AdhocInjectionComponent;
import com.honeybeeapp.toothpicktest.mytoothpickapplication.di.DaggerAdhocInjectionComponent;

public class RandomClassThatNeedsInjection {

    private final CustomersDao mCustomersDao;

    public RandomClassThatNeedsInjection(Context context) {

        AdhocInjectionComponent component =
                DaggerAdhocInjectionComponent.build();
        // Not as nice as @Injection, but will do.
        mCustomersDao = component.customersDao();
    }
}
