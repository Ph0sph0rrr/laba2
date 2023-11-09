package com.example.laba211;

import androidx.appcompat.app.AppCompatActivity;
import android.widget.Button;
import android.os.Bundle;
import android.view.View;

public class MainActivity4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);





    }

    public void changebutton(View view) {
        Button button19 = findViewById(R.id.button19) ;
        button19.setBackgroundColor(getResources().getColor(android.R.color.holo_green_light));


    }
}

