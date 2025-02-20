package com.java_beginning.lesson_2_3_4.calculator;

import java.text.DecimalFormat;
import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        CalculatorTest calcTest = new CalculatorTest();
        Scanner sc = new Scanner(System.in);
        String answer = "yes";

        do {
            if (answer.equals("yes")) {
                System.out.println("Введите выражение из  аргументов, например:  2 ^ 10");
                String mathExpr = sc.nextLine();
                double result;
                try {
                    result = Calculator.calculate(mathExpr);
                } catch (ExprTooLongException | NumberFormatException | UnsupportedOperationException |
                         ArithmeticException ex) {
                    System.out.println(ex.getMessage());
                    continue;
                }
                calcTest.printCalcResult(calcTest.outputMathExpr(mathExpr), result);
                System.out.print("Хотите продолжить вычисления? [yes / no]:");
                answer = sc.nextLine().toLowerCase();
            }
            if (!answer.equals("yes") && !answer.equals("no")) {
                System.out.print("Введите корректный ответ [yes / no]:");
                answer = sc.nextLine().toLowerCase();
            }
        } while (!answer.equals("no"));
    }

    public String outputMathExpr(String mathExpr) {
        return mathExpr.replaceAll(" [\\s]*", " ");
    }

    public void printCalcResult(String mathExpr, double result) {
        DecimalFormat df = new DecimalFormat("#.###");
        System.out.println(mathExpr + " = " + df.format(result));
    }
}

