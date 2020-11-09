package com.example.messagingapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.strictmode.WebViewMethodCalledOnWrongThreadViolation;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void login(View view){
        setContentView(R.layout.log_in);
    }
    public void back(View view){
        setContentView(R.layout.activity_main);
    }
    public void signup(View view){
        setContentView(R.layout.signup);
    }
    public void next(View view){
        setContentView(R.layout.home);
    }
    public void message(View view){
        setContentView(R.layout.message);
    }
    public void information(View view){
        setContentView(R.layout.information);
    }
}

