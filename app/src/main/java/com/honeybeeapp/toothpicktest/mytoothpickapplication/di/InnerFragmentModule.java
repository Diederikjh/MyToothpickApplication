package com.honeybeeapp.toothpicktest.mytoothpickapplication.di;

import com.honeybeeapp.toothpicktest.mytoothpickapplication.InnerFragmentView;
import com.honeybeeapp.toothpicktest.mytoothpickapplication.deps.CustomersDao;

import dagger.Module;
import dagger.Provides;

/**
 * Created by djh on 2018/05/31.
 */

@Module
class InnerFragmentModule {

    @Provides
    @FragmentScope
    InnerFragmentView provideDetailFragmentView(CustomersDao customersDao){
        return new InnerFragmentView(customersDao);
    }

}
