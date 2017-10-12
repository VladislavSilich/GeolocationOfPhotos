package com.photo.example.silich.vladislav.geolocationofphotos.authorization;

import android.support.annotation.NonNull;

/**
 * Created by Lenovo on 12.10.2017.
 */

public class AuthPresenter {

    private final AuthView mAuthView;

    public AuthPresenter(@NonNull AuthView authView) {
        mAuthView = authView;
    }
    public void init() {
            mAuthView.openRepositoriesScreen();
        }

}
