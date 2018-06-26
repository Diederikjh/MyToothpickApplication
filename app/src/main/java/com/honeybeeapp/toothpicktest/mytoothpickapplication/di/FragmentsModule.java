package com.honeybeeapp.toothpicktest.mytoothpickapplication.di;

import com.honeybeeapp.toothpicktest.mytoothpickapplication.InnerFragment;
import com.honeybeeapp.toothpicktest.mytoothpickapplication.OtherFragment;
import com.honeybeeapp.toothpicktest.mytoothpickapplication.deps.HTTPRequestFactoryModule;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

/**
 * Created by djh on 2018/05/31.
 */

/* DetailFragmentProvider from example */
@Module
public abstract class FragmentsModule {

    @FragmentScope
    @ActivityScope
    @ContributesAndroidInjector(modules = {
            HTTPRequestFactoryModule.class,
            DBConnectionModule.class,
            DAOModule.class,
            InnerFragmentModule.class})
    abstract InnerFragment provideDetailFragmentFactory();

    @FragmentScope
    @ActivityScope
    @ContributesAndroidInjector(modules = {
            HTTPRequestFactoryModule.class,
            DBConnectionModule.class,
            DAOModule.class,
            InnerFragmentModule.class})
    abstract OtherFragment provideOtherFragmentFactory();

}
