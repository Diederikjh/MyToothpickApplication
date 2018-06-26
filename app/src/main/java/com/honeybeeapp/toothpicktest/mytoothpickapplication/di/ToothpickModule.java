package com.honeybeeapp.toothpicktest.mytoothpickapplication.di;

import com.honeybeeapp.toothpicktest.mytoothpickapplication.deps.CustomersDao;
import com.honeybeeapp.toothpicktest.mytoothpickapplication.deps.HTTPRequestFactoryProvider;
import com.honeybeeapp.toothpicktest.mytoothpickapplication.deps.IHTTPRequestFactory;
import com.honeybeeapp.toothpicktest.mytoothpickapplication.deps.ProductsDao;

import toothpick.config.Module;

/**
 * Created by djh on 2018/06/26.
 */

public class ToothpickModule extends Module {

    public ToothpickModule() {
        bind(IHTTPRequestFactory.class).toProvider(HTTPRequestFactoryProvider.class).providesSingletonInScope();

        bindDaos();
    }

    private void bindDaos() {
        bind(DBConnection.class).to(DBConnection.class);

        bind(CustomersDao.class).toProviderInstance(new CustomersDaoProvider());
        bind(ProductsDao.class).to(ProductsDao.class);
    }

}
