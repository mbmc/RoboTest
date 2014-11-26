package com.sample.library.guice;

import com.google.inject.AbstractModule;
import com.sample.library.Library;
import com.sample.library.LibraryImpl;
import com.sample.library.Service;
import com.sample.library.ServiceImpl;


public class Bindings extends AbstractModule {

    @Override
    protected void configure() {
        bind(Library.class).to(LibraryImpl.class);
        bind(Service.class).to(ServiceImpl.class);
    }

}