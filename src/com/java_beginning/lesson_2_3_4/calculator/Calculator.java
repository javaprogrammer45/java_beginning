package com.java_beginning.lesson_2_3_4.calculator;

public class Calculator {
    public void calculate(int firstNumber, int secondNumber, char sign) {
        int result = 0;
        switch (sign) {
            case '+':
                result = add(firstNumber, secondNumber);
                break;
            case '-':
                result = subtract(firstNumber, secondNumber);
                break;
            case '*':
                result = multiply(firstNumber, secondNumber);
                break;
            case '/':
                result = div(firstNumber, secondNumber);
                break;
            case '^':
                result = pow(firstNumber, secondNumber);
                break;
            case '%':
                result = mod(firstNumber, secondNumber);
                break;
        }
        System.out.println(result);
    }

    private int add(int a, int b) {
        return a + b;
    }

    private int subtract(int a, int b) {
        return a - b;
    }

    private int multiply(int a, int b) {
        return a * b;
    }

    private int div(int a, int b) {
        return a / b;
    }

    private int pow(int a, int b) {
        int result = 1;
        for (int i = 1; i <= b; i++) {
            result *= a;
        }
        return b < 0 ? 1 / result : result;
    }

    private int mod(int a, int b) {
        return a % b;
    }
}