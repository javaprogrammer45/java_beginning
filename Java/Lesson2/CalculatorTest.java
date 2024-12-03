package Lesson2;

import java.util.Locale;
import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        Scanner sc = new Scanner(System.in);
        String answer;
        long firstNumber;
        do {
            System.out.println("Enter the first number: ");
            firstNumber = sc.nextLong();
            System.out.println("Enter the operation sign: +, -, *, /, ^, %");
            char operationSign = sc.next().charAt(0);
            while (true) {
                if (operationSign == '+' || operationSign == '-' || operationSign == '*' ||
                        operationSign == '/' ||
                        operationSign == '^' || operationSign == '%') {
                    break;
                }
                System.out.println("Ошибка: операция " + operationSign + " не поддерживается");
                System.out.println("Enter the operation sign: +, -, *, /, ^, %");
                operationSign = sc.next().charAt(0);
            }

            System.out.println("Enter the second number: ");
            long secondNumber = sc.nextLong();
            while (operationSign == '/' && secondNumber == 0) {
                System.out.println("Ошибка: деление на ноль запрещено");
                System.out.println("Enter the second number: ");
                secondNumber = sc.nextLong();
            }

            calc.calculations(firstNumber, secondNumber, operationSign);

            System.out.println("Хотите продолжить вычисления?");
            answer = sc.next().toLowerCase();
            if (answer.equals("no")) {
                break;
            } else if (!answer.equals("yes") && !answer.equals("no")) {
                while (!answer.equals("yes") && !answer.equals("no")) {
                    System.out.println("Хотите продолжить вычисления?");
                    answer = sc.next();
                }
            }
        } while (answer.equalsIgnoreCase("yes"));
    }
}
