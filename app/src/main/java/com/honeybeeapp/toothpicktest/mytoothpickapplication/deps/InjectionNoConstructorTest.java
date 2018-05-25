package com.honeybeeapp.toothpicktest.mytoothpickapplication.deps;

import javax.inject.Inject;

/**
 * Created by djh on 2018/05/25.
 */

public class InjectionNoConstructorTest {

    @Inject
    public InjectionNoConstructorTest() {
    }

    String t = "This is a test string";

}
