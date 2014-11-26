package com.sample.app;

import android.app.Activity;
import android.widget.TextView;

import org.junit.runner.RunWith;
import org.junit.Test;

import org.robolectric.Robolectric;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.annotation.Config;

import static org.junit.Assert.*;


@Config(emulateSdk = 18)
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

        TextView textView = (TextView) activity.findViewById(R.id.text1);
        assertEquals("Received message from LibraryTestImpl", textView.getText());

        textView = (TextView) activity.findViewById(R.id.text2);
        assertEquals("123", textView.getText());
    }

}