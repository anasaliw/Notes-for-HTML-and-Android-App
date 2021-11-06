package com.notes.html_css;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.webkit.WebView;
import android.widget.Button;

public class htmlchap1 extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_htmlchap1);
        getSupportActionBar().hide();
        WebView web1;
        web1=findViewById(R.id.webview2);
        web1.loadUrl("https://www.w3schools.com/html/html_intro.asp");
        //link for home page
        Button home;
        home=findViewById(R.id.btnhome);
        home.setOnClickListener(v->{
            Intent intenthome=new Intent(getApplicationContext(),MainActivity.class);
            startActivity(intenthome);
        });
        //link for chapter 2
        Button chap2;
        chap2=findViewById(R.id.btnchap3);
        chap2.setOnClickListener(v->{
            Intent intent2=new Intent(getApplicationContext(),htmlchap2.class);
            startActivity(intent2);
        });
    }
}