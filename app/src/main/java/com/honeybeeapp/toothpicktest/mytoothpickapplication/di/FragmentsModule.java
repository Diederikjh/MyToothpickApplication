package com.honeybeeapp.toothpicktest.mytoothpickapplication.di;

import com.honeybeeapp.toothpicktest.mytoothpickapplication.InnerFragment;
import com.honeybeeapp.toothpicktest.mytoothpickapplication.OtherFragment;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

/**
 * Created by djh on 2018/05/31.
 */

/* DetailFragmentProvider from example */
@Module
public abstract class FragmentsModule {

    @FragmentScope
    @ContributesAndroidInjector(modules = {
            DBConnectionModule.class,
            DAOModule.class,
            InnerFragmentModule.class})
    abstract InnerFragment provideDetailFragmentFactory();

    @FragmentScope
    @ContributesAndroidInjector(modules = {
            DBConnectionModule.class,
            DAOModule.class,
            InnerFragmentModule.class})
    abstract OtherFragment provideOtherFragmentFactory();

}
