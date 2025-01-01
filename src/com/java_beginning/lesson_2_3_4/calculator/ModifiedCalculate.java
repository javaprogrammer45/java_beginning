package com.java_beginning.lesson_2_3_4.calculator;

import java.text.DecimalFormat;

public class ModifiedCalculate {
    public void calculate(String enterCalcExp) {
        int firstNumber = 0;
        int secondNumber = 0;
        char sign = 0;

        String[] elementsExp = enterCalcExp.split("");
        for (int i = 0; i < elementsExp.length; i++) {
            boolean isInteger = elementsExp[i].matches("-?\\d+");
            boolean isChar = elementsExp[i].matches("[-+*/^%]");
            if (i == 0 && isInteger) {
                firstNumber = Integer.parseInt(elementsExp[i]);
            } else if (i == 0) {
                System.out.println("Ошибка!!! Введите первое число...");
                return;
            }
            if (i == 1 && isChar) {
                sign = elementsExp[1].charAt(0);
            } else if (i == 1) {
                System.out.println("Ошибка!!! Введите знак из предложенных...");
                return;
            }
            if (i == 2 && isInteger) {
                secondNumber = Integer.parseInt(elementsExp[i]);
            } else if (i == 2) {
                System.out.println("Ошибка!!! Введите второе число...");
                return;
            }
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
        printResultCalc(result, firstNumber, secondNumber, sign);

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
        return Math.floorMod(firstNumber, secondNumber);
    }

    public void printResultCalc(double result, int firstNumber, int secondNumber, char sign) {
        if (!Double.isNaN(result)) {
            DecimalFormat df = new DecimalFormat("#.###");
            System.out.println(firstNumber + " " + sign + " " + secondNumber + " = " + df.format(result));
        }
    }
}
