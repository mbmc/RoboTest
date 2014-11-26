package com.sample.app;

import android.os.Bundle;
import android.widget.TextView;

import com.google.inject.Inject;
import com.sample.library.Library;
import com.sample.library.Service;

import roboguice.activity.RoboActivity;
import roboguice.inject.ContentView;
import roboguice.inject.InjectView;


@ContentView(R.layout.activity_main)
public class MainActivity extends RoboActivity {

    @InjectView(R.id.text1)
    private TextView text1;

    @InjectView(R.id.text2)
    private TextView text2;

    @Inject
    private Library library;

    @Inject
    private Service service;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        text1.setText(library.getMessage());

        text2.setText(String.valueOf(service.getValue()));
    }
    
}
