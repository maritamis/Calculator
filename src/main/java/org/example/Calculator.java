package org.example;

public class Calculator {
    public Calculator(){

    }
    public static float divide(float a, float b) {
        if (b == 0) {
            throw new ArithmeticException("Cannot divide by 0");
        } else if (a == 0) {
            return 0;
        } else {
            return a / b;
        }
    }

}
