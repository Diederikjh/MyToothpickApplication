package com.honeybeeapp.toothpicktest.mytoothpickapplication.di;

import android.support.v4.app.Fragment;

import com.honeybeeapp.toothpicktest.mytoothpickapplication.InnerFragment;

import dagger.Binds;
import dagger.Module;
import dagger.android.AndroidInjector;
import dagger.android.support.FragmentKey;
import dagger.multibindings.IntoMap;

/**
 * Created by djh on 2018/05/31.
 */

@Module
public abstract class FragmentBuilder {

    @Binds
    @IntoMap
    @FragmentKey(InnerFragment.class)
    abstract AndroidInjector.Factory<? extends Fragment> provideInnerFragmentFactory(FragmentComponent.Builder builder);

}
