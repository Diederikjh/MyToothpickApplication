package com.honeybeeapp.toothpicktest.mytoothpickapplication.di;

import com.honeybeeapp.toothpicktest.mytoothpickapplication.MainActivity;
import com.honeybeeapp.toothpicktest.mytoothpickapplication.deps.DBConnection;

import dagger.Module;
import dagger.Provides;

/**
 * Created by djh on 2018/05/31.
 */

@Module
public class DBConnectionModule {

    @Provides
    DBConnection provideDBConnection(MainActivity mainActivity) {
        return new DBConnection(mainActivity);
    }

}
