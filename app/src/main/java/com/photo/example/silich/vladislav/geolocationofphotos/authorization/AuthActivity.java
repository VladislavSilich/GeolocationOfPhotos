package com.photo.example.silich.vladislav.geolocationofphotos.authorization;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TabHost;
import android.widget.Toast;

import com.photo.example.silich.vladislav.geolocationofphotos.InputValidation;
import com.photo.example.silich.vladislav.geolocationofphotos.R;

public class AuthActivity extends AppCompatActivity implements View.OnClickListener,AuthView {
    TabHost tabHost;
    EditText edtLoginIn,edtLoginUp,edtPassIn,edtPassUp,edtRepPassUp;
    Button btnSignIn,btnSignUp;
    ProgressBar mProgressBar;
    AuthPresenter mAuthPresenter;
    private final String signIn = "Login";
    private final String signUp = "Register";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_auth);
        getSupportActionBar().hide();

        mAuthPresenter = new AuthPresenter(this);
        edtLoginIn = (EditText)findViewById(R.id.edt_logSignIn);
        edtLoginUp = (EditText)findViewById(R.id.edt_loginSignUp);
        edtPassIn = (EditText)findViewById(R.id.edt_pasSignIn);
        edtPassUp = (EditText)findViewById(R.id.edt_pasSignUp);
        edtRepPassUp = (EditText)findViewById(R.id.edt_repPasSignUp);
        btnSignIn = (Button)findViewById(R.id.btnSignIn);
        btnSignUp = (Button)findViewById(R.id.btnSignUp);
        mProgressBar = (ProgressBar)findViewById(R.id.progressBar);

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

        btnSignIn.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btnSignIn:
                mAuthPresenter.init();
                break;
        }
    }
    @Override
    public void showLoading() {
        mProgressBar.setVisibility(View.VISIBLE);
    }
    @Override
    public void hideLoading() {
        mProgressBar.setVisibility(View.GONE);
    }

    @Override
    public void openRepositoriesScreen() {
        Toast.makeText(this,"sadasda",Toast.LENGTH_LONG).show();
    }
    @Override
    public void showErrorEmptyData() {
        InputValidation.checkEmptyData(edtLoginIn.getText().toString(),edtPassIn.getText().toString(),this);
    }

    @Override
    public void showErrorPasswordEquals() {
        InputValidation.checkPasswordEquals(edtLoginIn.getText().toString(),edtPassIn.getText().toString(),this);
    }

    @Override
    public void showErrorLengthPass() {
        InputValidation.checkLengthPass(edtLoginIn.getText().toString(),edtPassIn.getText().toString(),this);
    }
}
