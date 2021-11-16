package com.masrik.convertme;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.ClipboardManager;
import android.util.TypedValue;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Binary extends AppCompatActivity {
    private final char ADDITION = '+';
    private final char SUBTRACTION = '-';
    private final char MULTIPLICATION = '*';
    private final char DIVISION = '/';
    private final char EQU = '=';
    private final char EXTRA = '@';
    private final char MODULUS = '%';
    private final char RIGHT_SHIFT = '>';
    private final char LEFT_SHIFT = '<';
    private final char NOT = '~';
    private final char AND = '&';
    private final char OR = '|';
    private final char XOR = '?';
    boolean negetive = false;

    private Button b1;
    private Button b0;
    private Button b_equal;
    private Button b_multi;
    private Button b_divide;
    private Button b_add;
    private Button r_shift;
    private Button l_shift;
    private Button to_dec;
    private Button to_hex;
    private Button b_not;
    private Button b_and;
    private Button b_or;
    private Button b_xor;
    private Button b_ieee;

    private Button b_sub;
    private Button b_clear;
    private Button b_dot;
    private Button b_comp1;
    private Button b_comp2;
    private Button b_adv;
    private TextView t1;
    private TextView t2;
    private char ACTION;
    private double val1 = Double.NaN;
    private double val2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_binary);
        viewSetup();

        setTitle("Binary Calculator");

        t1.setTextIsSelectable(true);
        t2.setTextIsSelectable(true);


        t1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Context context = null;
                ClipboardManager cm = (ClipboardManager) context.getSystemService(Context.CLIPBOARD_SERVICE);
                cm.setText(t1.getText());
                Toast.makeText(context, "Copied to clipboard", Toast.LENGTH_SHORT).show();
            }
        });

        t2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Context context = null;
                ClipboardManager cm = (ClipboardManager) context.getSystemService(Context.CLIPBOARD_SERVICE);
                cm.setText(t1.getText());
                Toast.makeText(context, "Copied to clipboard", Toast.LENGTH_SHORT).show();
            }
        });


        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ifErrorOnOutput();
                exceedLength();
                if (negetive == false) {
                    t1.setText(t1.getText().toString() + "1");
                } else {
                    t1.setText(t1.getText().toString() + "-1");
                    negetive = false;
                }
            }
        });


        b0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ifErrorOnOutput();
                exceedLength();
                if (negetive == false) {
                    t1.setText(t1.getText().toString() + "0");
                } else {
                    t1.setText(t1.getText().toString() + "-0");
                    negetive = false;
                }
            }
        });

        b_dot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                exceedLength();
                t1.setText(t1.getText().toString() + ".");
            }
        });

        b_add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (t1.getText().length() > 0) {
                    ACTION = ADDITION;
                    operation();

                    if (!ifReallyDecimal()) {
                        t2.setText(val1 + "+");
                    } else {
                        t2.setText((int) val1 + "+");
                    }
                    t1.setText(null);
                } else {
                    t2.setText("Error");
                }
            }
        });

        b_sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (t1.getText().length() > 0) {
                    ACTION = SUBTRACTION;
                    operation();
                    if (t1.getText().length() > 0)
                        if (!ifReallyDecimal()) {
                            t2.setText(val1 + "-");
                        } else {
                            t2.setText((int) val1 + "-");
                        }
                    t1.setText(null);
                } else {
                    t2.setText("Error");
                }
            }
        });

        b_multi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (t1.getText().length() > 0) {
                    ACTION = MULTIPLICATION;
                    operation();
                    if (!ifReallyDecimal()) {
                        t2.setText(val1 + "×");
                    } else {
                        t2.setText((int) val1 + "×");
                    }
                    t1.setText(null);
                } else {
                    t2.setText("Error");
                }
            }
        });

        b_divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (t1.getText().length() > 0) {
                    ACTION = DIVISION;
                    operation();
                    if (ifReallyDecimal()) {
                        t2.setText((int) val1 + "/");
                    } else {
                        t2.setText(val1 + "/");
                    }
                    t1.setText(null);
                } else {
                    t2.setText("Error");
                }
            }
        });


        b_equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (t1.getText().length() > 0) {
                    operation();
                    ACTION = EQU;

                    if (!ifReallyDecimal()) {
                        t2.setText(/*t2.getText().toString() + String.valueOf(val2) + "=" + */String.valueOf(val1));
                    } else {
                        t2.setText(/*t2.getText().toString() + String.valueOf(val2) + "=" + */String.valueOf((int) val1));
                    }
                    t1.setText(null);
                } else {
                    t2.setText("Error");
                }
            }
        });

        b_clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (t1.getText().length() > 0) {
                    CharSequence name = t1.getText().toString();
                    t1.setText(name.subSequence(0, name.length() - 1));
                } else {
                    val1 = Double.NaN;
                    val2 = Double.NaN;
                    t1.setText("");
                    t2.setText("");
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


        // Empty text views on long click.
        b_clear.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                val1 = Double.NaN;
                val2 = Double.NaN;
                t1.setText("");
                t2.setText("");
                return true;
            }
        });

        r_shift.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (t1.getText().length() > 0) {
                    ACTION = RIGHT_SHIFT;
                    operation();
                    if (ifReallyDecimal()) {
                        t2.setText((int) val1 + ">>");
                    } else {
                        t2.setText(val1 + ">>");
                    }
                    t1.setText(null);
                } else {
                    t2.setText("Error");
                }
            }
        });

        l_shift.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (t1.getText().length() > 0) {
                    ACTION = LEFT_SHIFT;
                    operation();
                    if (ifReallyDecimal()) {
                        t2.setText((int) val1 + "<<");
                    } else {
                        t2.setText(val1 + "<<");
                    }
                    t1.setText(null);
                } else {
                    t2.setText("Error");
                }
            }
        });


        b_not.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (t1.getText().length() > 0) {
                    String a = "";
                    for (int i = 0; i < t1.length(); i++) {
                        if (t1.getText().charAt(i) == '0') {
                            a += "1";
                        } else {
                            a += "0";
                        }
                    }
                    t2.setText(a);
                    t1.setText(a);
                } else {
                    t2.setText("Error");
                }
            }
        });

    }

    private void viewSetup() {
        b1 = findViewById(R.id.button1);
        b0 = findViewById(R.id.button0);
        b_equal = findViewById(R.id.button_equal);
        b_multi = findViewById(R.id.button_multi);
        b_divide = findViewById(R.id.button_divide);
        b_add = findViewById(R.id.button_add);
        b_sub = findViewById(R.id.button_sub);
        b_clear = findViewById(R.id.button_clear);
        b_dot = findViewById(R.id.button_dot);
        t1 = findViewById(R.id.input);
        t2 = findViewById(R.id.output);
        b_adv = findViewById(R.id.button_adv);
        r_shift = findViewById(R.id.button_r_shift);
        l_shift = findViewById(R.id.button_l_shift);
        to_dec = findViewById(R.id.button_dex);
        to_hex = findViewById(R.id.button_hex);
        b_not = findViewById(R.id.button_not);
        b_and = findViewById(R.id.button_and);
        b_or = findViewById(R.id.button_or);
        b_xor = findViewById(R.id.button_xor);

        b_comp1 = findViewById(R.id.button_comp1);
        b_comp2 = findViewById(R.id.button_comp2);
        b_ieee = findViewById(R.id.button_ieee);
    }

    private void operation() {
        if (!Double.isNaN(val1)) {
            if (t2.getText().toString().charAt(0) == '-') {
                val1 = (-1) * val1;
            }
            val2 = 0.0;
            val2 = Double.parseDouble(t1.getText().toString());

            switch (ACTION) {
                case ADDITION:
                    val1 = to_decimal(val1);
                    val2 = to_decimal(val2);
                    val1 = val1 + val2;
                    to_binary(val1);
                    break;
                case SUBTRACTION:
                    val1 = to_decimal(val1);
                    val2 = to_decimal(val2);
                    val1 = val1 - val2;
                    to_binary(val1);
                    break;
                case MULTIPLICATION:
                    val1 = to_decimal(val1);
                    val2 = to_decimal(val2);
                    val1 = val1 * val2;
                    to_binary(val1);
                    break;
                case DIVISION:
                    val1 = to_decimal(val1);
                    val2 = to_decimal(val2);
                    val1 = val1 / val2;
                    to_binary(val1);
                    break;
                case EXTRA:
                    val1 = to_decimal(val1);
                    val1 = (-1) * val1;
                    to_binary(val1);
                    break;
                case MODULUS:
                    val1 = to_decimal(val1);
                    val2 = to_decimal(val2);
                    val1 = val1 % val2;
                    to_binary(val1);
                    break;

                case LEFT_SHIFT:
                    val1 = to_decimal(val1);
                    val2 = to_decimal(val2);
                    val1 = (int) val1 << (int) val2;
                    to_binary(val1);
                    break;

                case RIGHT_SHIFT:
                    val1 = to_decimal(val1);
                    val2 = to_decimal(val2);
                    val1 = (int) val1 >> (int) val2;
                    to_binary(val1);
                    break;

                case EQU:
                    break;
            }
        } else {
            val1 = Double.parseDouble(t1.getText().toString());
        }
    }

    // Remove error message that is already written there.
    private void ifErrorOnOutput() {
        if (t2.getText().toString().equals("Error")) {
            t2.setText("");
        }
    }


    private void to_binary(double a) {
        val1 = Func.toBinary(a, 20);
    }

    private double to_decimal(double a) {
        return Func.binaryStringToDouble(String.valueOf(a));
    }


    // Whether value if a double or not
    private boolean ifReallyDecimal() {
        return val1 == (int) val1;
    }

    private void noOperation() {
        String inputExpression = t2.getText().toString();
        if (!inputExpression.isEmpty() && !inputExpression.equals("Error")) {
            if (inputExpression.contains("-")) {
                inputExpression = inputExpression.replace("-", "");
                t2.setText("");
                val1 = Double.parseDouble(inputExpression);
            }
            if (inputExpression.contains("+")) {
                inputExpression = inputExpression.replace("+", "");
                t2.setText("");
                val1 = Double.parseDouble(inputExpression);
            }
            if (inputExpression.contains("/")) {
                inputExpression = inputExpression.replace("/", "");
                t2.setText("");
                val1 = Double.parseDouble(inputExpression);
            }
            if (inputExpression.contains("%")) {
                inputExpression = inputExpression.replace("%", "");
                t2.setText("");
                val1 = Double.parseDouble(inputExpression);
            }
            if (inputExpression.contains("×")) {
                inputExpression = inputExpression.replace("×", "");
                t2.setText("");
                val1 = Double.parseDouble(inputExpression);
            }
        }
    }

    // Make text small if too many digits.
    private void exceedLength() {
        if (t1.getText().toString().length() > 10) {
            t1.setTextSize(TypedValue.COMPLEX_UNIT_SP, 20);
        }
    }
}