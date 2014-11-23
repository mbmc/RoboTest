package com.sample.app;

import android.os.Bundle;
import android.widget.TextView;

import com.google.inject.Inject;
import com.sample.library.Library;

import roboguice.activity.RoboActivity;
import roboguice.inject.ContentView;
import roboguice.inject.InjectView;


@ContentView(R.layout.activity_main)
public class MainActivity extends RoboActivity {

    @InjectView(R.id.textView)
    private TextView textView;

    @Inject
    private Library library;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        textView.setText(library.getMessage());
    }
    
}
