package com.aiaiai.bestfintechappever.core.components;

import android.content.Context;

import com.aiaiai.bestfintechappever.activity.SplashActivity;
import com.aiaiai.bestfintechappever.core.modules.AppModule;
import com.aiaiai.bestfintechappever.core.modules.ConcurrencyModule;
import com.aiaiai.bestfintechappever.fragment.FirstFragment;
import com.aiaiai.bestfintechappever.fragment.FourthFragment;
import com.aiaiai.bestfintechappever.fragment.SecondFragment;
import com.aiaiai.bestfintechappever.fragment.ThirdFragment;

import javax.inject.Singleton;

import dagger.BindsInstance;
import dagger.Component;

@Singleton
@Component(modules = {AppModule.class, ConcurrencyModule.class})
public interface AppComponent {


    void inject(ThirdFragment thirdFragment);

    void inject(FourthFragment fourthFragment);

    @Component.Builder
    interface Builder {
        AppComponent build();

        @BindsInstance
        Builder context(Context context);
    }


    void inject(FirstFragment firstFragment);

    void inject(SecondFragment secondFragment);

    void inject(SplashActivity splashActivity);
}
