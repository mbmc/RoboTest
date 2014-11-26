package com.sample.library;

import android.app.Application;

import com.google.inject.util.Modules;
import com.sample.library.guice.Bindings;
import com.sample.library.guice.TestBindings;

import org.robolectric.Robolectric;
import org.robolectric.TestLifecycleApplication;

import java.lang.reflect.Method;

import roboguice.RoboGuice;


public class TestStartApplication extends Application implements TestLifecycleApplication {

    @Override
    public void beforeTest(Method method) {

    }

    @Override
    public void prepareTest(Object test) {
        TestStartApplication application = (TestStartApplication) Robolectric.application;

        RoboGuice.getOrCreateBaseApplicationInjector(application, RoboGuice.DEFAULT_STAGE,
                RoboGuice.newDefaultRoboModule(this),
                Modules.override(new Bindings()).with(new TestBindings()));

        RoboGuice.getInjector(application).injectMembers(test);
    }

    @Override
    public void afterTest(Method method) {

    }

}
