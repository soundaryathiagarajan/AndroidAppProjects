package com.example.soundaryat.hellologin;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class HelloLogin extends AppCompatActivity {

    EditText mEtUsername;
    EditText mEtPassword;
    Button mBtnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hello_login);
        mEtUsername = (EditText)findViewById(R.id.etUsername);
        mEtPassword = (EditText)findViewById(R.id.etPassword);
        mBtnLogin = (Button)findViewById(R.id.btnLogin);
    }

    @Override
    protected void onStart() {
        super.onStart();
        mBtnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String username = mEtUsername.getText().toString();
                String password = mEtPassword.getText().toString();
                Log.e("Hello Login", "username: " + username + " password: " + password);
                Toast.makeText(HelloLogin.this,"Login has been attempted username: "+username,Toast.LENGTH_LONG).show();
            }
        });
    }
}
