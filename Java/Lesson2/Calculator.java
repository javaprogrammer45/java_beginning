package Lesson2;

public class Calculator {
    public int calculate(int firstNumber, int secondNumber, char sign) {
        int result = 0;
        switch (sign) {
            case '+':
                result = add(firstNumber, secondNumber);
                System.out.println(result);
                break;
            case '-':
                result = subtract(firstNumber, secondNumber);
                System.out.println(result);
                break;
            case '*':
                result = multiply(firstNumber, secondNumber);
                System.out.println(result);
                break;
            case '/':
                result = divide(firstNumber, secondNumber);
                System.out.println(result);
                break;
            case '^':
                result = raisePower(firstNumber, secondNumber);
                System.out.println(result);
                break;
            case '%':
                result = getRemainderDivision(firstNumber, secondNumber);
                System.out.println(result);
                break;
        }
        return result;
    }

    private int add(int a, int b) {
        return a + b;
    }

    private int subtract(int a, int b) {
        return a - b;
    }

    private int multiply(int a, int b) {
        return a * b;
    }

    private int divide(int a, int b) {
        return a / b;
    }

    private int raisePower(int a, int b) {
        int result = 1;
        for (int i = 1; i <= b; i++) {
            result *= a;
        }
        if (b < 0) {
            return 1 / result;
        }
        return result;
    }

    private int getRemainderDivision(int a, int b) {
        return a % b;
    }
}