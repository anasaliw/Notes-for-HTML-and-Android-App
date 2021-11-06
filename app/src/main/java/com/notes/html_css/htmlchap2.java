package com.notes.html_css;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.webkit.WebView;
import android.widget.Button;

public class htmlchap2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_htmlchap2);
        getSupportActionBar().hide();
        WebView web2;
        web2=findViewById(R.id.webview2);
        web2.loadUrl("https://www.w3schools.com/html/html_elements.asp");
        //link for home page
        Button home;
        home=findViewById(R.id.btnhome);
        home.setOnClickListener(v->{
            Intent intenthome=new Intent(getApplicationContext(),MainActivity.class);
            startActivity(intenthome);
        });
        //link for chapter 2
        Button chap3;
        chap3=findViewById(R.id.btnchap3);
        chap3.setOnClickListener(v->{
            Intent intent3=new Intent(getApplicationContext(),htmlchap3.class);
            startActivity(intent3);
        });
    }
}