package com.honeybeeapp.toothpicktest.mytoothpickapplication.deps;

import android.app.Application;
import android.content.Context;
import android.util.Log;

import javax.inject.Inject;

import toothpick.Scope;
import toothpick.Toothpick;

public class RandoClass {

    private final Scope scope;

    @Inject
    ProductsDao mProductsDao;

    public RandoClass(Application app, Context context) {
        // TODO could be better - don't always know entire context hierarchy
        scope = Toothpick.openScopes(app, context, this);
        Toothpick.inject(this, scope);
        Log.d("Rando", "Injected");
    }

}
