package com.java_beginning.lesson_2_3_4.calculator;

import java.util.Scanner;

public class ModifiedCalculatorTest {
    public static void main(String[] args) {
        ModifiedCalculate calc = new ModifiedCalculate();
        Scanner sc = new Scanner(System.in);
        String answer;
        do {
            System.out.println("Введите выражение из трех аргументов, например:   2 ^ 10  (число, знак операции( +, -, *, /, ^, % ),число)...");
            String enterCalcExp = sc.nextLine();
            calc.calculate(enterCalcExp);

            do {
                System.out.println("Хотите продолжить вычисления?");
                answer = sc.next().toLowerCase();
            } while (!answer.equals("yes") && !answer.equals("no"));
        } while (answer.equalsIgnoreCase("yes"));
    }
}

