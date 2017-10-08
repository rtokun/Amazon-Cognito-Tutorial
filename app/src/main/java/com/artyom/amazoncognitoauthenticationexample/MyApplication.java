package com.artyom.amazoncognitoauthenticationexample;

import android.app.Application;

import com.artyom.amazoncognitoauthenticationexample.session.CognitoSessionManager;

/**
 * Created by Artyom on 08/10/2017.
 */

public class MyApplication extends Application {


    @Override
    public void onCreate() {
        super.onCreate();
        CognitoSessionManager.getInstance()
                .init(this.getApplicationContext());
    }
}
