package com.honeybeeapp.toothpicktest.mytoothpickapplication.di;

import com.honeybeeapp.toothpicktest.mytoothpickapplication.deps.CustomersDao;
import com.honeybeeapp.toothpicktest.mytoothpickapplication.deps.DBConnection;
import com.honeybeeapp.toothpicktest.mytoothpickapplication.deps.ProductsDao;

import dagger.Module;
import dagger.Provides;

@Module
public class DAOModule {

    @Provides
    CustomersDao provideCustomersDAO(DBConnection dbConnection) {
        return new CustomersDao(dbConnection);
    }

    @Provides
    ProductsDao provideProductsDAO(DBConnection dbConnection) {
        return new ProductsDao(dbConnection);
    }

}