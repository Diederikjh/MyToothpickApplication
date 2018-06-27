package com.honeybeeapp.toothpicktest.mytoothpickapplication.di;

import android.content.Context;

import com.honeybeeapp.toothpicktest.mytoothpickapplication.deps.DBConnection;

import dagger.Module;
import dagger.Provides;
import dagger.Reusable;

/**
 * Created by djh on 2018/05/31.
 */

@Module
public class DBConnectionModule {

    @Provides
    @Reusable
    DBConnection provideDBConnection(Context context) {
        return new DBConnection(context);
    }

}
