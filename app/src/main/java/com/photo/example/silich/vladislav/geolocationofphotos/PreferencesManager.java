package com.photo.example.silich.vladislav.geolocationofphotos;

import android.content.SharedPreferences;

/**
 * Created by Lenovo on 13.10.2017.
 */

public class PreferencesManager {
    private SharedPreferences mSheredPreferences;

   public PreferencesManager(){
       mSheredPreferences =NetworkActivityApplication.getsSharedPreferences();
   }
    public void saveUserLogin(String login){
        SharedPreferences.Editor editor = mSheredPreferences.edit();
        editor.putString(ConstantManager.USER_LOGIN,login);
        editor.apply();
    }
    public void saveUserToken(String token){
        SharedPreferences.Editor editor = mSheredPreferences.edit();
        editor.putString(ConstantManager.USER_TOKEN,token);
        editor.apply();
    }
    public String getUserLogin(){
        return mSheredPreferences.getString(ConstantManager.USER_LOGIN,"null");
    }
    private String getUserToken(){
        return mSheredPreferences.getString(ConstantManager.USER_TOKEN,"null");
    }
}
