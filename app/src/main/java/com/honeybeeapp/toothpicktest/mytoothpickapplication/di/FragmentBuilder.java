package com.honeybeeapp.toothpicktest.mytoothpickapplication.di;

import com.honeybeeapp.toothpicktest.mytoothpickapplication.InnerFragment;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

/**
 * Created by djh on 2018/05/31.
 */

/* DetailFragmentProvider from example */
@Module
public abstract class FragmentBuilder {

    @FragmentScope
    @ContributesAndroidInjector(modules = InnerFragmentModule.class)
    abstract InnerFragment provideDetailFragmentFactory();

}
