package Lesson2;

public class Calculator {
    public long addition(long a, long b) {
        return a + b;
    }

    public long subtracting(long a, long b) {
        return a - b;
    }

    public long multiplication(long a, long b) {
        return a * b;
    }

    public long division(long a, long b) {
        return a / b;
    }

    public long exponentiation(long a, long b) {
        long result = 1;
        for (long i = 1; i <= b; i++) {
            result *= a;
        }
        if (b < 0) {
            return 1 / result;
        }
        return result;
    }

    public long gettingRemainderDivision(long a, long b) {
        return a % b;
    }

    public long calculations(long firstNumber, long secondNumber, char sign) {
        long result = 0;
        switch (sign) {
            case '+':
                result = addition(firstNumber, secondNumber);
                System.out.println(result);
                break;
            case '-':
                result = subtracting(firstNumber, secondNumber);
                System.out.println(result);
                break;
            case '*':
                result = multiplication(firstNumber, secondNumber);
                System.out.println(result);
                break;
            case '/':
                result = division(firstNumber, secondNumber);
                System.out.println(result);
                break;
            case '^':
                result = exponentiation(firstNumber, secondNumber);
                System.out.println(result);
                break;
            case '%':
                result = gettingRemainderDivision(firstNumber, secondNumber);
                System.out.println(result);
                break;
        }
        return result;
    }
}