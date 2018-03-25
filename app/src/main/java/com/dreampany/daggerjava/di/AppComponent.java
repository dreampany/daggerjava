package com.dreampany.daggerjava.di;

import android.app.Application;

import com.dreampany.daggerjava.App;

import dagger.BindsInstance;
import dagger.Component;
import dagger.android.AndroidInjectionModule;

/**
 * Created by nuc on 3/25/2018.
 */

@Component(modules = {
        AndroidInjectionModule.class,
        AppModule.class,
        ActivityBuilder.class})
public interface AppComponent {

    @Component.Builder
    interface Builder {
        @BindsInstance
        Builder application(Application application);

        AppComponent build();
    }

    void inject(App app);
}
