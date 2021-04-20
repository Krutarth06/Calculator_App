package com.example.mycalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class scientific_calculator extends AppCompatActivity {
private ImageButton mainview;
private Button xpowy;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scientific_calculator);
        mainview= findViewById(R.id.mainview);
        mainview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mainview();
            }
        });
        xpowy=findViewById(R.id.x2y);
        xpowy.setText(Html.fromHtml("X<sup>y</sup>"));
    }
    public void mainview(){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}