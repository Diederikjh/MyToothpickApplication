package com.honeybeeapp.toothpicktest.mytoothpickapplication.di;

import android.app.Application;

import com.honeybeeapp.toothpicktest.mytoothpickapplication.SimpleApp;

import javax.inject.Singleton;

import dagger.BindsInstance;
import dagger.Component;
import dagger.android.AndroidInjectionModule;
import dagger.android.support.AndroidSupportInjectionModule;

/**
 * Created by djh on 2018/05/31.
 */

@Singleton
@Component(modules = {
        AndroidInjectionModule.class,
        AndroidSupportInjectionModule.class,
        AppModule.class,
        ActivitiesModule.class,
        FragmentsModule.class,
        ServicesModule.class,
        AndroidServicesModule.class
        // TODO here add all activity modules for each activity
        // (or more methods on each Module.)
})
public interface AppComponent {

    @Component.Builder
    interface Builder {
        @BindsInstance
        Builder application(Application application);
        AppComponent build();
    }

    void inject(SimpleApp app);

    AdhocInjectionComponent adhocInjectionComponent(DefaultActivityModule module);

}
