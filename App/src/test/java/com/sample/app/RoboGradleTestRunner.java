package com.sample.app;

import android.app.Application;

import com.google.inject.Guice;
import com.google.inject.util.Modules;

import org.junit.runners.model.InitializationError;
import org.robolectric.AndroidManifest;
import org.robolectric.AndroidManifestExt;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.annotation.Config;
import org.robolectric.res.Fs;


public class RoboGradleTestRunner extends RobolectricTestRunner {

    public RoboGradleTestRunner(Class<?> testClass) throws InitializationError {
        super(testClass);
    }

    @Override
    protected AndroidManifest getAppManifest(Config config) {
        String manifestProperty = System.getProperty("android.manifest");
        if (config.manifest().equals(Config.DEFAULT) && manifestProperty != null) {
            final String resProperty = System.getProperty("android.resources");
            final String assetsProperty = System.getProperty("android.assets");
            final String packageProperty = System.getProperty("android.package");

            final AndroidManifestExt a = new AndroidManifestExt(Fs.fileFromPath(manifestProperty), Fs.fileFromPath(resProperty), Fs.fileFromPath(assetsProperty));
            a.setPackageName(packageProperty);

            return a;
        }

        return super.getAppManifest(config);
    }

}
