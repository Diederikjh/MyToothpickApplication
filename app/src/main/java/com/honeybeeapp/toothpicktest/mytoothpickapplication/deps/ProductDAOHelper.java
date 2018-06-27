package com.honeybeeapp.toothpicktest.mytoothpickapplication.deps;

import javax.inject.Inject;

public class ProductDAOHelper {

    @Inject
    ProductsDao mProductsDao;

    @Inject
    public ProductDAOHelper() {
    }
}
