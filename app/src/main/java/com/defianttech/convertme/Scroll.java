package com.defianttech.convertme;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;


public class Scroll extends AppCompatActivity {
    Button basic_calculator, scientific_calculator, unit_converter, exit;

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scroll);

        basic_calculator = findViewById(R.id.basic_calculator);
        scientific_calculator = findViewById(R.id.scientific_calculator);
        unit_converter = findViewById(R.id.unit_converter);
        exit = findViewById(R.id.exit);


        basic_calculator.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent myIntent = new Intent(view.getContext(), MainActivity.class);
                startActivityForResult(myIntent, 0);
            }

        });

        scientific_calculator.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent myIntent = new Intent(view.getContext(), Activity2.class);
                startActivityForResult(myIntent, 0);
            }

        });

        unit_converter.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent myIntent = new Intent(view.getContext(), ConvertActivity.class);
                startActivityForResult(myIntent, 0);
            }

        });


        exit.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                finish();
//                System.exit(0);
            }

        });


    }


}
