package com.honeybeeapp.toothpicktest.mytoothpickapplication.di;

import com.honeybeeapp.toothpicktest.mytoothpickapplication.ApiService;
import com.honeybeeapp.toothpicktest.mytoothpickapplication.MainActivity;
import com.honeybeeapp.toothpicktest.mytoothpickapplication.MainPresenter;
import com.honeybeeapp.toothpicktest.mytoothpickapplication.MainPresenterImpl;
import com.honeybeeapp.toothpicktest.mytoothpickapplication.MainView;

import dagger.Module;
import dagger.Provides;

/**
 * Created by djh on 2018/05/31.
 */

@Module
public class MainViewPresenterModule {

    @Provides
    MainView provideMainView(MainActivity mainActivity){
        return new MainView(mainActivity);
    }

    @Provides
    MainPresenter provideMainPresenter(MainView mainView, ApiService apiService){
        return new MainPresenterImpl(mainView, apiService);
    }

}
