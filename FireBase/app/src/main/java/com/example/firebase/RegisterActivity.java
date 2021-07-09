package com.example.firebase;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.view.View;
import android.widget.EditText;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.auth.FirebaseAuth;

public class RegisterActivity extends AppCompatActivity {
    EditText rmail,rpass,rrepass;
    FirebaseAuth auth;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        rmail = findViewById(R.id.rmail);
        rpass = findViewById(R.id.rpass);
        rrepass = findViewById(R.id.rrepass);
        auth = FirebaseAuth.getInstance();

    }
    public void signup(View view){

    }
}
