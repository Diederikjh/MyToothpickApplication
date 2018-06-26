package com.honeybeeapp.toothpicktest.mytoothpickapplication.deps;

import com.honeybeeapp.toothpicktest.mytoothpickapplication.di.DBConnection;

/**
 * Created by djh on 2018/06/26.
 */

public class ProductsDao extends BaseDao {

    public ProductsDao(DBConnection dbConnection) {
        super(dbConnection);
    }

}
