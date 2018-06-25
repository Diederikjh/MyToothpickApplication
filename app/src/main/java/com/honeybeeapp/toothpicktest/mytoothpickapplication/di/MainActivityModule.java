package com.honeybeeapp.toothpicktest.mytoothpickapplication.di;

import com.honeybeeapp.toothpicktest.mytoothpickapplication.MainActivity;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

/**
 * Created by djh on 2018/05/31.
 */

@Module
public abstract class MainActivityModule {

    @ContributesAndroidInjector(modules = {MainViewPresenterModule.class, FragmentBuilder.class})
    abstract MainActivity contributeMainActivityInjector();

}
