package com.java_beginning.lesson_2_3_4.calculator;

public class Calculator {
    private int firstNumber;
    private int secondNumber;
    private char sign;

    public int getFirstNumber() {
        return firstNumber;
    }

    public int getSecondNumber() {
        return secondNumber;
    }

    public char getSign() {
        return sign;
    }

    public double calculate(String mathExpr) {
        String[] elementsExp = mathExpr.split(" ");
        if (elementsExp.length != 3) {
            System.out.println("Введите корректно выражение, например:  2 ^ 10");
            return Double.NaN;
        }

        if (elementsExp[0].matches("-?\\d+")) {
            firstNumber = Integer.parseInt(elementsExp[0]);
        } else {
            System.out.println("Ошибка!!! Введите первое число...");
            return Double.NaN;
        }
        if (elementsExp[1].matches("[-+*/^%]")) {
            sign = elementsExp[1].charAt(0);
        } else {
            System.out.println("Ошибка!!! Введите корректный знак математической операции...");
            return Double.NaN;
        }
        if (elementsExp[2].matches("-?\\d+")) {
            secondNumber = Integer.parseInt(elementsExp[2]);
        } else {
            System.out.println("Ошибка!!! Введите второе число...");
            return Double.NaN;
        }

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
        return result;
    }

    private double add(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }

    private double subtract(int firstNumber, int secondNumber) {
        return firstNumber - secondNumber;
    }

    private double multiply(int firstNumber, int secondNumber) {
        return firstNumber * secondNumber;
    }

    private double div(int firstNumber, int secondNumber) {
        double result = (double) firstNumber / secondNumber;
        if (Double.isNaN(result)) {
            System.out.println("Найдено значение NAN");
            return Double.NaN;
        }
        if (secondNumber == 0) {
            System.out.println("Ошибка. Делить на ноль нельзя!!!");
            return Double.NaN;
        }
        return result;
    }

    private double pow(int firstNumber, int secondNumber) {
        double result = Math.pow(firstNumber, secondNumber);
        if (Double.isNaN(result)) {
            System.out.println("Найдено значение NAN");
            return Double.NaN;
        }
        return result;
    }

    private double mod(int firstNumber, int secondNumber) {
        if (firstNumber == 0 || secondNumber == 0) {
            System.out.println("Введите корректные данные!!!");
            return Double.NaN;
        }
        return Math.floorMod(firstNumber, secondNumber);
    }
}
