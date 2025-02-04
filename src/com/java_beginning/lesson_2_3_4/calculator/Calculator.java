package com.java_beginning.lesson_2_3_4.calculator;

import java.util.InputMismatchException;

public class Calculator {
    private static int firstNumber;
    private static int secondNumber;
    private static char sign;
    private static final int QUANTITY_ARGUMENTS = 3;
    private static final int QUANTITY_ELEMENTS = 4;

    public static int getFirstNumber() {
        return firstNumber;
    }

    public static int getSecondNumber() {
        return secondNumber;
    }

    public static char getSign() {
        return sign;
    }

    public static String calculate(String mathExpr) throws InvalidMathematicalSignException,
            InputFirstNumberException, InputSecondNumberException, IncorrectMathematicalSignException,
            IllegalStateException {
        String[] elementsExpr = mathExpr.trim().replace(" ", "").split("");

        if (elementsExpr.length == QUANTITY_ELEMENTS && (elementsExpr[1].matches("[-+*/^%]") ||
                elementsExpr[2].matches("[-+*/^%]"))) {
            throw new InvalidMathematicalSignException("Знак не поддерживается для выражений вида " +
                    elementsExpr[0] + " " + elementsExpr[1] + elementsExpr[2] + " " + elementsExpr[3]);
        }
        if (elementsExpr.length != QUANTITY_ARGUMENTS) {
            throw new InputMismatchException("Введите корректно выражение, например:  2 ^ 10");
        }

        if (elementsExpr[0].matches("-?\\d+")) {
            firstNumber = Integer.parseInt(elementsExpr[0]);
        } else {
            throw new InputFirstNumberException("Ошибка!!! Введите корректно первый" +
                    " аргумент(только целое число)");
        }

        if (elementsExpr[1].matches("[-+*/^%]")) {
            sign = elementsExpr[1].charAt(0);
        } else {
            throw new IncorrectMathematicalSignException("Ошибка!!! Введите корректный знак" +
                    " математической операции");
        }

        if (elementsExpr[2].matches("-?\\d+")) {
            secondNumber = Integer.parseInt(elementsExpr[2]);
        } else {
            throw new InputSecondNumberException("Ошибка!!! Введите корректно  второй" +
                    " аргумент(только целое число)");
        }

        return switch (sign) {
            case '+' -> String.valueOf(add(firstNumber, secondNumber));
            case '-' -> String.valueOf(subtract(firstNumber, secondNumber));
            case '*' -> String.valueOf(multiply(firstNumber, secondNumber));
            case '/' -> String.valueOf(div(firstNumber, secondNumber));
            case '^' -> String.valueOf(pow(firstNumber, secondNumber));
            case '%' -> String.valueOf(mod(firstNumber, secondNumber));
            default -> throw new IncorrectMathematicalSignException("Ошибка!!!" +
                    " Введите корректный знак математической операции");
        };
    }

    private static double add(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }

    private static double subtract(int firstNumber, int secondNumber) {
        return firstNumber - secondNumber;
    }

    private static double multiply(int firstNumber, int secondNumber) {
        return firstNumber * secondNumber;
    }

    private static double div(int firstNumber, int secondNumber) {
        if (secondNumber == 0) {
            throw new ArithmeticException("Ошибка. Делить на ноль нельзя!!!");
        }
        return (double) firstNumber / secondNumber;
    }

    private static double pow(int firstNumber, int secondNumber) {
        return Math.pow(firstNumber, secondNumber);
    }

    private static double mod(int firstNumber, int secondNumber) {
        if (secondNumber == 0) {
            throw new ArithmeticException("Ошибка. Делить на ноль нельзя!!!");
        }
        return Math.floorMod(firstNumber, secondNumber);
    }
}