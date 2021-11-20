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

public class HexActivity extends AppCompatActivity {
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
    Button to_dec;
    Button b_not;
    Button b_and;
    Button b_or;
    Button b_xor;
    Button b_del;
    Button b_clear;
    Button b_dot, ba, bb, bc, bd, be, bf, button_add, button_sub, button_mul, button_div, button_mod;
    Button b_adv;
    char ACTION;
    double val1 = Double.NaN;
    String operation;
    String value, valueone;
    double result;
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
        setContentView(R.layout.activity_hex);

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
        ba = findViewById(R.id.buttona);
        bb = findViewById(R.id.buttonb);
        bc = findViewById(R.id.buttonc);
        bd = findViewById(R.id.buttond);
        be = findViewById(R.id.buttone);
        bf = findViewById(R.id.buttonf);
        b_dot = findViewById(R.id.button_dot);
        b_equal = findViewById(R.id.button_equal);
        b_clear = findViewById(R.id.button_clear);
        b_del = findViewById(R.id.button_del);
        r_shift = findViewById(R.id.r_shift);
        l_shift = findViewById(R.id.l_shift);
        to_bin = findViewById(R.id.button_bin);
        to_dec = findViewById(R.id.button_dec);
        b_not = findViewById(R.id.button_not);
        b_and = findViewById(R.id.button_and);
        b_or = findViewById(R.id.button_or);
        b_xor = findViewById(R.id.button_xor);
        button_add = findViewById(R.id.button_add);
        button_sub = findViewById(R.id.button_sub);
        button_mul = findViewById(R.id.button_mul);
        button_div = findViewById(R.id.button_div);
        button_mod = findViewById(R.id.button_mod);


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

        ba.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (negative == false) {
                    input.setText(input.getText() + "A");
                } else {
                    input.setText(input.getText() + "-A");
                    negative = false;
                }
            }
        });

        bb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (negative == false) {
                    input.setText(input.getText() + "B");
                } else {
                    input.setText(input.getText() + "-B");
                    negative = false;
                }
            }
        });
        bc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (negative == false) {
                    input.setText(input.getText() + "C");
                } else {
                    input.setText(input.getText() + "-C");
                    negative = false;
                }
            }
        });

        bd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (negative == false) {
                    input.setText(input.getText() + "D");
                } else {
                    input.setText(input.getText() + "-D");
                    negative = false;
                }
            }
        });

        be.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (negative == false) {
                    input.setText(input.getText() + "E");
                } else {
                    input.setText(input.getText() + "-E");
                    negative = false;
                }
            }
        });

        bf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (negative == false) {
                    input.setText(input.getText() + "F");
                } else {
                    input.setText(input.getText() + "-F");
                    negative = false;
                }
            }
        });

        button_add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!input.getText().equals("")) {
                    operation = "+";
                    input();
                }
            }
        });

        button_sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!input.getText().equals("")) {
                    operation = "-";
                    input();
                }
            }
        });

        button_mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!input.getText().equals("")) {
                    operation = "*";
                    input();
                }
            }
        });

        button_div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!input.getText().equals("")) {
                    operation = "/";
                    input();
                }
            }
        });

        button_mod.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!input.getText().equals("")) {
                    operation = "%";
                    input();
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
                String val = input.getText().toString();
                if (!input.getText().equals("")) {
                    String news = Func.hex_to_binary(input.getText().toString());
                    output.setText(val);
                    input.setText(news);
                }

            }
        });

        to_dec.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.O)
            @Override
            public void onClick(View view) {
                String val = input.getText().toString();
                if (!input.getText().equals("")) {
                    String news = String.valueOf(Func.hex_to_double(input.getText().toString()));
                    output.setText(val);
                    input.setText(news);
                }

            }
        });

        b_not.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @RequiresApi(api = Build.VERSION_CODES.O)
            @Override
            public void onClick(View view) {
                String toBinary = Func.hex_to_binary(input.getText().toString());
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
                    input.setText(Func.binary_to_hex(a));
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
                        valueone = input.getText().toString();

                        if (operation.equals(" & ")) {
                            output.setText(output.getText() + String.valueOf(valueone));
                            value = String.valueOf(Func.hex_to_double(String.valueOf(value)));
                            valueone = String.valueOf(Func.hex_to_double(String.valueOf(valueone)));
                            value = String.valueOf((int) Double.parseDouble(value) & (int) Double.parseDouble(valueone));
                            String result = Func.double_to_hex(value);
                            input.setText(result.replace(".0",""));
                        }

                        if (operation.equals(" | ")) {
                            output.setText(output.getText() + String.valueOf(valueone));
                            value = String.valueOf(Func.hex_to_double(String.valueOf(value)));
                            valueone = String.valueOf(Func.hex_to_double(String.valueOf(valueone)));
                            value = String.valueOf((int) Double.parseDouble(value) | (int) Double.parseDouble(valueone));
                            String result = Func.double_to_hex(value);
                            input.setText(result.replace(".0",""));
                        }
                        if (operation.equals(" ^ ")) {
                            output.setText(output.getText() + String.valueOf(valueone));
                            value = String.valueOf(Func.hex_to_double(String.valueOf(value)));
                            valueone = String.valueOf(Func.hex_to_double(String.valueOf(valueone)));
                            value = String.valueOf((int) Double.parseDouble(value) ^ (int) Double.parseDouble(valueone));
                            String result = Func.double_to_hex(value);
                            input.setText(result.replace(".0",""));
                        }
                        if (operation.equals(" >> ")) {
                            output.setText(output.getText() + String.valueOf(valueone));
                            value = String.valueOf(Func.hex_to_double(String.valueOf(value)));
                            valueone = String.valueOf(Func.hex_to_double(String.valueOf(valueone)));
                            value = String.valueOf((int) Double.parseDouble(value) >> (int) Double.parseDouble(valueone));
                            String result = Func.double_to_hex(value);
                            input.setText(result.replace(".0",""));
                        }
                        if (operation.equals(" << ")) {
                            output.setText(output.getText() + String.valueOf(valueone));
                            value = String.valueOf(Func.hex_to_double(String.valueOf(value)));
                            valueone = String.valueOf(Func.hex_to_double(String.valueOf(valueone)));
                            value = String.valueOf((int) Double.parseDouble(value) << (int) Double.parseDouble(valueone));
                            String result = Func.double_to_hex(value);
                            input.setText(value.replace(".0",""));
                        }
                        if (operation.equals("+")) {
                            String val = valueone;
                            output.setText(output.getText() + String.valueOf(valueone));
                            value = String.valueOf(Func.hex_to_double(String.valueOf(value)));
                            valueone = String.valueOf(Func.hex_to_double(String.valueOf(valueone)));
                            value = String.valueOf(Double.parseDouble(value) + Double.parseDouble(valueone));
                            String result = Func.double_to_hex(value);
                            input.setText(result);
                        }
                        if (operation.equals("-")) {
                            String val = valueone;
                            output.setText(output.getText() + String.valueOf(valueone));
                            value = String.valueOf(Func.hex_to_double(String.valueOf(value)));
                            valueone = String.valueOf(Func.hex_to_double(String.valueOf(valueone)));
                            value = String.valueOf(Double.parseDouble(value) - Double.parseDouble(valueone));
                            String result = Func.double_to_hex(value);
                            input.setText(result);
                        }
                        if (operation.equals("*")) {
                            String val = valueone;
                            output.setText(output.getText() + String.valueOf(valueone));
                            value = String.valueOf(Func.hex_to_double(String.valueOf(value)));
                            valueone = String.valueOf(Func.hex_to_double(String.valueOf(valueone)));
                            value = String.valueOf(Double.parseDouble(value) * Double.parseDouble(valueone));
                            String result = Func.double_to_hex(value);
                            input.setText(result);
                        }
                        if (operation.equals("/")) {
                            String val = valueone;
                            output.setText(output.getText() + String.valueOf(valueone));
                            value = String.valueOf(Func.hex_to_double(String.valueOf(value)));
                            valueone = String.valueOf(Func.hex_to_double(String.valueOf(valueone)));
                            value = String.valueOf(Double.parseDouble(value) / Double.parseDouble(valueone));
                            String result = Func.double_to_hex(value);
                            input.setText(result);
                        }
                        if (operation.equals("%")) {
                            String val = valueone;
                            output.setText(output.getText() + String.valueOf(valueone));
                            value = String.valueOf(Func.hex_to_double(String.valueOf(value)));
                            valueone = String.valueOf(Func.hex_to_double(String.valueOf(valueone)));
                            value = String.valueOf(Double.parseDouble(value) % Double.parseDouble(valueone));
                            String result = Func.double_to_hex(value);
                            input.setText(result);
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
                value = "0";
                valueone = "0";
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
                    value = "";
                    valueone = "";
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
        value = input.getText().toString();
        input.setText("");
        output.setText(value + operation);
    }

}
