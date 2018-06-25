package com.honeybeeapp.toothpicktest.mytoothpickapplication.di;

import com.honeybeeapp.toothpicktest.mytoothpickapplication.SimpleService;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@Module
public abstract class ServicesModule {

    @ContributesAndroidInjector(modules = {
            DBConnectionModule.class,
            DAOModule.class
    })
    abstract SimpleService contributeSimpleServiceInjector();

}
