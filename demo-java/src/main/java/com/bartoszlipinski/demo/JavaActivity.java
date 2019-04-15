package com.bartoszlipinski.demo;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.ViewGroup;
import butterknife.BindView;
import com.bartoszlipinski.butterknifektx.ButterKnifeKtx;
import com.bartoszlipinski.butterknifektx.ButterKnifeKtxKt;

public class JavaActivity extends Activity {

    @BindView(R.id.example_layout)
    ViewGroup exampleLayout;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ButterKnifeKtxKt.bind(ButterKnifeKtx.INSTANCE, this);
    }
}