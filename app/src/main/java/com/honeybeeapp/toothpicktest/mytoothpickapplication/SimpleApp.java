package com.honeybeeapp.toothpicktest.mytoothpickapplication;

import android.app.Activity;
import android.app.Application;

import com.honeybeeapp.toothpicktest.mytoothpickapplication.di.DaggerAppComponent;

import javax.inject.Inject;

import dagger.android.AndroidInjector;
import dagger.android.DispatchingAndroidInjector;
import dagger.android.HasActivityInjector;

/**
 * Created by djh on 2018/05/24.
 */

public class SimpleApp extends Application implements HasActivityInjector {

    @Inject
    DispatchingAndroidInjector<Activity> mActivityDispatchingAndroidInjector;

    @Override
    public void onCreate() {
        super.onCreate();
        DaggerAppComponent
                .builder()
                .create(this)
                .inject(this);
   }

    @Override
    public AndroidInjector<Activity> activityInjector() {
        return mActivityDispatchingAndroidInjector;
    }
}
