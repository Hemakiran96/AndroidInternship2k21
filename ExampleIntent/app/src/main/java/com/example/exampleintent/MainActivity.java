package com.example.exampleintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText name, number, link, add, maps;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        name = findViewById(R.id.name);
        link = findViewById(R.id.Link);
        number = findViewById(R.id.number);
        add = findViewById(R.id.add);
        maps = findViewById(R.id.location);
    }

    public void Search(View view) {
        String n = link.getText().toString();
        Uri uri = Uri.parse("https:/" + n);
        Intent i = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(i);

    }

    public void Dial(View view) {
        //implicit intent
        String n = number.getText().toString();
        //uri - unified resource identifier
        //ph - tel:,web -
        Uri uri = Uri.parse("tel:" + n);
        Intent i = new Intent(Intent.ACTION_DIAL, uri);
        startActivity(i);

    }

    public void Next(View view) {
        String n = name.getText().toString();
        //Intent obj Intent(present class,next class)
        //startActivity(obj)
        Intent i = new Intent(this, Secondactivity.class);
        i.putExtra("key", n);
        startActivity(i);

    }

    public void maps(View view) {
        String n = maps.getText().toString();
        Uri uri = Uri.parse("https://www.google.com/maps/@20.9880135,82.7525294,5z/"+n);
        Intent i = new Intent(Intent.ACTION_VIEW,uri);
        startActivity(i);

    }

}