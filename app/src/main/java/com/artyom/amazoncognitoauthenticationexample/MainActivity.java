package com.artyom.amazoncognitoauthenticationexample;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.FrameLayout;

import butterknife.BindView;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.fragmentContainer)
    FrameLayout mFragmentContainer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onResume() {
        super.onResume();
        validateSession();
        initViews();
    }

    private void validateSession() {

    }
}
