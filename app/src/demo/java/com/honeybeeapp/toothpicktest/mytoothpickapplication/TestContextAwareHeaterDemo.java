package com.honeybeeapp.toothpicktest.mytoothpickapplication;

import android.content.Context;
import android.util.Log;

import com.honeybeeapp.toothpicktest.mytoothpickapplication.deps.Heater;

/**
 * Created by djh on 2018/05/30.
 */

class TestContextAwareHeaterDemo extends Heater {
    private static final String LOG_TAG = TestContextAwareHeaterDemo.class.getName();

    public TestContextAwareHeaterDemo(Context context) {
        Log.d(LOG_TAG, "testing heater");
    }

}
