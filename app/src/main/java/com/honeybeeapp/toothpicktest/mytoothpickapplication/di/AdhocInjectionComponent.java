package com.honeybeeapp.toothpicktest.mytoothpickapplication.di;

import android.content.Context;

import com.honeybeeapp.toothpicktest.mytoothpickapplication.deps.CustomersDao;
import com.honeybeeapp.toothpicktest.mytoothpickapplication.deps.DBConnection;
import com.honeybeeapp.toothpicktest.mytoothpickapplication.deps.ProductsDao;

import dagger.Component;

@ActivityScope
@Component(modules = {
        DefaultActivityModule.class,
}, dependencies = AppComponent.class)
public interface AdhocInjectionComponent
{
//    @Component.Builder
//    interface Builder {
//        //@BindsInstance
////        AdhocInjectionComponent.Builder context(Context context);
//        AdhocInjectionComponent build();
//    }

    Context context();

    CustomersDao customersDao();
    ProductsDao productsDao();
    DBConnection dbConnection();

}
