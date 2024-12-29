package com.java_beginning.lesson_2_3_4.calculator;

public class ModifiedCalculate {
    public double calculate(String enterCalcExp) {
        String[] elementsExp = enterCalcExp.split(" ");
        int firstNumber = Integer.parseInt(elementsExp[0]);
        char sign = elementsExp[1].charAt(0);
        int secondNumber = Integer.parseInt(elementsExp[2]);
        double result = 0;
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
        return result;
    }

    private double add(int a, int b) {
        return a + b;
    }

    private double subtract(int a, int b) {
        return a - b;
    }

    private double multiply(int a, int b) {
        return a * b;
    }

    private double div(int a, int b) {
        return a / b;
    }

    private double pow(int a, int b) {
        return Math.pow(a, b);
    }

    private double mod(int a, int b) {
        return Math.floorMod(a, b);
    }

    public void printResultCalc(double result,int firstNumber, char sign, int secondNumber) {

    }

}
