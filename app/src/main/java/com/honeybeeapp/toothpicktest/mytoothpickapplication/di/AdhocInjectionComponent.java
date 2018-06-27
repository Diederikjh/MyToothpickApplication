package com.honeybeeapp.toothpicktest.mytoothpickapplication.di;

import com.honeybeeapp.toothpicktest.mytoothpickapplication.deps.CustomersDao;
import com.honeybeeapp.toothpicktest.mytoothpickapplication.deps.DBConnection;
import com.honeybeeapp.toothpicktest.mytoothpickapplication.deps.ProductsDao;

import dagger.Subcomponent;

@ActivityScope
@Subcomponent(modules = {
        DefaultActivityModule.class
})
public interface AdhocInjectionComponent
{
//    @Component.Builder
//    interface Builder {
////        @BindsInstance
//        AdhocInjectionComponent build();
//    }

    CustomersDao customersDao();
    ProductsDao productsDao();
    DBConnection dbConnection();

}
