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
            b_para2;
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
                        if (operation.equals(" (P) ")) {
                            value = Func.permutation(value, valueone);
                            result = value;
                            output.setText(output.getText() + String.valueOf(valueone));
                            input.setText(String.valueOf(result));
                        }
                        if (operation.equals(" (C) ")) {
                            value = Func.combination(value, valueone);
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
                        if (operation.equals("pow")) {
                            value = Math.pow(value, valueone);
                            result = value;
                            output.setText(output.getText() + String.valueOf(valueone));
                            input.setText(String.valueOf(result));
                        }
                        if (operation.equals("sin")) {
                            value = Math.sin(valueone);
                            result = value;
                            output.setText("Sin(" + valueone + ")=");
                            input.setText(String.valueOf(result));
                        }
                        if (operation.equals("cos")) {
                            value = Math.cos(valueone);
                            result = value;
                            output.setText("Cos(" + valueone + ")=");
                            input.setText(String.valueOf(result));
                        }
                        if (operation.equals("tan")) {
                            value = Math.tan(valueone);
                            result = value;
                            output.setText("Tan(" + valueone + ")=");
                            input.setText(String.valueOf(result));
                        }
                        if (operation.equals("log")) {
                            value = Math.log10(valueone);
                            result = value;
                            output.setText("Log(" + valueone + ")=");
                            input.setText(String.valueOf(result));
                        }
                        if (operation.equals("ln")) {
                            value = Math.log(valueone);
                            result = value;
                            output.setText("Ln(" + valueone + ")=");
                            input.setText(String.valueOf(result));
                        }
                        if (operation.equals("sqrt")) {
                            value = Math.sqrt(valueone);
                            result = value;
                            output.setText("Sqrt(" + valueone + ")=");
                            input.setText(String.valueOf(result));
                        }
                        if (operation.equals("square")) {
                            value = valueone * valueone;
                            result = value;
                            output.setText("Square(" + valueone + ")=");
                            input.setText(String.valueOf(result));
                        }
                        if (operation.equals("sin")) {
                            value = Math.sin(valueone);
                            result = value;
                            output.setText("Sin(" + valueone + ")=");
                            input.setText(String.valueOf(result));
                        }
                        if (operation.equals("cot")) {
                            value = Func.cot(valueone);
                            result = value;
                            output.setText("Cot(" + valueone + ")=");
                            input.setText(String.valueOf(result));
                        }
                        if (operation.equals("sec")) {
                            value = Func.sec(valueone);
                            result = value;
                            output.setText("Sec(" + valueone + ")=");
                            input.setText(String.valueOf(5));
                        }
                        if (operation.equals("cosec")) {
                            value = Func.cosec(valueone);
                            result = value;
                            output.setText("Cosec(" + valueone + ")=");
                            input.setText(String.valueOf(result));
                        }
                        if (operation.equals("sinh")) {
                            value = Func.sinh(valueone);
                            result = value;
                            output.setText("Sinh(" + valueone + ")=");
                            input.setText(String.valueOf(result));
                        }
                        if (operation.equals("cosh")) {
                            value = Func.cosh(valueone);
                            result = value;
                            output.setText("Cosh(" + valueone + ")=");
                            input.setText(String.valueOf(result));
                        }
                        if (operation.equals("tanh")) {
                            value = Func.tanh(valueone);
                            result = value;
                            output.setText("Tanh(" + valueone + ")=");
                            input.setText(String.valueOf(result));
                        }
                        if (operation.equals("sech")) {
                            value = Func.sech(valueone);
                            result = value;
                            output.setText("Sech(" + valueone + ")=");
                            input.setText(String.valueOf(result));
                        }
                        if (operation.equals("cosech")) {
                            value = Func.cosech(valueone);
                            result = value;
                            output.setText("Cosech(" + valueone + ")=");
                            input.setText(String.valueOf(result));
                        }
                        if (operation.equals("coth")) {
                            value = Func.coth(valueone);
                            result = value;
                            output.setText("Coth(" + valueone + ")=");
                            input.setText(String.valueOf(result));
                        }
//                    if(operation.equals("fact")){
//                        value= (double) Func.factorial(valueone);
//                        result=value;
//                        output.setText(valueone+"!");
//                        input.setText(String.valueOf(result));
//                    }
//                    -nrt
                        if (operation.equals("-rt ")) {

                            value = Func.NthRoot(value, valueone);
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