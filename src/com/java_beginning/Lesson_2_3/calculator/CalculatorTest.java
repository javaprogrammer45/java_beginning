package Lesson_2_3.calculator;

import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        Scanner sc = new Scanner(System.in);
        String answer;
        do {
            System.out.println("Enter the first number: ");
            int firstNumber = sc.nextInt();
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
            int secondNumber = sc.nextInt();
            while (operationSign == '/' && secondNumber == 0) {
                System.out.println("Ошибка: деление на ноль запрещено");
                System.out.println("Enter the second number: ");
                secondNumber = sc.nextInt();
            }

            calc.calculate(firstNumber, secondNumber, operationSign);

            do {
                System.out.println("Хотите продолжить вычисления?");
                answer = sc.next().toLowerCase();
            } while (!answer.equals("yes") && !answer.equals("no"));
        } while (answer.equalsIgnoreCase("yes"));
    }
}
