package com.dreampany.daggerjava.ui.main;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.dreampany.daggerjava.R;

import javax.inject.Inject;

import dagger.android.AndroidInjection;

/**
 * Created by nuc on 3/25/2018.
 */

public class MainActivity extends AppCompatActivity implements MainView {

    @Inject
    MainPresenter mainPresenter;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        AndroidInjection.inject(this);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mainPresenter.loadMain();
    }

    @Override
    public void onMainLoaded() {

    }
}
