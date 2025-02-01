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
        String[] elementsExpr = mathExpr.split(" ");
        if (elementsExpr.length != 3) {
            System.out.println("Введите корректно выражение, например:  2 ^ 10");
            return Double.NaN;
        }

        if (elementsExpr[0].matches("-?\\d+")) {
            firstNumber = Integer.parseInt(elementsExpr[0]);
        } else {
            System.out.println("Ошибка!!! Введите корректно первый аргумент(только целое число)");
            return Double.NaN;
        }
        if (elementsExpr[1].matches("[-+*/^%]")) {
            sign = elementsExpr[1].charAt(0);
        } else {
            System.out.println("Ошибка!!! Введите корректный знак математической операции");
            return Double.NaN;
        }
        if (elementsExpr[2].matches("-?\\d+")) {
            secondNumber = Integer.parseInt(elementsExpr[2]);
        } else {
            System.out.println("Ошибка!!! Введите корректно  второй аргумент(только целое число)");
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
        if (secondNumber == 0) {
            System.out.println("Ошибка. Делить на ноль нельзя!!!");
            return Double.NaN;
        }
        return (double) firstNumber / secondNumber;
    }

    private double pow(int firstNumber, int secondNumber) {
        return Math.pow(firstNumber, secondNumber);
    }

    private double mod(int firstNumber, int secondNumber) {
        if (secondNumber == 0) {
            System.out.println("Ошибка. Делить на ноль нельзя!!!");
            return Double.NaN;
        }
        return Math.floorMod(firstNumber, secondNumber);
    }
}
