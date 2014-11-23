package com.sample.library;

import android.app.Application;

import com.sample.library.guice.Bindings;
import com.sample.library.guice.TestBindings;

import org.robolectric.Robolectric;
import org.robolectric.TestLifecycleApplication;

import java.lang.reflect.Method;

import roboguice.RoboGuice;


public class TestStartApplication extends Application implements TestLifecycleApplication {

    @Override
    public void beforeTest(Method method) {
        RoboGuice.getOrCreateBaseApplicationInjector(this, RoboGuice.DEFAULT_STAGE, RoboGuice.newDefaultRoboModule(this), new Bindings());
    }

    @Override
    public void prepareTest(Object test) {
        TestStartApplication application = (TestStartApplication) Robolectric.application;

        RoboGuice.getOrCreateBaseApplicationInjector(application, RoboGuice.DEFAULT_STAGE, RoboGuice.newDefaultRoboModule(application), new TestBindings());

        RoboGuice.getInjector(application).injectMembers(test);
    }

    @Override
    public void afterTest(Method method) {
    }

}
