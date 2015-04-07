package com.example.adam.exampleandroidmvp.view;

import android.content.Context;

import com.example.adam.exampleandroidmvp.R;
import com.example.adam.exampleandroidmvp.action.ToastAction;
import com.example.adam.exampleandroidmvp.di.Name;

import javax.inject.Inject;
import javax.inject.Named;

import rx.functions.Action1;

public class ExampleViewModel {

    protected final String version;

    @Inject
    public ExampleViewModel(@Named(Name.APP_VERSION) String version) {
        this.version = version;
    }

    public Action1<Context> getOkButtonClickAction() {
        return new ToastAction("OK Button Clicked. \nApp version " + version);
    }

    public String getLabel(Context context) {
        return context.getString(R.string.a_label_value);
    }

}
