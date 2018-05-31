package com.honeybeeapp.toothpicktest.mytoothpickapplication.di;

import android.app.Application;

import com.honeybeeapp.toothpicktest.mytoothpickapplication.SimpleApp;

import dagger.BindsInstance;
import dagger.Component;
import dagger.android.AndroidInjectionModule;

/**
 * Created by djh on 2018/05/31.
 */

@Component(modules = {
        AndroidInjectionModule.class,
        AppModule.class,
        ActivityBuilder.class})
public interface AppComponent {

    @Component.Builder
    interface Builder {
        @BindsInstance
        Builder application(Application application);
        AppComponent build();
    }

    void inject(SimpleApp app);
}
