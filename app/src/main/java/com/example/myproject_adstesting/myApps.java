package com.example.myproject_adstesting;

import android.app.Application;

import com.google.android.gms.ads.MobileAds;

import papaya.in.admobopenads.AppOpenManager;
//watch gradle and settings.gradle file also
//openApp Ads code --->>>

public class myApps extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        MobileAds.initialize(this);

        //Add id
        new AppOpenManager(this,"ca-app-pub-3940256099942544/9257395921");
    }
}
