package com.honeybeeapp.toothpicktest.mytoothpickapplication.deps;

import com.honeybeeapp.toothpicktest.mytoothpickapplication.di.DBConnection;

import javax.inject.Inject;

/**
 * Created by djh on 2018/06/26.
 */

public class ProductsDao extends BaseDao {

    @Inject
    public ProductsDao(DBConnection dbConnection) {
        super(dbConnection);
    }

}
