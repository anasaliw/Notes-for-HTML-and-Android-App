package com.notes.html_css;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.webkit.WebView;
import android.widget.Button;

public class htmlchap4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_htmlchap4);
        getSupportActionBar().hide();
        WebView web4;
        web4=findViewById(R.id.webview2);
        web4.loadUrl("https://www.w3schools.com/html/html_styles.asp");
        //link for home page
        Button home;
        home=findViewById(R.id.btnhome);
        home.setOnClickListener(v->{
            Intent intenthome=new Intent(getApplicationContext(),MainActivity.class);
            startActivity(intenthome);
        });
        //link for chapter 5
        Button chap5;
        chap5=findViewById(R.id.btnchap3);
        chap5.setOnClickListener(v->{
            Intent intent5=new Intent(getApplicationContext(),htmlchap5.class);
            startActivity(intent5);
        });
    }
}