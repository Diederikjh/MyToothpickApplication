package com.honeybeeapp.toothpicktest.mytoothpickapplication.deps;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.inject.Scope;

/**
 * Created by djh on 2018/06/27.
 */

@Scope
@Documented
@Retention(RetentionPolicy.RUNTIME)
public @interface ActivitySingleton {
}
