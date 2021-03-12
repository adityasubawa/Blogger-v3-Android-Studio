package com.teknologi.blogger;

/*
 * Created by Aditya Subawa
 * Product: Teknologi Informasi based on Blogger API v3
 * 13 Okt 2020, Denpasar, Bali - Indonesia
 */

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Handler;
import android.os.Bundle;

public class SplashActivity extends AppCompatActivity {
    private int loading_time=4000;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_splash);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                Intent home=new Intent(SplashActivity.this, MainActivity.class);
                startActivity(home);
                finish();

            }
        },loading_time);
    }
}
