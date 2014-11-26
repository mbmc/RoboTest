package com.sample.library.test;

import com.google.inject.Guice;
import com.google.inject.util.Modules;
import com.sample.library.guice.Bindings;
import com.sample.library.guice.TestBindings;


public class PojoTestcase {

    public PojoTestcase() {
        Guice.createInjector(Modules.override(new Bindings()).with(new TestBindings())).injectMembers(this);
    }

}