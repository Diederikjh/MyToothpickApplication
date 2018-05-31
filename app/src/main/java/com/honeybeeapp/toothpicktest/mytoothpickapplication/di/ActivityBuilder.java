package com.honeybeeapp.toothpicktest.mytoothpickapplication.di;

import android.app.Activity;

import com.honeybeeapp.toothpicktest.mytoothpickapplication.MainActivity;

import dagger.Binds;
import dagger.Module;
import dagger.android.ActivityKey;
import dagger.android.AndroidInjector;
import dagger.multibindings.IntoMap;

/**
 * Created by djh on 2018/05/31.
 */

@Module
public abstract class ActivityBuilder {

    @Binds
    @IntoMap
    @ActivityKey(MainActivity.class)
    abstract AndroidInjector.Factory<? extends Activity> bindMainActivity(MainActivityComponent.Builder builder);

//    @Binds
//    @IntoMap
//    @ActivityKey(DetailActivity.class)
//    abstract AndroidInjector.Factory<? extends Activity> bindDetailActivity(DetailActivityComponent.Builder builder);


}
