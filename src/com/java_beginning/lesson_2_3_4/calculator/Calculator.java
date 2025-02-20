package com.java_beginning.lesson_2_3_4.calculator;

public class Calculator {
    private static final int ARGS_QUANTITY = 3;

    public static double calculate(String mathExpr) {
        String[] args = splitArgs(mathExpr);
        checkLengthMathExpr(args);

        int firstNumber = checkNumber(args[0]);
        char mathSign = args[1].charAt(0);
        int secondNumber = checkNumber(args[2]);
        return switch (mathSign) {
            case '+' -> add(firstNumber, secondNumber);
            case '-' -> subtract(firstNumber, secondNumber);
            case '*' -> multiply(firstNumber, secondNumber);
            case '/' -> div(firstNumber, secondNumber);
            case '^' -> pow(firstNumber, secondNumber);
            case '%' -> mod(firstNumber, secondNumber);
            default -> throw new UnsupportedOperationException("Ошибка!!!" +
                    " Введите корректный знак математической операции");
        };
    }

    private static String[] splitArgs(String mathExpr) {
        String[] elementsMathExpr = mathExpr.trim().split(" ");
        String[] arrayMathExpr = new String[ARGS_QUANTITY];
        int index = 0;
        for (int i = 0; i < elementsMathExpr.length; i++) {
            for (int j = 0; j < arrayMathExpr.length; j++) {
                if (!elementsMathExpr[i].equals("")) {
                    arrayMathExpr[index] = elementsMathExpr[i];
                    index++;
                    break;
                }
            }
        }
        return arrayMathExpr;
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