package com.dreampany.daggerjava.ui.main;

import javax.inject.Inject;

/**
 * Created by nuc on 3/25/2018.
 */

public class MainPresenterImpl implements MainPresenter {

    MainView mainView;

    @Inject
    public MainPresenterImpl(MainView mainView){
        this.mainView = mainView;
    }

    @Override
    public void loadMain() {
        mainView.onMainLoaded();
    }
}
