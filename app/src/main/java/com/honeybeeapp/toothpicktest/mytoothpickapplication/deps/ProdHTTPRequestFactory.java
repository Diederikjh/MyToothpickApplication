package com.honeybeeapp.toothpicktest.mytoothpickapplication.deps;

import android.content.Context;

import javax.inject.Inject;

/**
 * Created by djh on 2018/05/25.
 */

public class ProdHTTPRequestFactory implements IHTTPRequestFactory {

    @Inject
    Context mContext;

    public ProdHTTPRequestFactory() {
    }

    @Override
    public void createRequest() {

    }
}
