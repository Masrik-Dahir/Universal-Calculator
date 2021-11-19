package com.masrik.convertme;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;


public class Scroll extends AppCompatActivity {
    Button basic_calculator, scientific_calculator, exit, unit_converter, binary_calculator, hexadecimal_calculator, decimal_calculator;

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scroll);

        basic_calculator = findViewById(R.id.basic_calculator);
        scientific_calculator = findViewById(R.id.scientific_calculator);
        exit = findViewById(R.id.exit);
        unit_converter = findViewById(R.id.unit_converter);
        binary_calculator = findViewById(R.id.binary_calculator);
        hexadecimal_calculator = findViewById(R.id.hexadecimal_calculator);
        decimal_calculator = findViewById(R.id.decimal_calculator);


        basic_calculator.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent myIntent = new Intent(view.getContext(), BasicCalculator.class);
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

        binary_calculator.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent myIntent = new Intent(view.getContext(), BinaryActivity.class);
                startActivityForResult(myIntent, 0);
            }

        });

        decimal_calculator.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent myIntent = new Intent(view.getContext(), DecimalActivity.class);
                startActivityForResult(myIntent, 0);
            }

        });

//        hexadecimal_calculator.setOnClickListener(new View.OnClickListener() {
//            public void onClick(View view) {
//                Intent myIntent = new Intent(view.getContext(), Hexadecimal.class);
//                startActivityForResult(myIntent, 0);
//            }
//
//        });

        exit.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                finish();
//                System.exit(0);
            }

        });


    }


}
