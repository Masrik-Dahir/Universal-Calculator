package com.masrik.convertme;

import java.math.BigInteger;

public class Func {

    public static double toBinary(double d, int precision) {
        long wholePart = (long) d;
        return Double.parseDouble(wholeToBinary(wholePart) + '.' + fractionalToBinary(d - wholePart, precision));
    }

    private static String wholeToBinary(long l) {
        return Long.toBinaryString(l);
    }

    private static String fractionalToBinary(double num, int precision) {
        StringBuilder binary = new StringBuilder();
        while (num > 0 && binary.length() < precision) {
            double r = num * 2;
            if (r >= 1) {
                binary.append(1);
                num = r - 1;
            } else {
                binary.append(0);
                num = r;
            }
        }
        return binary.toString();
    }

    public static int factorial(double number) {
        int i, fact = 1;
        for (i = 1; i <= (int) number; i++) {
            fact = fact * i;
        }
        return fact;
    }

    public static double NthRoot(double n, double value) {
        double a = Math.pow(value, 1.0 / n);
        return a;
    }

    public static double sec(double value) {
        double a = 1 / Math.cos(value);
        return a;
    }

    public static double cosec(double value) {
        double a = 1 / Math.sin(value);
        return a;
    }

    public static double cot(double value) {
        double a = 1 / Math.tan(value);
        return a;
    }

    public static double sinh(double value) {
        double a = Math.sinh(value);
        return a;
    }

    public static double cosh(double value) {
        double a = Math.cosh(value);
        return a;
    }

    public static double tanh(double value) {
        double a = Math.tanh(value);
        return a;
    }

    public static double coth(double value) {
        double a = 1 / Math.tanh(value);
        return a;
    }

    public static double sech(double value) {
        double a = 1 / Math.cosh(value);
        return a;
    }

    public static double cosech(double value) {
        double a = 1 / Math.sinh(value);
        return a;
    }

    public static double permutation(double n, double r) {
//        n >= r
        int totalobjects = (int) n;
        int selectedobject = (int) r;
        int f1 = totalobjects;
        for (int i = totalobjects - 1; i >= 1; i--) {
            f1 = f1 * i;
        }
        int number;
        number = totalobjects - selectedobject;
        int f2 = number;
        for (int i = number - 1; i >= 1; i--) {
            f2 = f2 * i;
        }
        double result = f1 / f2;

        return result;
    }

    public static double combination(double N, double K) {
//        N >= K
        BigInteger ret = BigInteger.ONE;
        for (int k = 0; k < K; k++) {
            ret = ret.multiply(BigInteger.valueOf((long) N - k))
                    .divide(BigInteger.valueOf(k + 1));
        }
        double result = Double.parseDouble(String.valueOf(ret));
        return result;


    }

    public static String addBinary() {
        // The two input Strings, containing the binary representation of the two values:
        String input0 = "1010";
        String input1 = "10";

        // Use as radix 2 because it's binary
        int number0 = Integer.parseInt(input0, 2);
        int number1 = Integer.parseInt(input1, 2);

        int sum = number0 + number1;
        return Integer.toBinaryString(sum); //returns the answer as a binary value;
    }

    public static double binaryStringToDouble(String s) {
        return stringToDouble(s, 2);
    }

    public static double stringToDouble(String s, int base) {
        String withoutPeriod = s.replace(".", "");
        double value = new BigInteger(withoutPeriod, base).doubleValue();
        String binaryDivisor = "1" + s.split("\\.")[1].replace("1", "0");
        double divisor = new BigInteger(binaryDivisor, base).doubleValue();
        return value / divisor;
    }

}
