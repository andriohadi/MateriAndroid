package com.example.materiandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.net.URL;

public class MainActivity extends AppCompatActivity {

    Button Tips1,Tips2,Tips3,Tips4,Tips5;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Tips1 = (Button)findViewById(R.id.btn1);
        Tips1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this,Tips_1.class);
                startActivity(i);
            }
        });

        Tips2 = (Button)findViewById(R.id.btn2);
        Tips2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this,Tips_2.class);
                startActivity(i);
            }
        });

        Tips3 = (Button)findViewById(R.id.btn3);
        Tips3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this,Tips_3.class);
                startActivity(i);
            }
        });

        Tips4 = (Button)findViewById(R.id.btn4);
        Tips4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this,Tips_4.class);
                startActivity(i);
            }
        });

        Tips5 = (Button)findViewById(R.id.btn5);
        Tips5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this,Tips_5.class);
                startActivity(i);
            }
        });

    }
}
