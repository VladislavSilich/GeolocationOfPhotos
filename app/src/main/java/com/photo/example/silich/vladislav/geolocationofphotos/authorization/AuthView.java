package com.photo.example.silich.vladislav.geolocationofphotos.authorization;

import com.photo.example.silich.vladislav.geolocationofphotos.LoadingView;

/**
 * Created by Lenovo on 12.10.2017.
 */

public interface AuthView  extends LoadingView{
    void openRepositoriesScreen();

    void showLoginError();

    void showPasswordError();

}
