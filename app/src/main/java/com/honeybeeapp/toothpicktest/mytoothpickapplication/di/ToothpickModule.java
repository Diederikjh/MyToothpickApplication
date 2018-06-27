package com.honeybeeapp.toothpicktest.mytoothpickapplication.di;

import android.content.Context;

import com.honeybeeapp.toothpicktest.mytoothpickapplication.deps.HTTPRequestFactoryProvider;
import com.honeybeeapp.toothpicktest.mytoothpickapplication.deps.IHTTPRequestFactory;

import toothpick.config.Module;

/**
 * Created by djh on 2018/06/26.
 */

public class ToothpickModule extends Module {

    private Context mContext;

    public ToothpickModule(Context context) {
        mContext = context;
        bind(IHTTPRequestFactory.class)
                .toProvider(HTTPRequestFactoryProvider.class).providesSingletonInScope();

        bindDaos();
    }

    private void bindDaos() {
        final DBConnectionProvider providerInstance = new DBConnectionProvider(mContext);
        bind(DBConnection.class).toProviderInstance(providerInstance);

//        final DBConnection dbConnection = providerInstance.get();
//        bind(CustomersDao.class).toProviderInstance(new CustomersDaoProvider(dbConnection)).providesSingletonInScope();
//        bind(ProductsDao.class).toProviderInstance(new ProductsDaoProvider(dbConnection)).providesSingletonInScope();;
    }

}
