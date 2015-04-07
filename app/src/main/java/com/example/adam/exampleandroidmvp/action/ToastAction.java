package com.example.adam.exampleandroidmvp.action;

import android.content.Context;
import android.widget.Toast;

import javax.inject.Inject;

import rx.functions.Action1;

public class ToastAction implements Action1<Context> {

    final String message;

    @Inject
    public ToastAction(final String message) {
        this.message = message;
    }


    @Override
    public void call(Context context) {
        Toast.makeText(context, this.message, Toast.LENGTH_SHORT).show();
    }
}
