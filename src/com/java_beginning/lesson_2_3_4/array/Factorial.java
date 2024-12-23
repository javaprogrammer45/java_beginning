package com.java_beginning.lesson_2_3_4.array;

public class Factorial {
    public static void main(String[] args) {
        Factorial factorial = new Factorial();

        int[] zeroArray = new int[0];
        int[] nullArray = null;
        int[] firstArray = {8, 0, 9};
        int[] secondArray = {-3, 1, 7, 13};
        int[] thirdArray = {-22, -0};

        factorial.printFactorials(zeroArray, factorial.calcFactorialsExpr(zeroArray));
        factorial.printFactorials(nullArray, factorial.calcFactorialsExpr(nullArray));
        factorial.printFactorials(firstArray, factorial.calcFactorialsExpr(firstArray));
        factorial.printFactorials(secondArray, factorial.calcFactorialsExpr(secondArray));
        factorial.printFactorials(thirdArray, factorial.calcFactorialsExpr(thirdArray));
    }

    public long[] calcFactorialsExpr(int... array) {
        if (array == null) {
            System.out.println("null");
            return null;
        }
        long[] results = new long[array.length];
        if (array.length != 0) {
            for (int i = 0; i < array.length; i++) {
                long start = 1;
                if (array[i] == 1 || array[i] <= 0) {
                    results[i] = start;
                } else {
                    for (int j = 1; j <= array[i]; j++) {
                        start *= j;
                    }
                    results[i] = start;
                }
            }
        } else {
            System.out.println("массив нулевой длины");
        }
        return results;
    }

    public void printFactorials(int[] originalArray, long[] factorials) {
        if (originalArray != null && factorials != null && factorials.length > 0) {
            for (int i = 0; i < originalArray.length; i++) {
                int k = originalArray[i];
                if (k == 1 || k == 0) {
                    System.out.println(k + "! = 1");
                    continue;
                } else if (k < 0) {
                    System.out.println("Ошибка: факториал " + k + "! не определен");
                    continue;
                }
                System.out.print(k + "! = ");
                for (int j = 1; j <= k; j++) {
                    if (j != k) {
                        System.out.print(j + " * ");
                    } else {
                        System.out.print(j + " = " + factorials[i] + "\n");
                    }
                }
            }
        }
    }
}