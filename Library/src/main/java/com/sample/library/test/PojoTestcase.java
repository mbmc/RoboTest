package com.sample.library.test;

import com.google.inject.Guice;
import com.sample.library.guice.TestBindings;


public class PojoTestcase {

    public PojoTestcase() {
        Guice.createInjector(new TestBindings()).injectMembers(this);
    }

}