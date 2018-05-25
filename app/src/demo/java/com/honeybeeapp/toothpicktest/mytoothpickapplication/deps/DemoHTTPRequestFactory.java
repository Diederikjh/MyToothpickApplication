package com.honeybeeapp.toothpicktest.mytoothpickapplication.deps;

import android.util.Log;

/**
 * Created by djh on 2018/05/25.
 */

class DemoHTTPRequestFactory implements IHTTPRequestFactory {

    private static final String LOG_TAG = DemoHTTPRequestFactory.class.getName();

    @Override
    public void createRequest() {
        Log.d(LOG_TAG, "Creating DEMO request object");
    }
}
