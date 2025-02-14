package com.java_beginning.lesson_2_3_4.calculator;

import java.text.DecimalFormat;
import java.util.InputMismatchException;
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
                } catch (InputSignNotSupported f) {
                    System.out.println(f.getMessage());
                    continue;
                } catch (IncorrectInputExpression i) {
                    System.out.println(i.getMessage());
                    continue;
                } catch (InputFirstNumberException r) {
                    System.out.println(r.getMessage());
                    continue;
                } catch (InputSecondNumberException v) {
                    System.out.println(v.getMessage());
                    continue;
                } catch (IncorrectMathematicalSignException m) {
                    System.out.println(m.getMessage());
                    continue;
                } catch (IllegalStateException c) {
                    System.out.println(c.getMessage());
                    continue;
                } catch (ArithmeticException ae) {
                    System.out.println(ae.getMessage());
                    continue;
                } catch (InputMismatchException i) {
                    System.out.println(i.getMessage());
                    continue;
                }

                calcTest.printCalcResult(Calculator.checkFirstNumber(mathExpr), Calculator.checkSecondNumber(mathExpr), Calculator.checkSign(mathExpr), result);
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
        DecimalFormat df = new DecimalFormat("#.###");
        System.out.println(firstNumber + " " + sign + " " + secondNumber + " = " + df.format(result));
    }
}

