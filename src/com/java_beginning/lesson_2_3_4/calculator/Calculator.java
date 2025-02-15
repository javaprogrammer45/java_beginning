package com.java_beginning.lesson_2_3_4.calculator;

public class Calculator {

    private static final int QUANTITY_ARGS = 3;

    public static double calculate(String mathExpr) {
        String[] elementsExpr = extractElementsExpr(mathExpr);
        String firstElement = elementsExpr[0];
        String secondElement = elementsExpr[1];
        String thirdElement = elementsExpr[2];

        if (elementsExpr.length != QUANTITY_ARGS) {
            throw new IncorrectLengthExpressionException("Введите корректно выражение, например:  2 ^ 10");
        }
        int firstNumber = checkFirstNumber(firstElement);
        char mathSign = checkSign(secondElement);
        int secondNumber = checkSecondNumber(thirdElement);
        printMathExpr(firstNumber, mathSign, secondNumber);
        return switch (mathSign) {
            case '+' -> add(firstNumber, secondNumber);
            case '-' -> subtract(firstNumber, secondNumber);
            case '*' -> multiply(firstNumber, secondNumber);
            case '/' -> div(firstNumber, secondNumber);
            case '^' -> pow(firstNumber, secondNumber);
            case '%' -> mod(firstNumber, secondNumber);
            default -> throw new IncorrectMathSignException("Ошибка!!!" +
                    " Введите корректный знак математической операции");
        };
    }

    private static String[] extractElementsExpr(String mathExpr) {
        return mathExpr.trim().replace(" ", "").split("");
    }

    private static int checkFirstNumber(String firstElement) {
        int firstNumber;
        if (firstElement.matches("-?\\d+")) {
            firstNumber = Integer.parseInt(firstElement);
        } else {
            throw new InputNumberException("Ошибка!!! Введите корректно" +
                    " аргумент(только целое число)");
        }
        return firstNumber;
    }

    private static char checkSign(String secondElement) {
        char mathSign;
        if (secondElement.matches("[-+*/^%]")) {
            mathSign = secondElement.charAt(0);
        } else {
            throw new IncorrectMathSignException("Ошибка!!! Введите корректный знак" +
                    " математической операции");
        }
        return mathSign;
    }

    private static int checkSecondNumber(String thirdElement) {
        int secondNumber;
        if (thirdElement.matches("-?\\d+")) {
            secondNumber = Integer.parseInt(thirdElement);
        } else {
            throw new InputNumberException("Ошибка!!! Введите корректно" +
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

    private static void printMathExpr(int firstNumber, char mathSign, int secondNumber) {
        System.out.print(firstNumber + " " + mathSign + " " + secondNumber);
    }
}