package com.notes.html_css;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.webkit.WebView;
import android.widget.Button;

public class htmlchap6 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_htmlchap6);
        getSupportActionBar().hide();
        WebView web3;
        web3=findViewById(R.id.webview2);
        web3.loadUrl("https://www.w3schools.com/html/html_links.asp");
        //link for home page
        Button home;
        home=findViewById(R.id.btnhome);
        home.setOnClickListener(v->{
            Intent intenthome=new Intent(getApplicationContext(),MainActivity.class);
            startActivity(intenthome);
        });
        //link for chapter 7
        Button chap4;
        chap4=findViewById(R.id.btnchap3);
        chap4.setOnClickListener(v->{
            Intent intent4=new Intent(getApplicationContext(),htmlchap7.class);
            startActivity(intent4);
        });
    }
}