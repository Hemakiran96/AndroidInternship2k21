package com.example.quiz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {

    private Button startBtn,bookmarkbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        startBtn = findViewById(R.id.start_btn);
        bookmarkbtn = findViewById(R.id.bookmarks_btn);




        startBtn.setOnClickListener((v) -> {
                Intent categeriesIntent = new Intent(MainActivity.this,CategeriesActivity.class);
                startActivity(categeriesIntent);

        });
        bookmarkbtn.setOnClickListener((v) -> {
            Intent BookmarksIntent = new Intent(MainActivity.this,BookmarkActivity.class);
            startActivity(BookmarksIntent);

        });
    }
}