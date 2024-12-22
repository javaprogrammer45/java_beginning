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

        factorial.printFactorialsExpr(factorial.calcFactorials(zeroArray));
        factorial.printFactorialsExpr(factorial.calcFactorials(nullArray));
        factorial.printFactorialsExpr(factorial.calcFactorials(firstArray));
        factorial.printFactorialsExpr(factorial.calcFactorials(secondArray));
        factorial.printFactorialsExpr(factorial.calcFactorials(thirdArray));
    }

    public int[] calcFactorials(int... array) {
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

    public void printFactorialsExpr(int[] array) {
        BigInteger bigInteger1 = BigInteger.valueOf(1);
        if (array != null) {
            long result = 1;
            for (int i = 0; i < array.length; i++) {
                if (array[i] != 0) {
                    if (array[i] == 1) {
                        result = 1;
                        System.out.print(array[i] + "!= " + result + "\n");
                        continue;
                    }
//                    if (array[i] >= 13) {
//                       // BigInteger bigInteger2 = BigInteger.valueOf(array[i]);
//                    }
                    System.out.print(array[i] + "!= ");
                    for (int j = 1; j <= array[i]; j++) {
                        if (array[i] < 13) {
                            result *= j;
                        } else {
                            BigInteger bigInteger3 = BigInteger.valueOf(j);
                            bigInteger1 = bigInteger1.multiply(bigInteger3);
                            result = bigInteger1.longValue();
                        }
                        if (j != array[i]) {
                            System.out.print(j + " * ");
                        } else {
                            System.out.print(array[i] + " = " + result + "\n");
                        }
                    }
                }
            }
        }
    }
}
