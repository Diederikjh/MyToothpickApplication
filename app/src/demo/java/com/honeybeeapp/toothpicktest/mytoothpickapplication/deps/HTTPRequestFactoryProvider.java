package com.honeybeeapp.toothpicktest.mytoothpickapplication.deps;

import javax.inject.Inject;
import javax.inject.Provider;

/**
 * Created by djh on 2018/05/25.
 */

public class HTTPRequestFactoryProvider implements Provider<IHTTPRequestFactory> {

    @Inject
    public HTTPRequestFactoryProvider() {
    }

    @Override
    public IHTTPRequestFactory get() {
        return new DemoHTTPRequestFactory();
    }
}
