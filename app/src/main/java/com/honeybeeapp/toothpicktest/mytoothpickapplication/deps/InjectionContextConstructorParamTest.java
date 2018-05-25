package com.honeybeeapp.toothpicktest.mytoothpickapplication.deps;

import android.content.Context;

import javax.inject.Inject;

/**
 * Created by djh on 2018/05/25.
 */

public class InjectionContextConstructorParamTest {

    private final Context mContext;

    @Inject
    public InjectionContextConstructorParamTest(Context context) {
        mContext = context;
    }

    String t = "Context param ctor";
}
