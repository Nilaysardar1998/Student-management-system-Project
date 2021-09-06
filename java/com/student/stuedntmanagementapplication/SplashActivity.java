package com.student.stuedntmanagementapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_splash);

        Handler handler_splash_screen = new Handler();
        handler_splash_screen.postDelayed(() -> {
            Intent splash_screen_intent = new Intent(SplashActivity.this, LoginActivity.class);
            startActivity(splash_screen_intent);
            finish();
        }, 4000);
    }
}