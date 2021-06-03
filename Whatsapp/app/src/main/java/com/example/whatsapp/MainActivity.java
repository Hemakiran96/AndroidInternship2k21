package com.example.whatsapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i("ANDROID","Activity Created");

    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("ANDROID","Activity Started");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("ANDROID", "Activity Resumed");

    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("ANDROID","Activity Paused");

    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("ANDROID","Activity Stop");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i("ANDROID","Activity Restart");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("ANDROID","Activity Destroy");
    }

    public void next(View view) {
        startActivity(new Intent(this,Secondactivity.class));
    }
}