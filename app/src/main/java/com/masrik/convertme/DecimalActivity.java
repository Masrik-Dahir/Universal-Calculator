/*
 * Copyright, Masrik Dahir, 2021
 */

package com.masrik.convertme;


import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

public class DecimalActivity extends AppCompatActivity {
    TextView output, input;
    Button b1;
    Button b0;
    Button b2;
    Button b3;
    Button b4;
    Button b5;
    Button b6;
    Button b7;
    Button b8;
    Button b9;
    Button b_equal;
    Button r_shift;
    Button l_shift;
    Button to_bin;
    Button to_hex;
    Button b_not;
    Button b_and;
    Button b_or;
    Button b_xor;
    Button b_ieee;
    Button b_del;
    Button b_clear;
    Button b_dot;
    Button b_adv;
    char ACTION;
    double val1 = Double.NaN;
    String operation;
    double value, valueone, result;
    int subs = 1;
    boolean negative = false;
    private double val2;

    /**
     * Called when the activity is first created.
     */
    private void ifErrorOnOutput() {
        if (output.getText().toString().equals("Error")) {
            output.setText("");
        }
    }

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_decimal);

        setTitle("Decimal Calculator");
        output = findViewById(R.id.output);
        input = findViewById(R.id.input);
        b0 = findViewById(R.id.button0);
        b1 = findViewById(R.id.button1);
        b2 = findViewById(R.id.button2);
        b3 = findViewById(R.id.button3);
        b4 = findViewById(R.id.button4);
        b5 = findViewById(R.id.button5);
        b6 = findViewById(R.id.button6);
        b7 = findViewById(R.id.button7);
        b8 = findViewById(R.id.button8);
        b9 = findViewById(R.id.button9);
        b_dot = findViewById(R.id.button_dot);
        b_equal = findViewById(R.id.button_equal);
        b_clear = findViewById(R.id.button_clear);
        b_del = findViewById(R.id.button_del);
        r_shift = findViewById(R.id.r_shift);
        l_shift = findViewById(R.id.l_shift);
        to_bin = findViewById(R.id.button_bin);
        to_hex = findViewById(R.id.button_hex);
        b_not = findViewById(R.id.button_not);
        b_and = findViewById(R.id.button_and);
        b_or = findViewById(R.id.button_or);
        b_xor = findViewById(R.id.button_xor);
        b_ieee = findViewById(R.id.button_ieee);


        b0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (negative == false) {
                    input.setText(input.getText() + "0");
                } else {
                    input.setText(input.getText() + "0");
                    negative = false;
                }

            }
        });

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (negative == false) {
                    input.setText(input.getText() + "1");
                } else {
                    input.setText(input.getText() + "-1");
                    negative = false;
                }
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (negative == false) {
                    input.setText(input.getText() + "2");
                } else {
                    input.setText(input.getText() + "-2");
                    negative = false;
                }
            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (negative == false) {
                    input.setText(input.getText() + "3");
                } else {
                    input.setText(input.getText() + "-3");
                    negative = false;
                }
            }
        });

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (negative == false) {
                    input.setText(input.getText() + "4");
                } else {
                    input.setText(input.getText() + "-4");
                    negative = false;
                }
            }
        });

        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (negative == false) {
                    input.setText(input.getText() + "5");
                } else {
                    input.setText(input.getText() + "-5");
                    negative = false;
                }
            }
        });

        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (negative == false) {
                    input.setText(input.getText() + "6");
                } else {
                    input.setText(input.getText() + "-6");
                    negative = false;
                }
            }
        });

        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (negative == false) {
                    input.setText(input.getText() + "7");
                } else {
                    input.setText(input.getText() + "-7");
                    negative = false;
                }
            }
        });

        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (negative == false) {
                    input.setText(input.getText() + "8");
                } else {
                    input.setText(input.getText() + "-8");
                    negative = false;
                }
            }
        });

        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (negative == false) {
                    input.setText(input.getText() + "9");
                } else {
                    input.setText(input.getText() + "-9");
                    negative = false;
                }
            }
        });

        b_dot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!input.getText().toString().contains("."))
                    if (input.getText().equals("")) {
                        input.setText("0.");
                    } else {
                        input.setText(input.getText() + ".");
                    }
            }
        });


        b_and.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!input.getText().equals("")) {
                    operation = " & ";
                    input();
                }
            }
        });

        b_or.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!input.getText().equals("")) {
                    operation = " | ";
                    input();
                }
            }
        });

        b_xor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!input.getText().equals("")) {
                    operation = " ^ ";
                    input();
                }
            }
        });


        l_shift.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!input.getText().equals("")) {
                    operation = " << ";
                    input();
                }
            }
        });

        r_shift.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!input.getText().equals("")) {
                    operation = " >> ";
                    input();
                }
            }
        });


        to_bin.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.O)
            @Override
            public void onClick(View view) {
                if (!input.getText().equals("")) {

                    value = Double.parseDouble(input.getText().toString());
                    String result_1 = String.valueOf(value);
                    String news = String.valueOf(Func.toBinary(result_1));
                    input.setText(news);
                    output.setText(String.valueOf(value));
                }

            }
        });

        to_hex.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.O)
            @Override
            public void onClick(View view) {
                if (!input.getText().equals("")) {

                    value = Double.parseDouble(input.getText().toString());
                    String result_1 = String.valueOf(value);
                    String news = String.valueOf(Func.double_to_hex(result_1));
                    input.setText(news);
                    output.setText(String.valueOf(value));
                }

            }
        });

        b_ieee.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!input.getText().equals("")) {

                    value = Double.parseDouble(input.getText().toString());
                    String news = String.valueOf(Func.double_to_ieee(value));
                    input.setText(news);
                    output.setText(String.valueOf(value));
                }

            }
        });
//
        b_not.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @RequiresApi(api = Build.VERSION_CODES.O)
            @Override
            public void onClick(View view) {
                String toBinary = Func.toBinary(input.getText().toString());
                output.setText("~ "+Func.remove_decimal(input.getText().toString()));
                if (toBinary.length() > 0) {
                    String a = "";
                    for (int i = 0; i < toBinary.length(); i++) {
                        if (toBinary.charAt(i) == '0') {
                            a += "1";
                        } else if (toBinary.charAt(i) == '1'){
                            a += "0";
                        }
                        else{
                            break;
                        }
                    }
                    input.setText(String.valueOf(Func.binary_to_double(a)));
                } else {
                    output.setText("Error");
                }
            }
        });




        b_equal.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.O)
            @Override
            public void onClick(View view) {
                try {
                    if (!(output.getText().equals("") && input.getText().equals(""))) {
                        valueone = Double.parseDouble(input.getText().toString());

                        if (operation.equals(" & ")) {
                            output.setText(output.getText() + String.valueOf(valueone));
                            value = (int) value & (int) valueone;
                            input.setText(String.valueOf(value).replace(".0",""));
                        }

                        if (operation.equals(" | ")) {
                            output.setText(output.getText() + String.valueOf(valueone));
                            value = (int) value | (int) valueone;
                            input.setText(String.valueOf(value).replace(".0",""));
                        }
                        if (operation.equals(" ^ ")) {
                            output.setText(output.getText() + String.valueOf(valueone));
                            value = (int) value ^ (int) valueone;
                            input.setText(String.valueOf(value).replace(".0",""));
                        }
                        if (operation.equals(" >> ")) {
                            output.setText(output.getText() + String.valueOf(valueone));
                            value = (int) value >> (int) valueone;
                            input.setText(String.valueOf(value).replace(".0",""));
                        }
                        if (operation.equals(" << ")) {
                            output.setText(output.getText() + String.valueOf(valueone));
                            value = (int) value << (int) valueone;
                            input.setText(String.valueOf(value).replace(".0",""));
                        }


                    }
                } catch (Exception e) {
                    output.setText("Error");
                }
            }
        });

        b_clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                value = 0;
                valueone = 0;
                result = 0;
                input.setText("");
                output.setText("");
            }
        });

        b_del.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (input.getText().length() > 0) {
                    CharSequence name = input.getText().toString();
                    input.setText(name.subSequence(0, name.length() - 1));
                } else {
                    value = Double.NaN;
                    valueone = Double.NaN;
                    input.setText("");
                    output.setText("");
                }
            }
        });


        // Advanced button
        Button next = findViewById(R.id.button_adv);
        next.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent myIntent = new Intent(view.getContext(), Scroll.class);
                startActivityForResult(myIntent, 0);
            }

        });

    }

    void input() {
        value = Double.parseDouble(input.getText().toString());
        input.setText("");
        output.setText(value + operation);
    }

}
