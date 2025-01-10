package com.java_beginning.lesson_2_3_4.calculator;

import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        Scanner sc = new Scanner(System.in);
        String answer = "yes";
        do {
            if (answer.equals("yes")) {
                System.out.println("Введите выражение из  аргументов, например:  2 ^ 10");
                String mathExpr = sc.nextLine();
                calc.calculate(mathExpr);
                System.out.println("Хотите продолжить вычисления?");
                answer = sc.nextLine().toLowerCase();
            }

            if (answer.equals("no")) {
                return;
            } else {
                System.out.print("Введите корректный ответ [yes / no]:");
                answer = sc.nextLine().toLowerCase();
            }
        } while (answer.equals("yes") || !answer.equals("no"));
    }
}

