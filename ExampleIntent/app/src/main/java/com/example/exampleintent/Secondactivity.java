package com.example.exampleintent;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class Secondactivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secondactivity);
        String n = getIntent().getStringExtra("key");
        Toast.makeText(this, "welcome"+n,Toast.LENGTH_SHORT).show();

    }
}