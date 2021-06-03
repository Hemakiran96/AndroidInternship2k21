package com.example.whatsapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class Secondactivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secondactivity);
        Log.i("ANDROID", "SecondActivity Created");
    }

    protected void onStart() {
        super.onStart();
        Log.i("ANDROID", "SecondActivity Started");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("ANDROID", "SecondActivity Resumed");

    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("ANDROID", "SecondActivity Paused");

    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("ANDROID", "SecondActivity Stop");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i("ANDROID", "SecondActivity Restart");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("ANDROID", "SecondActivity Destroy");
    }
}
