package com.notes.html_css;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class css_course extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_css_course);
     TextView chap1;
     chap1=findViewById(R.id.chapt1);
     chap1.setOnClickListener(v->{
         Intent nextintent =new Intent(getApplicationContext(),aadchap1.class);
         startActivity(nextintent);
     });
     //chap2
        chap1=findViewById(R.id.chapt2);
        chap1.setOnClickListener(v->{
            Intent nextintent =new Intent(getApplicationContext(),aadchap2.class);
            startActivity(nextintent);
        });
        //chap3
        chap1=findViewById(R.id.chapt3);
        chap1.setOnClickListener(v->{
            Intent nextintent =new Intent(getApplicationContext(),aadchap3.class);
            startActivity(nextintent);
        });
        //chap4
        chap1=findViewById(R.id.chapt4);
        chap1.setOnClickListener(v->{
            Intent nextintent =new Intent(getApplicationContext(),aachap4.class);
            startActivity(nextintent);
        });
        //chap5
        chap1=findViewById(R.id.chapt5);
        chap1.setOnClickListener(v->{
            Intent nextintent =new Intent(getApplicationContext(),aadchap5.class);
            startActivity(nextintent);
        });
        //chap6
        chap1=findViewById(R.id.chapt6);
        chap1.setOnClickListener(v->{
            Intent nextintent =new Intent(getApplicationContext(),aadchap6.class);
            startActivity(nextintent);
        });
        //chap7
        chap1=findViewById(R.id.chapt7);
        chap1.setOnClickListener(v->{
            Intent nextintent =new Intent(getApplicationContext(),aadchap7.class);
            startActivity(nextintent);
        });
        //chap8
        chap1=findViewById(R.id.chapt8);
        chap1.setOnClickListener(v->{
            Intent nextintent =new Intent(getApplicationContext(),aadchap8.class);
            startActivity(nextintent);
        });
        //chap9
        chap1=findViewById(R.id.chapt9);
        chap1.setOnClickListener(v->{
            Intent nextintent =new Intent(getApplicationContext(),aadchap9.class);
            startActivity(nextintent);
        });
        //chap10
        chap1=findViewById(R.id.chapt10);
        chap1.setOnClickListener(v->{
            Intent nextintent =new Intent(getApplicationContext(),aadchap10.class);
            startActivity(nextintent);
        });
    }
}