package com.honeybeeapp.toothpicktest.mytoothpickapplication.deps;

import javax.inject.Inject;

import dagger.Module;
import dagger.Provides;
import dagger.Reusable;

/**
 * Created by djh on 2018/05/25.
 */

@Module
public class HTTPRequestFactoryModule  {

    @Inject
    public HTTPRequestFactoryModule() {
    }

    @Provides
    @Reusable
    public IHTTPRequestFactory provideHTTPRequestFactory() {
        return new DemoHTTPRequestFactory();
    }

}
