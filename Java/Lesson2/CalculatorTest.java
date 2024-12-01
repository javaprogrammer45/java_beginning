package Lesson2;

import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        Scanner sc = new Scanner(System.in);
        String answer = "";

        do {
            System.out.println("Enter the first number: ");
            long firstNumber = sc.nextLong();
            System.out.println("Enter the operation sign: +, -, *, /, ^, %");
            char operationSign = sc.next().charAt(0);
            while (operationSign != '+' || operationSign != '-' || operationSign != '*' ||
                    operationSign != '/' ||
                    operationSign != '^' || operationSign != '%') {
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

            switch (operationSign) {
                case '+':
                    long result = calc.addition(firstNumber, secondNumber);
                    System.out.println(result);
                    break;
                case '-':
                    result = calc.subtracting(firstNumber, secondNumber);
                    System.out.println(result);
                    break;
                case '*':
                    result = calc.multiplication(firstNumber, secondNumber);
                    System.out.println(result);
                    break;
                case '/':
                    result = calc.division(firstNumber, secondNumber);
                    System.out.println(result);
                    break;
                case '^':
                    result = calc.exponentiation(firstNumber, secondNumber);
                    System.out.println(result);
                    break;
                case '%':
                    result = calc.gettingRemainderDivision(firstNumber, secondNumber);
                    System.out.println(result);
                    break;
            }
            System.out.println("Хотите продолжить вычисления?");
            answer = sc.next();
            if (answer.equalsIgnoreCase("no")) {
                break;
            } else if (!answer.equalsIgnoreCase("yes") &&
                    !answer.equalsIgnoreCase("no")) {
                while (!answer.equalsIgnoreCase("yes") &&
                        !answer.equalsIgnoreCase("no")) {
                    System.out.println("Хотите продолжить вычисления?");
                    answer = sc.next();
                }
            }
        } while (answer.equalsIgnoreCase("yes"));
    }
}
