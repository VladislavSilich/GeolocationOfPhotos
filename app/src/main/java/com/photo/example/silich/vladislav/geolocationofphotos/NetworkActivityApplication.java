package com.photo.example.silich.vladislav.geolocationofphotos;

import android.app.Application;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

/**
 * Created by Lenovo on 13.10.2017.
 */

public class NetworkActivityApplication extends Application {

    public static SharedPreferences sSharedPreferences;

    @Override
    public void onCreate() {
        super.onCreate();

        sSharedPreferences = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());
    }

    public static SharedPreferences getsSharedPreferences(){
        return sSharedPreferences;
    }
}
