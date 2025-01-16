package com.java_beginning.lesson_2_3_4.calculator;

import java.text.DecimalFormat;
import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        CalculatorTest calcTest = new CalculatorTest();
        Scanner sc = new Scanner(System.in);
        String answer = "yes";

        do {
            if (answer.equals("yes")) {
                System.out.println("Введите выражение из  аргументов, например:  2 ^ 10");
                String mathExpr = sc.nextLine();
                double result = calc.calculate(mathExpr);
                calcTest.printCalcResult(calc.getFirstNumber(), calc.getSecondNumber(), calc.getSign(), result);
                System.out.print("Хотите продолжить вычисления? [yes / no]:");
                answer = sc.nextLine().toLowerCase();
            }
            if (!answer.equals("yes") && !answer.equals("no")) {
                System.out.print("Введите корректный ответ [yes / no]:");
                answer = sc.nextLine().toLowerCase();
            }
        } while (!answer.equals("no"));
    }

    public void printCalcResult(int firstNumber, int secondNumber, char sign, double result) {
        if (!Double.isNaN(result)) {
            DecimalFormat df = new DecimalFormat("#.###");
            System.out.println(firstNumber + " " + sign + " " + secondNumber + " = " + df.format(result));
        }
    }
}

