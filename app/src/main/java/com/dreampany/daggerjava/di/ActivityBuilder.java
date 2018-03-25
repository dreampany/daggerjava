package com.dreampany.daggerjava.di;

import com.dreampany.daggerjava.ui.main.MainActivity;
import com.dreampany.daggerjava.ui.main.MainActivityModule;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

/**
 * Created by nuc on 3/25/2018.
 */

@Module
public abstract class ActivityBuilder {

    @ContributesAndroidInjector(modules = MainActivityModule.class)
    abstract MainActivity bindMainActivity();
}
