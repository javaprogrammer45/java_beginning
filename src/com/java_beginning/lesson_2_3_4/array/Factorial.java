package com.java_beginning.lesson_2_3_4.array;

public class Factorial {
    public static void main(String[] args) {
        Factorial factorial = new Factorial();

        int[] zeroArray = new int[0];
        int[] nullArray = null;
        int[] firstArray = {8, 0, 9};
        int[] secondArray = {-3, 1, 7, 13};
        int[] thirdArray = {-22, -0};

        factorial.printFactorialsExpr(zeroArray, factorial.calcFactorials(zeroArray));
        factorial.printFactorialsExpr(nullArray, factorial.calcFactorials(nullArray));
        factorial.printFactorialsExpr(firstArray, factorial.calcFactorials(firstArray));
        factorial.printFactorialsExpr(secondArray, factorial.calcFactorials(secondArray));
        factorial.printFactorialsExpr(thirdArray, factorial.calcFactorials(thirdArray));
    }

    private long[] calcFactorials(int... array) {
        if (array == null) {
            System.out.println("null");
            return null;
        }
        long[] factorials = null;
        if (array.length != 0) {
            factorials = new long[array.length];
            for (int i = 0; i < array.length; i++) {
                long start = 1;
                if (array[i] == 1 || array[i] == 0) {
                    factorials[i] = start;
                } else if (array[i] < 0) {
                    factorials[i] = start;
                } else {
                    for (int j = 1; j <= array[i]; j++) {
                        start *= j;
                    }
                    factorials[i] = start;
                }
            }
        } else {
            System.out.println("массив нулевой длины");
        }
        return factorials;
    }

    private void printFactorialsExpr(int[] originalArray, long[] factorials) {
        if (factorials != null && factorials.length > 0) {
            for (int i = 0; i < originalArray.length; i++) {
                int value = originalArray[i];
                if (value == 1 || value == 0) {
                    System.out.println(value + "! = 1");
                    continue;
                }
                if (value < 0) {
                    System.out.println("Ошибка: факториал " + value + "! не определен");
                    continue;
                }
                System.out.print(value + "! = ");
                for (int j = 1; j <= value; j++) {
                    if (j != value) {
                        System.out.print(j + " * ");
                    } else {
                        System.out.println(j + " = " + factorials[i]);
                    }
                }
            }
        }
    }
}