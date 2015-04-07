package com.example.adam.exampleandroidmvp.view;

import android.test.AndroidTestCase;
import android.view.LayoutInflater;

import com.example.adam.exampleandroidmvp.R;

public class ExampleViewTest extends AndroidTestCase {

    ExampleView view;


    @Override
    public void setUp() throws Exception {
        super.setUp();

        view = (ExampleView) LayoutInflater
                .from(getContext())
                .inflate(R.layout.example_view_component, null, false);
    }

    public void testInflation() throws Exception {
        assertNotNull(view);
    }
}
