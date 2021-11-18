package com.masrik.convertme;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class BasicCalculator extends AppCompatActivity {
    TextView output, input;
    Button zero, one, two, three, four, five, six, seven, eight,
            nine, add, sub, mul, div, mod, equal, clear, point,
            b_para2, button_del;
    String operation;
    double value, valueone, result;
    int subs = 1;
    boolean negative = false;

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
        setContentView(R.layout.activity_main_2);
        setTitle("Basic Calculator");
        output = findViewById(R.id.output);
        input = findViewById(R.id.input);
        zero = findViewById(R.id.button0);
        one = findViewById(R.id.button1);
        two = findViewById(R.id.button2);
        three = findViewById(R.id.button3);
        four = findViewById(R.id.button4);
        five = findViewById(R.id.button5);
        six = findViewById(R.id.button6);
        seven = findViewById(R.id.button7);
        eight = findViewById(R.id.button8);
        nine = findViewById(R.id.button9);
        point = findViewById(R.id.button_dot);
        add = findViewById(R.id.button_add);
        sub = findViewById(R.id.button_sub);
        mul = findViewById(R.id.button_multi);
        div = findViewById(R.id.button_divide);
        mod = findViewById(R.id.button_para1);
        equal = findViewById(R.id.button_equal);
        clear = findViewById(R.id.button_clear);
        b_para2 = findViewById(R.id.button_para2);
        button_del = findViewById(R.id.button_del);


        b_para2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                negative = true;
            }
        });


        zero.setOnClickListener(new View.OnClickListener() {
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

        one.setOnClickListener(new View.OnClickListener() {
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

        two.setOnClickListener(new View.OnClickListener() {
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

        three.setOnClickListener(new View.OnClickListener() {
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

        four.setOnClickListener(new View.OnClickListener() {
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

        five.setOnClickListener(new View.OnClickListener() {
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

        six.setOnClickListener(new View.OnClickListener() {
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

        seven.setOnClickListener(new View.OnClickListener() {
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

        eight.setOnClickListener(new View.OnClickListener() {
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

        nine.setOnClickListener(new View.OnClickListener() {
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

        point.setOnClickListener(new View.OnClickListener() {
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

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!input.getText().equals("")) {
                    operation = "+";
                    input();
                }
            }
        });

        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!input.getText().equals("")) {
                    operation = "-";
                    input();
                }
            }
        });

        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!input.getText().equals("")) {
                    operation = "*";
                    input();
                }
            }
        });

        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!input.getText().equals("")) {
                    operation = "/";
                    input();
                }
            }
        });

        mod.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!input.getText().equals("")) {
                    operation = "%";
                    input();
                }
            }
        });


        equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    if (!(output.getText().equals("") && input.getText().equals(""))) {
                        valueone = Double.parseDouble(input.getText().toString());
                        if (operation.equals("+")) {
                            value = value + valueone;
                            result = value;
                            output.setText(output.getText() + String.valueOf(valueone));
                            input.setText(String.valueOf(result));
                        }
                        if (operation.equals("-")) {
                            value = value - valueone;
                            result = value;
                            output.setText(output.getText() + String.valueOf(valueone));
                            input.setText(String.valueOf(result));
                        }
                        if (operation.equals("*")) {
                            value = value * valueone;
                            result = value;
                            output.setText(output.getText() + String.valueOf(valueone));
                            input.setText(String.valueOf(result));
                        }
                        if (operation.equals("/")) {
                            value = value / valueone;
                            result = value;
                            output.setText(output.getText() + String.valueOf(valueone));
                            input.setText(String.valueOf(result));
                        }
                        if (operation.equals("%")) {
                            value = value % valueone;
                            result = value;
                            output.setText(output.getText() + String.valueOf(valueone));
                            input.setText(String.valueOf(result));
                        }

                    }
                } catch (Exception e) {
                    output.setText("Error");
                }
            }
        });

        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                value = 0;
                valueone = 0;
                result = 0;
                input.setText("");
                output.setText("");
            }
        });

        button_del.setOnClickListener(new View.OnClickListener() {
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