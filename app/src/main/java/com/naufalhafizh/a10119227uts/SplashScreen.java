package com.naufalhafizh.a10119227uts;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import java.util.Timer;
import java.util.TimerTask;

//Naufal Hafizh 10119227 IF5 Rabu 27 April 2022

public class SplashScreen extends AppCompatActivity {

    //deklarasi
    private Timer splashTimer;
    private static final long DELAY =3000;
    private boolean scheduled = false;
    Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        getSupportActionBar().hide();
        context = this;
        splashTimer = new Timer();

        splashTimer.schedule(new TimerTask() {
            @Override
            public void run() {
                Intent intent = new Intent(context, WelcomeScreen.class);
                startActivity(intent);
                finish();
            }
        }, DELAY);
        scheduled = true;
    }
}