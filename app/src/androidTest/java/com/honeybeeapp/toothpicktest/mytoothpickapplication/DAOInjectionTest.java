package com.honeybeeapp.toothpicktest.mytoothpickapplication;


import android.content.Context;
import android.support.test.InstrumentationRegistry;
import android.support.test.runner.AndroidJUnit4;

import com.honeybeeapp.toothpicktest.mytoothpickapplication.deps.DBConnection;

import org.junit.Test;
import org.junit.runner.RunWith;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

@RunWith(AndroidJUnit4.class)
public class DAOInjectionTest {

    @Test
    public void testComponentTest() {

        Context appContext = InstrumentationRegistry.getTargetContext();
        TestComponent component = DaggerTestComponent.builder().context(appContext).build();
        DBConnection connection = component.dbConnection();

        assertThat(connection.getClass().getName(),
                is("com.honeybeeapp.toothpicktest.mytoothpickapplication.TestDBConnection"));
    }

}
