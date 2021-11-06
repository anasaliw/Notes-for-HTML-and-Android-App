package com.notes.html_css;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.webkit.WebView;
import android.widget.Button;

public class htmlchap5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_htmlchap5);
        getSupportActionBar().hide();
        WebView web5;
        web5=findViewById(R.id.webview5);
        web5.loadUrl("https://www.w3schools.com/html/html_colors.asp");
        //link for home page
        Button home;
        home=findViewById(R.id.btnhome);
        home.setOnClickListener(v->{
            Intent intenthome=new Intent(getApplicationContext(),MainActivity.class);
            startActivity(intenthome);
        });
        //link for chapter 6
        Button chap6;
        chap6=findViewById(R.id.btnchap6);
        chap6.setOnClickListener(v->{
            Intent intent6=new Intent(getApplicationContext(),htmlchap6.class);
            startActivity(intent6);
        });
    }
}