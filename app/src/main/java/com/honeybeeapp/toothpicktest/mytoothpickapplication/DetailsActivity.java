package com.honeybeeapp.toothpicktest.mytoothpickapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.honeybeeapp.toothpicktest.mytoothpickapplication.deps.CustomersDao;

import javax.inject.Inject;

import dagger.android.AndroidInjection;

public class DetailsActivity extends AppCompatActivity {

    @Inject
    CustomersDao mCustomersDao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        AndroidInjection.inject(this);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);
    }
}
