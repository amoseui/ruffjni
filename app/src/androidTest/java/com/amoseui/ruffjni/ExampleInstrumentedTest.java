package com.amoseui.ruffjni;

import android.content.Context;

import com.amoseui.ruffjni.nativetest.NativeTest;

import androidx.test.platform.app.InstrumentationRegistry;
import androidx.test.ext.junit.runners.AndroidJUnit4;

import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;

/**
 * Instrumented test, which will execute on an Android device.
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
@RunWith(AndroidJUnit4.class)
public class ExampleInstrumentedTest {
    @Test
    public void useAppContext() {
        // Context of the app under test.
        Context appContext = InstrumentationRegistry.getInstrumentation().getTargetContext();

        assertEquals("com.amoseui.ruffjni", appContext.getPackageName());
    }

    @Test
    public void nativeTest() {
        assertEquals("NATIVE TEST FAILED! Please check the details in log.", 0, new NativeTest().runTest());
    }
}
