package com.notes.html_css;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView course;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        course=findViewById(R.id.html);
        course.setOnClickListener(v->{
            Intent htmlcourse=new Intent(getApplicationContext(),html_course.class);
            startActivity(htmlcourse);
        });
        //css
        course=findViewById(R.id.css);
        course.setOnClickListener(v->{
            Intent htmlcourse=new Intent(getApplicationContext(),css_course.class);
            startActivity(htmlcourse);
        });
    }
}