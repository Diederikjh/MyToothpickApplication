package com.honeybeeapp.toothpicktest.mytoothpickapplication.deps;

import android.app.Activity;
import android.app.Application;

import javax.inject.Inject;

/**
 * Created by djh on 2018/05/24.
 */

public class ContextNamer {

    @Inject
    Application application;
    @Inject
    Activity activity;

    public String getApplicationName() {
        return application.getClass().getSimpleName();
    }

    public String getActivityName() {
        return activity.getClass().getSimpleName();
    }
}
