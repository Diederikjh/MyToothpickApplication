package com.honeybeeapp.toothpicktest.mytoothpickapplication;

import android.content.Context;

import com.honeybeeapp.toothpicktest.mytoothpickapplication.deps.DBConnection;
import com.honeybeeapp.toothpicktest.mytoothpickapplication.di.DAOModule;

import dagger.BindsInstance;
import dagger.Component;

@Component(modules = {
        TestDBConnectionModule.class,
        DAOModule.class
})
public interface TestComponent {

    @Component.Builder
    interface Builder {
        @BindsInstance
        TestComponent.Builder context(Context context);
        TestComponent build();
    }

    DBConnection dbConnection();
}
