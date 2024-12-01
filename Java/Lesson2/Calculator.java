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
            for (long i = 1; i <= b * (-1); i++) {
                result *= a;
            }
            return 1 / result;
        }
        return result;
    }

    public long gettingRemainderDivision(long a, long b) {
        return a % b;
    }
}