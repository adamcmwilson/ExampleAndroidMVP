package com.example.adam.exampleandroidmvp;

import android.app.Application;

import com.example.adam.exampleandroidmvp.di.ExampleModule;

import dagger.ObjectGraph;


public class ExampleApp extends Application {

    private static ObjectGraph objectGraph;

    @Override
    public void onCreate() {
        super.onCreate();

        if (objectGraph == null)
            objectGraph = ObjectGraph.create(
                    new ExampleModule(this));

    }

    public static void inject(Object object) {
        objectGraph.inject(object);
    }


}
