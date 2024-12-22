package com.java_beginning.lesson_2_3_4.array;

import java.math.BigInteger;

public class Factorial {
    public static void main(String[] args) {
        Factorial factorial = new Factorial();

        int[] zeroArray = new int[0];
        int[] nullArray = null;
        int[] firstArray = {8, 0, 9};
        int[] secondArray = {-3, 1, 7, 13};
        int[] thirdArray = {-22, -0};

        factorial.calcFactorials(factorial.checkArray(zeroArray));
        factorial.calcFactorials(factorial.checkArray(nullArray));
        factorial.calcFactorials(factorial.checkArray(firstArray));
        factorial.calcFactorials(factorial.checkArray(secondArray));
        factorial.calcFactorials(factorial.checkArray(thirdArray));
    }

    public int[] checkArray(int... array) {
        if (array == null) {
            System.out.println("null");
            return null;
        }
        int[] newArray = new int[array.length];
        if (array.length == 0) {
            System.out.println("массив нулевой длины");
        }
        int index = 0;
        for (int num : array) {
            if (num > 0) {
                newArray[index++] = num;
            } else if (num < 0) {
                System.out.println("Ошибка: факториал " + num + "! не определен");
            } else {
                System.out.println("0! = 1");
            }
        }
        return newArray;
    }

    public void calcFactorials(int[] array) {
        BigInteger number1 = BigInteger.valueOf(1);
        if (array != null) {
            for (int j : array) {
                if (j != 0) {
                    if (j == 1) {
                        int result = 1;
                        System.out.print(j + "!= " + result + "\n");
                        continue;
                    }
                    System.out.print(j + "!= ");
                    printFactorialsExpr(j, number1);
                }
            }
        }
    }

    public void printFactorialsExpr(int element, BigInteger number1) {
        long result = 1;

        for (int j = 1; j <= element; j++) {
            if (element < 13) {
                result *= j;
            } else {
                BigInteger number_j = BigInteger.valueOf(j);
                number1 = number1.multiply(number_j);
                result = number1.longValue();
            }
            if (j != element) {
                System.out.print(j + " * ");
            } else {
                System.out.print(element + " = " + result + "\n");
            }
        }
    }
}
