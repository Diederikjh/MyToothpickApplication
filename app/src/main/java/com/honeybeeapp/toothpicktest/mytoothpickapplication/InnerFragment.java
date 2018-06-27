package com.honeybeeapp.toothpicktest.mytoothpickapplication;


import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.honeybeeapp.toothpicktest.mytoothpickapplication.deps.CustomersDao;
import com.honeybeeapp.toothpicktest.mytoothpickapplication.deps.IHTTPRequestFactory;
import com.honeybeeapp.toothpicktest.mytoothpickapplication.deps.ProductsDao;

import javax.inject.Inject;

import dagger.android.support.AndroidSupportInjection;


/**
 * A simple {@link Fragment} subclass.
 */
public class InnerFragment extends Fragment {

    @Inject
    ProductsDao mProductsDao;

    @Inject
    CustomersDao mCustomerDao;

    @Inject
    IHTTPRequestFactory mFactory;

    private static final String LOG_TAG = InnerFragment.class.getName();

    public InnerFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_inner, container, false);
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public void onAttach(Context context) {
        AndroidSupportInjection.inject(this);
        super.onAttach(context);
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
    }
}
