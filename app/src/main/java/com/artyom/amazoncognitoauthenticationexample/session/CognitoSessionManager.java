package com.artyom.amazoncognitoauthenticationexample.session;

import android.content.Context;

import com.amazonaws.mobileconnectors.cognitoidentityprovider.CognitoUserPool;

/**
 * Created by Artyom on 08/10/2017.
 */

public class CognitoSessionManager {

    private static final CognitoSessionManager ourInstance = new CognitoSessionManager();

    private CognitoUserPool mUserPool;

    public static CognitoSessionManager getInstance() {
        return ourInstance;
    }

    private CognitoSessionManager() {
    }

    public void init(Context applicationContext) {

    }
}
