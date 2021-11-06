package com.defianttech.convertme;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Activity2 extends AppCompatActivity {
    TextView output, input;
    Button zero, one, two, three, four, five, six, seven, eight,
            nine, add, sub, mul, div, mod, equal, clear, del, point,
            sin, cos, tan, log, ln, sqrt, square, pow, hide, factorial,
            nrt, sinh, cosh, tanh, sec, cosec, cot, sech, cosech, coth,
            toradian, todegree, permutation, combination;
    String operation;
    double value, valueone, result;
    int subs = 1;

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
        setContentView(R.layout.activity_main);

        output = findViewById(R.id.output);
        input = findViewById(R.id.input);
        zero = findViewById(R.id.zero);
        one = findViewById(R.id.one);
        two = findViewById(R.id.two);
        three = findViewById(R.id.three);
        four = findViewById(R.id.four);
        five = findViewById(R.id.five);
        six = findViewById(R.id.six);
        seven = findViewById(R.id.seven);
        eight = findViewById(R.id.eight);
        nine = findViewById(R.id.nine);
        point = findViewById(R.id.point);
        add = findViewById(R.id.add);
        sub = findViewById(R.id.minus);
        mul = findViewById(R.id.mul);
        div = findViewById(R.id.div);
        mod = findViewById(R.id.mod);
        equal = findViewById(R.id.equal);
        clear = findViewById(R.id.clear);
        del = findViewById(R.id.delete);
        sin = findViewById(R.id.sin);
        cos = findViewById(R.id.cos);
        tan = findViewById(R.id.tan);
        log = findViewById(R.id.log);
        ln = findViewById(R.id.ln);
        sqrt = findViewById(R.id.sqrt);
        square = findViewById(R.id.square);
        pow = findViewById(R.id.pow);
        hide = findViewById(R.id.hide);
        factorial = findViewById(R.id.factorial);
        nrt = findViewById(R.id.nrt);
        sinh = findViewById(R.id.sinh);
        cosh = findViewById(R.id.cosh);
        tanh = findViewById(R.id.tanh);
        sec = findViewById(R.id.sec);
        cosec = findViewById(R.id.cosec);
        cot = findViewById(R.id.cot);
        sech = findViewById(R.id.sech);
        cosech = findViewById(R.id.cosech);
        coth = findViewById(R.id.coth);
        todegree = findViewById(R.id.todegree);
        toradian = findViewById(R.id.toradian);
        permutation = findViewById(R.id.permutation);
        combination = findViewById(R.id.combination);


        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                input.setText(input.getText() + "0");
            }
        });

        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                input.setText(input.getText() + "1");
            }
        });

        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                input.setText(input.getText() + "2");
            }
        });

        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                input.setText(input.getText() + "3");
            }
        });

        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                input.setText(input.getText() + "4");
            }
        });

        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                input.setText(input.getText() + "5");
            }
        });

        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                input.setText(input.getText() + "6");
            }
        });

        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                input.setText(input.getText() + "7");
            }
        });

        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                input.setText(input.getText() + "8");
            }
        });

        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                input.setText(input.getText() + "9");
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

        factorial.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                operation="fact";
                if (!input.getText().equals("")) {

                    value = Double.parseDouble(input.getText().toString());
                    operation = "fact";
                    output.setText(value + "!");

                    value = Double.parseDouble(input.getText().toString());
                    result = Func.factorial(value);
                    input.setText(String.valueOf(result));
                }

            }
        });

        del.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int length = input.getText().length();
                String str;
                if (!(length == 0)) {
                    str = input.getText().toString();
                    input.setText(str.substring(0, length - 1));
                }
            }
        });

        sin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (input.getText().equals("")) {
                    output.setText("SIN(x)");
                    operation = "sin";
                } else {
                    operation = "sin";
                    value = Double.parseDouble(input.getText().toString());
                    result = Math.sin(value);
                    output.setText("SIN(" + value + ")=");
                    input.setText(String.valueOf(result));

                }
            }
        });

        cos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (input.getText().equals("")) {
                    output.setText("COS(x)");
                    operation = "cos";
                } else {
                    value = Double.parseDouble(input.getText().toString());
                    result = Math.cos(value);
                    output.setText("COS(" + value + ")=");
                    input.setText(String.valueOf(result));
                }
            }
        });

        tan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (input.getText().equals("")) {
                    output.setText("TAN(x)");
                    operation = "tan";
                } else {
                    value = Double.parseDouble(input.getText().toString());
                    result = Math.tan(value);
                    output.setText("TAN(" + value + ")=");
                    input.setText(String.valueOf(result));
                }
            }
        });

        cot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (input.getText().equals("")) {
                    output.setText("COT(x)");
                    operation = "cot";
                } else {
                    value = Double.parseDouble(input.getText().toString());
                    result = Func.cot(value);
                    output.setText("COT(" + value + ")=");
                    input.setText(String.valueOf(result));
                }
            }
        });

        sec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (input.getText().equals("")) {
                    output.setText("SEC(x)");
                    operation = "sec";
                } else {
                    value = Double.parseDouble(input.getText().toString());
                    result = Func.sec(value);
                    output.setText("SEC(" + value + ")=");
                    input.setText(String.valueOf(result));
                }
            }
        });

        cosec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (input.getText().equals("")) {
                    output.setText("COSEC(x)");
                    operation = "cosec";
                } else {
                    value = Double.parseDouble(input.getText().toString());
                    result = Func.cosec(value);
                    output.setText("COSEC(" + value + ")=");
                    input.setText(String.valueOf(result));
                }
            }
        });

        sinh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (input.getText().equals("")) {
                    output.setText("SINH(x)");
                    operation = "sinh";
                } else {
                    value = Double.parseDouble(input.getText().toString());
                    result = Func.sinh(value);
                    output.setText("SINH(" + value + ")=");
                    input.setText(String.valueOf(result));
                }
            }
        });

        cosh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (input.getText().equals("")) {
                    output.setText("COSH(x)");
                    operation = "cosh";
                } else {
                    value = Double.parseDouble(input.getText().toString());
                    result = Func.cosh(value);
                    output.setText("COSH(" + value + ")=");
                    input.setText(String.valueOf(result));
                }
            }
        });

        tanh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (input.getText().equals("")) {
                    output.setText("TANH(x)");
                    operation = "tanh";
                } else {
                    value = Double.parseDouble(input.getText().toString());
                    result = Func.tanh(value);
                    output.setText("TANH(" + value + ")=");
                    input.setText(String.valueOf(result));
                }
            }
        });

        sech.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (input.getText().equals("")) {
                    output.setText("SECH(x)");
                    operation = "sech";
                } else {
                    value = Double.parseDouble(input.getText().toString());
                    result = Func.sech(value);
                    output.setText("SECH(" + value + ")=");
                    input.setText(String.valueOf(result));
                }
            }
        });

        cosech.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (input.getText().equals("")) {
                    output.setText("COSECH(x)");
                    operation = "cosech";
                } else {
                    value = Double.parseDouble(input.getText().toString());
                    result = Func.cosech(value);
                    output.setText("COSECH(" + value + ")=");
                    input.setText(String.valueOf(result));
                }
            }
        });

        coth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (input.getText().equals("")) {
                    output.setText("COTH(x)");
                    operation = "coth";
                } else {
                    value = Double.parseDouble(input.getText().toString());
                    result = Func.coth(value);
                    output.setText("COTH(" + value + ")=");
                    input.setText(String.valueOf(result));
                }
            }
        });

        log.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (input.getText().equals("")) {
                    output.setText("log(x)");
                    operation = "log";
                } else {
                    value = Double.parseDouble(input.getText().toString());
                    result = Math.log10(value);
                    output.setText("log(" + value + ")=");
                    input.setText(String.valueOf(result));
                }
            }
        });

        ln.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (input.getText().equals("")) {
                    output.setText("ln(x)");
                    operation = "ln";
                } else {
                    value = Double.parseDouble(input.getText().toString());
                    result = Math.log(value);
                    output.setText("ln(" + value + ")=");
                    input.setText(String.valueOf(result));
                }
            }
        });

        sqrt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (input.getText().equals("")) {
                    output.setText("sqrt(x)");
                    operation = "sqrt";
                } else {
                    value = Double.parseDouble(input.getText().toString());
                    result = Math.sqrt(value);
                    output.setText("sqrt(" + value + ")=");
                    input.setText(String.valueOf(result));
                }
            }
        });

        nrt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!input.getText().equals("")) {
                    operation = "-rt ";
                    input();
                }
            }
        });

        square.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (input.getText().equals("")) {
                    output.setText("X^2");
                    operation = "square";
                } else {
                    value = Double.parseDouble(input.getText().toString());
                    result = value * value;
                    output.setText(value + "^2");
                    input.setText(String.valueOf(result));
                }
            }
        });

        pow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!input.getText().equals("")) {

                    value = Double.parseDouble(input.getText().toString());
                    input();
                    operation = "pow";
                    output.setText(value + "^");
                }
            }
        });

        todegree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!input.getText().equals("")) {

                    value = Double.parseDouble(input.getText().toString());
                    operation = "todegree";
                    output.setText("Radian(" + value + ")=");
                    result = Math.toDegrees(value);
                    input.setText(String.valueOf(result));
                }
            }
        });

        toradian.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!input.getText().equals("")) {

                    value = Double.parseDouble(input.getText().toString());
                    operation = "toradian";
                    output.setText("Degree(" + value + ")=");
                    result = Math.toRadians(value);
                    input.setText(String.valueOf(result));
                }
            }
        });

        permutation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!input.getText().equals("")) {
                    operation = " (P) ";
                    input();
                }
            }
        });

        combination.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!input.getText().equals("")) {
                    operation = " (C) ";
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

        hide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String val = hide.getText().toString();
                if (val.equals("▲")) {
                    sin.setVisibility(View.GONE);
                    cos.setVisibility(View.GONE);
                    tan.setVisibility(View.GONE);
                    log.setVisibility(View.GONE);
                    sqrt.setVisibility(View.GONE);
                    square.setVisibility(View.GONE);
                    pow.setVisibility(View.GONE);
                    ln.setVisibility(View.GONE);
                    factorial.setVisibility(View.GONE);
                    nrt.setVisibility(View.GONE);
                    hide.setText("▼");
                    sinh.setVisibility(View.GONE);
                    cosh.setVisibility(View.GONE);
                    tanh.setVisibility(View.GONE);
                    sec.setVisibility(View.GONE);
                    cosec.setVisibility(View.GONE);
                    cot.setVisibility(View.GONE);
                    sech.setVisibility(View.GONE);
                    cosech.setVisibility(View.GONE);
                    coth.setVisibility(View.GONE);
                    permutation.setVisibility(View.GONE);
                    combination.setVisibility(View.GONE);
                    todegree.setVisibility(View.GONE);
                    toradian.setVisibility(View.GONE);
                } else {
                    sin.setVisibility(View.VISIBLE);
                    cos.setVisibility(View.VISIBLE);
                    tan.setVisibility(View.VISIBLE);
                    log.setVisibility(View.VISIBLE);
                    sqrt.setVisibility(View.VISIBLE);
                    square.setVisibility(View.VISIBLE);
                    pow.setVisibility(View.VISIBLE);
                    ln.setVisibility(View.VISIBLE);
                    factorial.setVisibility(View.VISIBLE);
                    nrt.setVisibility(View.VISIBLE);
                    hide.setText("▲");
                    sinh.setVisibility(View.VISIBLE);
                    cosh.setVisibility(View.VISIBLE);
                    tanh.setVisibility(View.VISIBLE);
                    sec.setVisibility(View.VISIBLE);
                    cosec.setVisibility(View.VISIBLE);
                    cot.setVisibility(View.VISIBLE);
                    sech.setVisibility(View.VISIBLE);
                    cosech.setVisibility(View.VISIBLE);
                    coth.setVisibility(View.VISIBLE);
                    permutation.setVisibility(View.VISIBLE);
                    combination.setVisibility(View.VISIBLE);
                    todegree.setVisibility(View.VISIBLE);
                    toradian.setVisibility(View.VISIBLE);
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