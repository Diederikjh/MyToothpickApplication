package com.honeybeeapp.toothpicktest.mytoothpickapplication;

import android.content.Context;

import com.honeybeeapp.toothpicktest.mytoothpickapplication.deps.DBConnection;

import dagger.Module;
import dagger.Provides;

@Module
class TestDBConnectionModule {

    @Provides
    DBConnection provideDBConnection(Context context) {
        return new TestDBConnection(context);
    }
}
