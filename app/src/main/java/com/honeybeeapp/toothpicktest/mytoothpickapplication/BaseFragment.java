package com.honeybeeapp.toothpicktest.mytoothpickapplication;

import android.support.v4.app.Fragment;

import com.honeybeeapp.toothpicktest.mytoothpickapplication.deps.ProductsDao;

import javax.inject.Inject;

/**
 * Created by djh on 2018/06/28.
 */

abstract class BaseFragment extends Fragment {

    @Inject
    ProductsDao mProductsDao;

}
