package com.example.dan.ChickMonitor;

import android.graphics.Color;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.dan.ChickMonitor.R;

import gr.net.maroulis.library.EasySplashScreen;

public class welcome extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();

        EasySplashScreen welcome = new EasySplashScreen(welcome.this)
                .withFullScreen()
                .withTargetActivity(MainActivity.class)
                .withSplashTimeOut(3000)
                .withLogo(R.drawable.chick1)
                .withBackgroundColor(Color.parseColor("#FFFFFF"))
                .withHeaderText("Welcome to ChickMonitor!")
                .withAfterLogoText("Helping Farmers to Monitor their chicks")
                .withFooterText("Copyright @ Danny");

        welcome.getHeaderTextView().setTextColor(Color.BLUE);
        welcome.getHeaderTextView().setTextSize(15);
        welcome.getFooterTextView().setTextSize(15);
        welcome.getAfterLogoTextView().setTextSize(20);
        welcome.getFooterTextView().setTextColor(Color.DKGRAY);

        View view = welcome.create();
        setContentView(view);
    }
}
