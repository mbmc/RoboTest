package com.sample.library.guice;

import com.google.inject.AbstractModule;
import com.sample.library.Library;
import com.sample.library.test.LibraryTestImpl;


public class TestBindings extends AbstractModule {

    @Override
    protected void configure() {
        bind(Library.class).to(LibraryTestImpl.class);
    }

}