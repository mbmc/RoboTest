package com.sample.library.guice;

import com.google.inject.AbstractModule;
import com.sample.library.Library;
import com.sample.library.LibraryImpl;


public class Bindings extends AbstractModule {

    @Override
    protected void configure() {
        bind(Library.class).to(LibraryImpl.class);
    }

}