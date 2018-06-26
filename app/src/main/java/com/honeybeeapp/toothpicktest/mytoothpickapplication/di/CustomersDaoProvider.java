package com.honeybeeapp.toothpicktest.mytoothpickapplication.di;

import com.honeybeeapp.toothpicktest.mytoothpickapplication.deps.CustomersDao;

import javax.inject.Inject;
import javax.inject.Provider;

/**
 * Created by djh on 2018/06/26.
 */

class CustomersDaoProvider implements Provider<CustomersDao> {

    @Inject // Doesn't actually work.
    DBConnection mDBConnection;

    @Override
    public CustomersDao get() {
        return new CustomersDao(mDBConnection);
    }
}
