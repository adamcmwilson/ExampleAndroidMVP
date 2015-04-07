package com.example.adam.exampleandroidmvp.di;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;

import com.example.adam.exampleandroidmvp.view.ExampleView;

import javax.inject.Named;

import dagger.Module;
import dagger.Provides;

@SuppressWarnings("unused")
@Module(
        injects = {
                ExampleView.class
        },
        library = true, complete = false
)
public class ExampleModule {

    private Context context;

    public ExampleModule(Context context) {
        this.context = context.getApplicationContext();
    }

    @Provides
    Context provideContext() {
        return context;
    }

    @Provides
    @Named(Name.APP_VERSION)
    String provideAppVersion(Context c) {
        try {
            PackageInfo pInfo = c.getPackageManager()
                    .getPackageInfo(c.getPackageName(), 0);
            return pInfo.versionName;
        } catch (Exception ignored) {
        }
        return "Unknown";
    }


}
