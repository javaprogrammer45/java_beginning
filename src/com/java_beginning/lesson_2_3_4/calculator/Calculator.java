package com.java_beginning.lesson_2_3_4.calculator;

public class Calculator {

    private static final int QUANTITY_ARGUMENTS = 3;
    private static final int QUANTITY_ELEMENTS = 4;

    public static double calculate(String mathExpr) {
        String[] elementsExpr = divideString(mathExpr);

        if ((elementsExpr.length == QUANTITY_ELEMENTS) && (elementsExpr[1].matches("[-+*/^%]") ||
                elementsExpr[2].matches("[-+*/^%]"))) {
            throw new InputSignNotSupported("Знак не поддерживается для выражений вида " +
                    elementsExpr[0] + " " + elementsExpr[1] + elementsExpr[2] + " " + elementsExpr[3]);
        }

        if (elementsExpr.length != QUANTITY_ARGUMENTS) {
            throw new IncorrectInputExpression("Введите корректно выражение, например:  2 ^ 10");
        }
        return switch (checkSign(mathExpr)) {
            case '+' -> add(checkFirstNumber(mathExpr), checkSecondNumber(mathExpr));
            case '-' -> subtract(checkFirstNumber(mathExpr), checkSecondNumber(mathExpr));
            case '*' -> multiply(checkFirstNumber(mathExpr), checkSecondNumber(mathExpr));
            case '/' -> div(checkFirstNumber(mathExpr), checkSecondNumber(mathExpr));
            case '^' -> pow(checkFirstNumber(mathExpr), checkSecondNumber(mathExpr));
            case '%' -> mod(checkFirstNumber(mathExpr), checkSecondNumber(mathExpr));
            default -> throw new IncorrectMathematicalSignException("Ошибка!!!" +
                    " Введите корректный знак математической операции");
        };
    }

    public static String[] divideString(String mathExpr) {
        return mathExpr.trim().replace(" ", "").split("");
    }

    public static int checkFirstNumber(String mathExpr) {
        String[] elementsExpr = divideString(mathExpr);
        int firstNumber;
        if (elementsExpr[0].matches("-?\\d+")) {
            firstNumber = Integer.parseInt(elementsExpr[0]);
        } else {
            throw new InputFirstNumberException("Ошибка!!! Введите корректно первый" +
                    " аргумент(только целое число)");
        }
        return firstNumber;
    }

    public static char checkSign(String mathExpr) {
        String[] elementsExpr = divideString(mathExpr);
        char sign;
        if (elementsExpr[1].matches("[-+*/^%]")) {
            sign = elementsExpr[1].charAt(0);
        } else {
            throw new IncorrectMathematicalSignException("Ошибка!!! Введите корректный знак" +
                    " математической операции");
        }
        return sign;
    }

    public static int checkSecondNumber(String mathExpr) {
        String[] elementsExpr = divideString(mathExpr);
        int secondNumber;
        if (elementsExpr[2].matches("-?\\d+")) {
            secondNumber = Integer.parseInt(elementsExpr[2]);
        } else {
            throw new InputFirstNumberException("Ошибка!!! Введите корректно второй" +
                    " аргумент(только целое число)");
        }
        return secondNumber;
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