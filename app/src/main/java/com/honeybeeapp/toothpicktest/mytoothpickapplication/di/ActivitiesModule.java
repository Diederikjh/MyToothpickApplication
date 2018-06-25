package com.honeybeeapp.toothpicktest.mytoothpickapplication.di;

import com.honeybeeapp.toothpicktest.mytoothpickapplication.DetailsActivity;
import com.honeybeeapp.toothpicktest.mytoothpickapplication.MainActivity;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

/**
 * Created by djh on 2018/05/31.
 */

/* One each for each concrete activity */
@Module
public abstract class ActivitiesModule {

    @ActivityScope
    @ContributesAndroidInjector(modules = {
            DBConnectionModule.class,
            DAOModule.class
    })
    abstract MainActivity contributeMainActivityInjector();

    @ActivityScope
    @ContributesAndroidInjector(modules = {
            DBConnectionModule.class,
            DAOModule.class
    })
    abstract DetailsActivity contributeDetailsActivityInjector();

}
