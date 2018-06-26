package com.honeybeeapp.toothpicktest.mytoothpickapplication.deps;

class BaseDao {

    private final DBConnection mDbConnection;

    public BaseDao(DBConnection dbConnection) {
        mDbConnection = dbConnection;
    }
}
