package com.example.covid19;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.net.DnsResolver;
import android.os.Bundle;
import android.telecom.Call;
import android.view.View;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;

import org.json.JSONArray;
import org.json.JSONObject;

public class MainActivity extends AppCompatActivity {
    EditText country;
    TextView conf,act,rec,dead;
    ProgressDialog pd;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        country = findViewById(R.id.country);
        conf = findViewById(R.id.conf);
        act = findViewById(R.id.active);
        rec = findViewById(R.id.recovery);
        dead = findViewById(R.id.dc);
        pd = new ProgressDialog(this);
        pd.setMessage("Please Wait......");
        pd.setProgress(ProgressDialog.STYLE_SPINNER);

    }

    public void search(View view) {
        String c = country.getText().toString().trim();
        pd.show();
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://api.covid19api.com/")
                .addConverterFactory(ScalarsConverterFactory.create())
                .build();
        Call<String> response = retrofit.create(Myinterface.class);
        response.enqueue(new Callback<String>){
            @Override
            public Void onRedponse(Call<String> call,Response<String> response){
                String res = response.body();
                try {
                    JSONArray root = new JSONArray(res);
                    JSONObject obj = root.getJSONObject(root.length()-1);

                }
            }
        }

    }
}