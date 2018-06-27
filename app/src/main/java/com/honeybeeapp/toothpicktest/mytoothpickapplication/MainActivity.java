package com.honeybeeapp.toothpicktest.mytoothpickapplication;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.honeybeeapp.toothpicktest.mytoothpickapplication.deps.ActivitySingleton;
import com.honeybeeapp.toothpicktest.mytoothpickapplication.deps.ContextNamer;
import com.honeybeeapp.toothpicktest.mytoothpickapplication.deps.CustomersDao;
import com.honeybeeapp.toothpicktest.mytoothpickapplication.deps.HTTPRequestFactoryProvider;
import com.honeybeeapp.toothpicktest.mytoothpickapplication.deps.IHTTPRequestFactory;
import com.honeybeeapp.toothpicktest.mytoothpickapplication.deps.InjectionContextConstructorParamTest;
import com.honeybeeapp.toothpicktest.mytoothpickapplication.deps.InjectionNoConstructorTest;
import com.honeybeeapp.toothpicktest.mytoothpickapplication.di.ToothpickModule;

import javax.inject.Inject;

import toothpick.Scope;
import toothpick.Toothpick;
import toothpick.config.Module;
import toothpick.smoothie.module.SmoothieActivityModule;

public class MainActivity extends AppCompatActivity {

    private Scope scope;

    @Inject ContextNamer contextNamer;
    private TextView title;
    private TextView subTitle;
    private Button button;

    @Inject
    InjectionNoConstructorTest mTest1;

    @Inject
    InjectionContextConstructorParamTest mTest2;

    @Inject
    InjectionContextConstructorParamTest mTest3;

    @Inject
    IHTTPRequestFactory mRequestFactory1;
    @Inject
    IHTTPRequestFactory mRequestFactory2;

    @Inject
    CustomersDao mCustomersDao1;

    @Inject
    CustomersDao mCustomersDao2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        scope = Toothpick.openScopes(getApplication(), this);
        Module module = new Module();
        module.bind(Context.class).toInstance(this);
        module.bind(IHTTPRequestFactory.class).toProvider(HTTPRequestFactoryProvider.class).providesSingletonInScope();
        scope.installModules(new SmoothieActivityModule(this), module, new ToothpickModule(this));
        scope.bindScopeAnnotation(ActivitySingleton.class);
        super.onCreate(savedInstanceState);
        Toothpick.inject(this, scope);
        setContentView(R.layout.activity_main);

        title = findViewById(R.id.title);
        subTitle = findViewById(R.id.subtitle);
        button = findViewById(R.id.helloButton);

        title.setText(contextNamer.getApplicationName());
        subTitle.setText(contextNamer.getActivityName());
        button.setText("Start service");

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(MainActivity.this, SimpleService.class);
                startService(i);

            }
        });
    }

    @Override
    protected void onDestroy() {
        Toothpick.closeScope(this);
        super.onDestroy();
    }

}
