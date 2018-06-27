package com.honeybeeapp.toothpicktest.mytoothpickapplication.di;

import com.honeybeeapp.toothpicktest.mytoothpickapplication.deps.ProductsDao;

import javax.inject.Provider;

/**
 * Created by djh on 2018/06/27.
 */

class ProductsDaoProvider implements Provider<ProductsDao> {
    private final DBConnection mdbConnection;

    public ProductsDaoProvider(DBConnection dbConnection) {
        mdbConnection = dbConnection;
    }

    @Override
    public ProductsDao get() {
        return new ProductsDao(mdbConnection);
    }
}
