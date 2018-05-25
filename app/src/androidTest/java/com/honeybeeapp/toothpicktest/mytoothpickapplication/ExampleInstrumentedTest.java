package com.honeybeeapp.toothpicktest.mytoothpickapplication;

import android.content.Context;
import android.support.test.InstrumentationRegistry;
import android.support.test.runner.AndroidJUnit4;
import android.util.Log;

import org.junit.Test;
import org.junit.runner.RunWith;

import javax.inject.Inject;

import toothpick.Scope;
import toothpick.Toothpick;
import toothpick.config.Module;

import static junit.framework.Assert.assertTrue;
import static org.hamcrest.core.StringStartsWith.startsWith;
import static org.junit.Assert.assertThat;

/**
 * Instrumented test, which will execute on an Android device.
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
@RunWith(AndroidJUnit4.class)
public class ExampleInstrumentedTest {

    private static final String LOG_TAG = ExampleInstrumentedTest.class.getName();

    @Inject
    Context mContext;

    @Test
    public void useAppContext() throws Exception {
        // Context of the app under test.
        Context appContext = InstrumentationRegistry.getTargetContext();

        assertThat(appContext.getPackageName(), startsWith("com.honeybeeapp.toothpicktest.mytoothpickapplication"));

        final SimpleApp application = (SimpleApp) appContext.getApplicationContext();
        Scope scope = Toothpick.openScopes(application, this);

        Module module = new Module();
        module.bind(Context.class).toInstance(application);
        scope.installTestModules(module);
        Toothpick.inject(this, scope);

        assertTrue(mContext != null); // FAILS :(

        Log.d(LOG_TAG, "Injected");
    }
}
