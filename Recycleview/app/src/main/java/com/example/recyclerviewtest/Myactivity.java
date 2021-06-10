package com.example.recyclerviewtest;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.ClipData;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    RecyclerView rv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rv=findViewById(R.id.recyclerview);

        int[] images = {R.drawable.a, R.drawable.b, R.drawable.c, R.drawable.d, R.drawable.e, R.drawable.f, R.drawable.g, R.drawable.h, R.drawable.i, R.drawable.j};
        String[] itemNames = {"Rice","Chicken","Mutton","Papad","Potato","Dal","Gulab Jamun","Pickle","Custard","Curd"} ;
        String[] price={"100","150","200","30","50","60","20","10","30","25"};
        rv.setLayoutManager(new LinearLayoutManager(this));
        com.example.recyclerviewtest.ItemAdapter adapter = new ItemAdapter(this,images,itemNames,price);
        rv.setAdapter(adapter);

    }
}
