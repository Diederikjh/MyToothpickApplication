package com.honeybeeapp.toothpicktest.mytoothpickapplication.di;

import android.content.Context;

import com.honeybeeapp.toothpicktest.mytoothpickapplication.deps.DBConnection;

import dagger.Module;
import dagger.Provides;

/**
 * Created by djh on 2018/05/31.
 */

@Module
public class DBConnectionModule {

    @Provides
    DBConnection provideDBConnection(Context context) {
        return new DBConnection(context);
    }

}
