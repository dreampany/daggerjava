package com.dreampany.daggerjava.ui.main;

import dagger.Module;
import dagger.Provides;

/**
 * Created by nuc on 3/25/2018.
 */

@Module
public class MainActivityModule {

    @Provides
    MainView provideMainView(MainActivity mainActivity) {
        return mainActivity;
    }

    @Provides
    MainPresenter provideMainPresenter(MainView mainView) {
        return new MainPresenterImpl(mainView);
    }
}
