package com.notes.html_css;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

public class htmlchap12 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_htmlchap12);
        getSupportActionBar().hide();
        WebView web3;
        web3=findViewById(R.id.webview2);
        web3.loadUrl("https://www.w3schools.com/html/html_scripts.asp");
    }
}