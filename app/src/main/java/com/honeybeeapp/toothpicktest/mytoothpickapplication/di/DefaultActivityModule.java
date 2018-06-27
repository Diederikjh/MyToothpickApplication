package com.honeybeeapp.toothpicktest.mytoothpickapplication.di;


import dagger.Module;

@Module(includes = { DBConnectionModule.class,
        DAOModule.class})
public class DefaultActivityModule
{
}
