package com.java_beginning.lesson_2_3_4.calculator;

public class Calculator {

    private static final int ARGS_QUANTITY = 3;

    public static double calculate(String mathExpr) {
        String[] args = extractElementsExpr(mathExpr);
        String firstElement = args[0];
        String secondElement = args[1];
        String thirdElement = args[2];

        checkLengthArray(args);

        int firstNumber = checkNumber(firstElement);
        char mathSign = checkSign(secondElement);
        int secondNumber = checkNumber(thirdElement);
        printMathExpr(firstNumber, mathSign, secondNumber);
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

    private static String[] extractElementsExpr(String mathExpr) {
        return mathExpr.trim().replace(" ", "").split("");
    }

    private static void checkLengthArray(String[] args) {
        if (args.length != ARGS_QUANTITY) {
            throw new IncorrectLengthExpressionException("Введите корректно выражение, например:  2 ^ 10");
        }
    }

    private static int checkNumber(String element) {
        int number;
        if (element.matches("-?\\d+")) {
            number = Integer.parseInt(element);
        } else {
            throw new NumberFormatException("Ошибка!!! Введите корректно" +
                    " аргумент(только целое число)");
        }
        return number;
    }

    private static char checkSign(String secondElement) {
        char mathSign;
        if (secondElement.matches("[-+*/^%]")) {
            mathSign = secondElement.charAt(0);
        } else {
            throw new UnsupportedOperationException("Ошибка!!! Введите корректный знак" +
                    " математической операции");
        }
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

    public static void printMathExpr(int firstNumber, char mathSign, int secondNumber) {
        System.out.print(firstNumber + " " + mathSign + " " + secondNumber);
    }
}