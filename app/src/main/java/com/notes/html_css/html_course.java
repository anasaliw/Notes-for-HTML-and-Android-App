package com.notes.html_css;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class html_course extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_html_course);
        //chap1
        TextView html1;
        html1=findViewById(R.id.chap1);
        html1.setOnClickListener(v->{
            Intent i1=new Intent(getApplicationContext(),htmlchap1.class);
            startActivity(i1);
        });

        //chap2
        TextView html2;
        html2=findViewById(R.id.chap2);
        html2.setOnClickListener(v->{
            Intent i2=new Intent(getApplicationContext(),htmlchap2.class);
            startActivity(i2);
        });
        //chap3
        TextView html3;
        html3=findViewById(R.id.chap3);
        html3.setOnClickListener(v->{
            Intent i3=new Intent(getApplicationContext(),htmlchap3.class);
            startActivity(i3);
        });
        //chap4
        TextView html4;
        html4=findViewById(R.id.chap4);
        html4.setOnClickListener(v->{
            Intent i4=new Intent(getApplicationContext(),htmlchap4.class);
            startActivity(i4);
        });
        //chap5
        TextView html5;
        html5=findViewById(R.id.chap5);
        html5.setOnClickListener(v->{
            Intent i5=new Intent(getApplicationContext(),htmlchap5.class);
            startActivity(i5);
        });
        //chap6
        TextView html6;
        html6=findViewById(R.id.chap6);
        html6.setOnClickListener(v->{
            Intent i6=new Intent(getApplicationContext(),htmlchap6.class);
            startActivity(i6);
        });
        //chap7
        TextView html7;
        html7=findViewById(R.id.chap7);
        html7.setOnClickListener(v->{
            Intent i7=new Intent(getApplicationContext(),htmlchap7.class);
            startActivity(i7);
        });
        //chap8
        TextView html8;
        html8=findViewById(R.id.chap8);
        html8.setOnClickListener(v->{
            Intent i8=new Intent(getApplicationContext(),htmlchap8.class);
            startActivity(i8);
        });
        //chap9
        TextView html9;
        html9=findViewById(R.id.chap9);
        html9.setOnClickListener(v->{
            Intent i9=new Intent(getApplicationContext(),htmlchap9.class);
            startActivity(i9);
        });
        //chap10
        TextView html10;
        html10=findViewById(R.id.chap10);
        html10.setOnClickListener(v->{
            Intent i10=new Intent(getApplicationContext(),htmlchap10.class);
            startActivity(i10);
        });
        //chap11
        TextView html11;
        html11=findViewById(R.id.chap11);
        html11.setOnClickListener(v->{
            Intent i11=new Intent(getApplicationContext(),htmlchap11.class);
            startActivity(i11);
        });
        //chap12
        TextView html12;
        html12=findViewById(R.id.chap12);
        html12.setOnClickListener(v->{
            Intent i12=new Intent(getApplicationContext(),htmlchap12.class);
            startActivity(i12);
        });

    }
}