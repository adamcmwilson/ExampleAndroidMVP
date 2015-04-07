package com.example.adam.exampleandroidmvp.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.adam.exampleandroidmvp.ExampleApp;
import com.example.adam.exampleandroidmvp.R;

import javax.inject.Inject;

import butterknife.ButterKnife;
import butterknife.InjectView;
import butterknife.OnClick;

public class ExampleView extends FrameLayout {

    @Inject
    ExampleViewModel exampleViewModel;

    @InjectView(R.id.text_top)
    TextView textView;

    @InjectView(R.id.image_view)
    ImageView imageView;

    @OnClick(R.id.btn_ok)
    void onOkButtonClicked() {
        exampleViewModel.getOkButtonClickAction().call(getContext());
    }

    public ExampleView(Context context) {
        this(context, null);
    }

    public ExampleView(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public ExampleView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);

        this.setLayoutParams(
                new ViewGroup.LayoutParams(
                        ViewGroup.LayoutParams.MATCH_PARENT,
                        ViewGroup.LayoutParams.WRAP_CONTENT));

        final View layout = LayoutInflater.from(context).inflate(
                R.layout.example_view_component, this, false);

        ButterKnife.inject(this, layout);

        this.addView(layout);
    }

    @Override
    protected void onFinishInflate() {
        super.onFinishInflate();
        ExampleApp.inject(this);

        textView.setText(exampleViewModel.getLabel(getContext()));
    }
}
