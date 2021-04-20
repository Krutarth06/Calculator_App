package com.example.mycalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {
private ImageButton scientific;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        scientific = findViewById(R.id.scientific);
        scientific.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                scientific();
            }
        });
    }
    public void scientific(){
        Intent intent = new Intent(this, scientific_calculator.class);
        startActivity(intent);
    }
}