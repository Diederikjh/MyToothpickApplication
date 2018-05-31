package com.honeybeeapp.toothpicktest.mytoothpickapplication.di;

import com.honeybeeapp.toothpicktest.mytoothpickapplication.InnerFragment;

import dagger.Subcomponent;
import dagger.android.AndroidInjector;

/**
 * Created by djh on 2018/05/31.
 */

@Subcomponent(modules = InnerFragmentModule.class)
public interface FragmentComponent extends AndroidInjector<InnerFragment> {

    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<InnerFragment> { }

}
