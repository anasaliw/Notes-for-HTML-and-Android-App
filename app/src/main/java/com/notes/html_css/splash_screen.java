package com.notes.html_css;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class splash_screen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        getSupportActionBar().hide();
        Thread thread=new Thread(){
          public void run(){
              try {
                  sleep(3000);
              }
              catch (Exception e){
                  e.printStackTrace();
              }
              finally {
                  Intent intent=new Intent(getApplicationContext(),MainActivity.class);
                  startActivity(intent);
                  finish();
              }
          }
        };thread.start();
    }
}