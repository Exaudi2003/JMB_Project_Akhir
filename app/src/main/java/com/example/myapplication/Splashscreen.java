package com.example.myapplication;

import android.content.Intent;
import android.os.Handler;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
public class Splashscreen extends AppCompatActivity {
    private int waktu_loading=500;
    //1000=1 detik
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splashscreen);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
//setelah loading maka akan langsung berpindah ke Main activity
                Intent intent = new Intent(Splashscreen.this,
                        LoginActivity.class);
                startActivity(intent);
                finish();
            }
        }, waktu_loading);
    }
}