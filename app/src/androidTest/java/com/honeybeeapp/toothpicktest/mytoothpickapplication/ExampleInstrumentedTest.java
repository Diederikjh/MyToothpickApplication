package com.honeybeeapp.toothpicktest.mytoothpickapplication;

import android.content.Context;
import android.support.test.InstrumentationRegistry;
import android.support.test.runner.AndroidJUnit4;
import android.util.Log;

import com.honeybeeapp.toothpicktest.mytoothpickapplication.deps.CoffeeMaker;

import org.junit.Test;
import org.junit.runner.RunWith;

import static org.hamcrest.core.StringStartsWith.startsWith;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

/**
 * Instrumented test, which will execute on an Android device.
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
@RunWith(AndroidJUnit4.class)
public class ExampleInstrumentedTest {

    private static final String LOG_TAG = ExampleInstrumentedTest.class.getName();
//    @Inject
//    IHTTPRequestFactory mFactory;

//    @Inject
//    Context mContext;

    @Test
    public void useAppContext() throws Exception {
        // Context of the app under test.
        Context appContext = InstrumentationRegistry.getTargetContext();

        assertThat(appContext.getPackageName(), startsWith("com.honeybeeapp.toothpicktest.mytoothpickapplication"));

        TestCoffeeMakerFactory coffeeMakerFactory = DaggerTestCoffeeMakerFactory.builder()
                .context(appContext).build();
        CoffeeMaker maker = coffeeMakerFactory.createMaker();
        Log.d(LOG_TAG, "Injection done");

        assertTrue(maker.getPump() != null);
        assertTrue(maker.getHeater() != null);

    }
}
