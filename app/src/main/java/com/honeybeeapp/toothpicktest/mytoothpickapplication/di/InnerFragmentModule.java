package com.honeybeeapp.toothpicktest.mytoothpickapplication.di;

import com.honeybeeapp.toothpicktest.mytoothpickapplication.InnerFragment;
import com.honeybeeapp.toothpicktest.mytoothpickapplication.InnerFragmentView;

import dagger.Module;
import dagger.Provides;

/**
 * Created by djh on 2018/05/31.
 */

@Module
class InnerFragmentModule {

//    @Provides
//    Context provideContext(InnerFragment fragment) {
//        return fragment.getContext();
//    }

    @Provides
    InnerFragmentView provideDetailFragmentView(InnerFragment fragment) {
        return new InnerFragmentView(fragment);
    }

}
