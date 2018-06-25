package com.honeybeeapp.toothpicktest.mytoothpickapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.honeybeeapp.toothpicktest.mytoothpickapplication.deps.CustomersDao;
import com.honeybeeapp.toothpicktest.mytoothpickapplication.deps.ProductsDao;
import com.honeybeeapp.toothpicktest.mytoothpickapplication.deps.RandomClassThatNeedsInjection;

import javax.inject.Inject;

import dagger.android.AndroidInjection;
import dagger.android.AndroidInjector;
import dagger.android.DispatchingAndroidInjector;
import dagger.android.support.HasSupportFragmentInjector;

public class MainActivity extends AppCompatActivity implements HasSupportFragmentInjector {
    private static final String LOG_TAG = MainActivity.class.getName();

    @Inject
    CustomersDao mCustomersDao;

    @Inject
    ProductsDao mProductsDao;

    // TODO for each activity with child fragmens - add this member.
    @Inject
    DispatchingAndroidInjector<Fragment> fragmentDispatchingAndroidInjector;

    private TextView title;
    private TextView subTitle;
    private Button button1;
    private Button button2;

    private RandomClassThatNeedsInjection mRando;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        AndroidInjection.inject(this);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        doDaggerInjectionActivity();

        title = findViewById(R.id.title);
        subTitle = findViewById(R.id.subtitle);
        button1 = findViewById(R.id.helloButton);
        button2 = findViewById(R.id.button2);

        button1.setText("Start details ");

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, DetailsActivity.class);
                startActivity(i);
            }
        });


        button2.setText("Start service");

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, SimpleService.class);
                startService(i);
            }
        });

        mRando = new RandomClassThatNeedsInjection(this);
    }

//    private void doDaggerInjectionActivity() {
//        CoffeeMakerComponent coffeeMakerComponent = DaggerCoffeeMakerComponent.builder().context(this).build();
//        CoffeeMaker maker = coffeeMakerComponent.createMaker();
//
//        Log.d(LOG_TAG, "Injection done");
//    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }

    @Override
    public AndroidInjector<Fragment> supportFragmentInjector() {
        return fragmentDispatchingAndroidInjector;
    }
}
