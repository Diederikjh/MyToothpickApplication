package com.honeybeeapp.toothpicktest.mytoothpickapplication;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.IBinder;
import android.util.Log;

import com.honeybeeapp.toothpicktest.mytoothpickapplication.deps.HTTPRequestFactoryProvider;
import com.honeybeeapp.toothpicktest.mytoothpickapplication.deps.IHTTPRequestFactory;
import com.honeybeeapp.toothpicktest.mytoothpickapplication.deps.InjectionContextConstructorParamTest;

import javax.inject.Inject;

import toothpick.Scope;
import toothpick.Toothpick;
import toothpick.config.Module;

public class SimpleService extends Service {

    private static final String LOG_TAG = SimpleService.class.getName();
    private Scope mScope;

    @Inject
    InjectionContextConstructorParamTest mContextCtorTester;

    @Inject
    IHTTPRequestFactory mRequestFactory;

    @Inject
    Handler mHandler1;

    @Inject
    Handler mHandler2;

    public SimpleService() {
    }

    @Override
    public void onCreate() {
        mScope = Toothpick.openScopes(getApplication(), this);
        Module module = new Module();
        module.bind(Context.class).toInstance(this);
        module.bind(IHTTPRequestFactory.class).toProvider(HTTPRequestFactoryProvider.class).providesSingletonInScope();
        mScope.installModules(module);
        super.onCreate();
        Toothpick.inject(this, mScope);
        Log.d(LOG_TAG, "Injected members on service");
    }

    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override
    public void onDestroy() {
        Toothpick.closeScope(this);
        super.onDestroy();
    }
}
