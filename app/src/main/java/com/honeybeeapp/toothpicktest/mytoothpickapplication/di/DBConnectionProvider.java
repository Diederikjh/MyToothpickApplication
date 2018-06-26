package com.honeybeeapp.toothpicktest.mytoothpickapplication.di;

import android.content.Context;

import javax.inject.Provider;

/**
 * Created by djh on 2018/06/26.
 */

class DBConnectionProvider implements Provider<DBConnection> {

    private Context mContext;

    public DBConnectionProvider(Context context) {
        this.mContext = context;
    }

    @Override
    public DBConnection get() {
        return new DBConnection(mContext);
    }
}
