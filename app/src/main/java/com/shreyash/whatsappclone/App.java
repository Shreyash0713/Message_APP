package com.shreyash.whatsappclone;

import android.app.Application;

import com.parse.Parse;

public class App extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("WstcgCwMblsZEHk4GO1ugqdShmHiKkhDGo9xAHJ2")
                // if defined
                .clientKey("XRv3rN9EIR2m2De4FU5u3QN5yeDDwXlKaAVZItkK")
                .server("https://parseapi.back4app.com/")
                .build()
        );
    }
}
