package com.example.adam.exampleandroidmvp.view;

import android.test.AndroidTestCase;

public class ExampleViewModelTest extends AndroidTestCase {

    final String test_version = "test_version_name";

    ExampleViewModel viewModel;

    @Override
    public void setUp() throws Exception {
        super.setUp();

        viewModel = new ExampleViewModel(test_version);
        assertEquals(test_version, viewModel.version);
    }

    public void test_getLabelText() throws Exception {
        assertNotNull(viewModel);
        assertNotNull(viewModel.getLabel(getContext()));
    }
}
