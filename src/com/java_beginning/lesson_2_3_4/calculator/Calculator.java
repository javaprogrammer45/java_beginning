package com.java_beginning.lesson_2_3_4.calculator;

public class Calculator {
    private static final int ARGS_QUANTITY = 3;

    public static double calculate(String mathExpr) {
        String[] args = splitArgs(mathExpr);

        checkLengthMathExpr(args);

        return switch (checkSign(args[1])) {
            case '+' -> add(checkNumber(args[0]), checkNumber(args[2]));
            case '-' -> subtract(checkNumber(args[0]), checkNumber(args[2]));
            case '*' -> multiply(checkNumber(args[0]), checkNumber(args[2]));
            case '/' -> div(checkNumber(args[0]), checkNumber(args[2]));
            case '^' -> pow(checkNumber(args[0]), checkNumber(args[2]));
            case '%' -> mod(checkNumber(args[0]), checkNumber(args[2]));
            default -> throw new UnsupportedOperationException("Ошибка!!!" +
                    " Введите корректный знак математической операции");
        };
    }

    private static String[] splitArgs(String mathExpr) {
        return mathExpr.split("");
    }

    private static void checkLengthMathExpr(String[] args) {
        if (args.length != ARGS_QUANTITY) {
            throw new ExprTooLongException("Введите корректно выражение, например:  2 ^ 10");
        }
    }

    private static int checkNumber(String element) {
        int number;
        if (!element.matches("-?\\d+")) {
            throw new NumberFormatException("Ошибка!!! Введите корректно" +
                    " аргумент(только целое число)");
        }
        number = Integer.parseInt(element);
        return number;
    }

    private static char checkSign(String secondElement) {
        char mathSign;
        if (!secondElement.matches("[-+*/^%]")) {
            throw new UnsupportedOperationException("Ошибка!!! Введите корректный знак" +
                    " математической операции");
        }
        mathSign = secondElement.charAt(0);
        return mathSign;
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