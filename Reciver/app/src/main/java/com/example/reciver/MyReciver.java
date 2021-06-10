package com.example.reciver;


import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.ImageView;

public class MyReciver extends BroadcastReceiver {
    ImageView iv;
    public MyReciver(ImageView iv){
        this.iv = iv;
    }
    @Override
    public void onReceive(Context context, Intent intent) {
        switch (intent.getAction()){
            case Intent.ACTION_POWER_CONNECTED:
                iv.setImageResource(R.drawable.ic_batfull);
                break;
            case Intent.ACTION_POWER_DISCONNECTED:
                iv.setImageResource(R.drawable.ic_batless);
                break;
        }
    }
}
