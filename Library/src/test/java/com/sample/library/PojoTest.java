package com.sample.library;

import com.google.inject.Inject;
import com.sample.library.test.PojoTestcase;

import org.junit.Test;

import static org.junit.Assert.*;


public class PojoTest extends PojoTestcase {

    @Inject
    private Library library;

    @Inject
    private Service service;


    @Test
    public void testLibrary() {
        assertEquals("Received message from LibraryTestImpl", library.getMessage());
    }

    @Test
    public void testService() {
        assertEquals(123, service.getValue());
    }

}