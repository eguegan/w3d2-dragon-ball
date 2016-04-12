package com.example.test.samplemasterdetail;

import android.app.Application;

import com.squareup.leakcanary.LeakCanary;

/**
 * Created by Adam Lasley on 3/10/16.
 */

//Create Custom Application class to initialize third party libraries
public class App extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        //Use of LeakCanary to detect memory leaks in early debugging builds
        LeakCanary.install(this);
    }
}
