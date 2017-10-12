package com.photo.example.silich.vladislav.geolocationofphotos;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TabHost;

public class AuthActivity extends AppCompatActivity {
    TabHost tabHost;
    EditText edtLoginIn,edtLoginUp,edtPassIn,edtPassUp,edtRepPassUp;
    Button btnSignIn,btnSignUp;
    private final String signIn = "Login";
    private final String signUp = "Register";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_auth);
        getSupportActionBar().hide();


        edtLoginIn = (EditText)findViewById(R.id.edt_logSignIn);
        edtLoginUp = (EditText)findViewById(R.id.edt_loginSignUp);
        edtPassIn = (EditText)findViewById(R.id.edt_pasSignIn);
        edtPassUp = (EditText)findViewById(R.id.edt_pasSignUp);
        edtRepPassUp = (EditText)findViewById(R.id.edt_repPasSignUp);
        btnSignIn = (Button)findViewById(R.id.btnSignIn);
        btnSignUp = (Button)findViewById(R.id.btnSignUp);

        tabHost = (TabHost)findViewById(R.id.tabHost);
        tabHost.setup();

        TabHost.TabSpec tabSpec;

        tabSpec = tabHost.newTabSpec("tag1");
        tabSpec.setIndicator(signIn);
        tabSpec.setContent(R.id.tab1);
        tabHost.addTab(tabSpec);

        tabSpec = tabHost.newTabSpec("tag2");
        tabSpec.setIndicator(signUp);
        tabSpec.setContent(R.id.tab2);
        tabHost.addTab(tabSpec);


        tabHost.setCurrentTabByTag("tag1");
        tabHost.getTabWidget().getChildAt(0).setBackgroundColor(Color.parseColor("#3DF53D"));
        tabHost.getTabWidget().getChildAt(1).setBackgroundColor(Color.parseColor("#3DF53D"));


    }
}
