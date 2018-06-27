package com.honeybeeapp.toothpicktest.mytoothpickapplication.di;

import com.honeybeeapp.toothpicktest.mytoothpickapplication.deps.CustomersDao;
import com.honeybeeapp.toothpicktest.mytoothpickapplication.deps.DBConnection;
import com.honeybeeapp.toothpicktest.mytoothpickapplication.deps.ProductsDao;
import com.honeybeeapp.toothpicktest.mytoothpickapplication.deps.ProductsDaoHelper;

import dagger.Module;
import dagger.Provides;
import dagger.Reusable;

@Module
public class DAOModule {

    @Provides
    @Reusable
    CustomersDao provideCustomersDAO(DBConnection dbConnection) {
        return new CustomersDao(dbConnection);
    }

    @Provides
    @Reusable
    ProductsDao provideProductsDAO(DBConnection dbConnection) {
        return new ProductsDao(dbConnection);
    }

    @Provides
    @Reusable
    ProductsDaoHelper provideProductsDAOHelper(ProductsDao productDao) {
        return new ProductsDaoHelper(productDao);
    }

}
