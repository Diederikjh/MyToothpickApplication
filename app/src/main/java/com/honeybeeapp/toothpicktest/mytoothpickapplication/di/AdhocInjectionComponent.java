package com.honeybeeapp.toothpicktest.mytoothpickapplication.di;

import android.content.Context;

import com.honeybeeapp.toothpicktest.mytoothpickapplication.deps.CustomersDao;
import com.honeybeeapp.toothpicktest.mytoothpickapplication.deps.DBConnection;
import com.honeybeeapp.toothpicktest.mytoothpickapplication.deps.ProductsDao;

import dagger.BindsInstance;
import dagger.Component;

@Component(modules = {
        DBConnectionModule.class,
        DAOModule.class
})
public interface AdhocInjectionComponent
{
    @Component.Builder
    interface Builder {
        @BindsInstance
        AdhocInjectionComponent.Builder context(Context context);
        AdhocInjectionComponent build();
    }

    CustomersDao customersDao();
    ProductsDao productsDao();
    DBConnection dbConnection();

}
