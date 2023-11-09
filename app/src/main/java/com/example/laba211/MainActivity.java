package com.example.laba211;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn1 = findViewById(R.id.button5);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MainActivity2.class);

                startActivity(intent);
            }

        });

        Button btn2 = findViewById(R.id.button6);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MainActivity3.class);

                startActivity(intent);
            }

        });

        Button btn3 = findViewById(R.id.button7);
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MainActivity4.class);

                startActivity(intent);
            }

        });

        Button btn4 = findViewById(R.id.button8);
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              finish();
              System.exit(0);


            }

        });
    }
}