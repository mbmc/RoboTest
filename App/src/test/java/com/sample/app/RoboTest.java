package com.sample.app;

import android.app.Activity;
import android.widget.TextView;

import org.junit.runner.RunWith;
import org.junit.Test;

import org.robolectric.Robolectric;
import org.robolectric.RobolectricTestRunner;

import static org.junit.Assert.*;


@RunWith(RobolectricTestRunner.class)
public class RoboTest  {

    @Test
    public void testActivity() {
        Activity activity = Robolectric.buildActivity(MainActivity.class).create().get();

        assertNotNull(activity);
    }

    @Test
    public void testTextView() {
        Activity activity = Robolectric.buildActivity(MainActivity.class).create().get();
        TextView textView = (TextView) activity.findViewById(R.id.textView);

        assertEquals("Received message from LibraryTestImpl", textView.getText());
    }

}