package com.java_beginning.lesson_2_3_4.array;

import java.util.Arrays;

public class Factorial {
    public static void main(String[] args) {
        Factorial factorial = new Factorial();

        int[] zeroArray = new int[0];
        int[] nullArray = null;
        int[] firstArray = {8, 0, 9};
        int[] secondArray = {-3, 1, 7, 13};
        int[] thirdArray = {-22, -0};

        //factorial.printFactorials(factorial.calculateFactorial(zeroArray));
        //factorial.printFactorials(factorial.calculateFactorial(nullArray));
        factorial.printFactorials(factorial.calculateFactorial(firstArray));
//        factorial.printFactorials(factorial.calculateFactorial(secondArray));
//        factorial.printFactorials(factorial.calculateFactorial(thirdArray));
        // factorial.calculateFactorial(firstArray);
    }

    public void printFactorials(int[] array) {
        if (array == null) {
            System.out.println("null");

        } else if (array.length == 0) {
            return;
        } else {
            int result = 1;
            System.out.print(array.length + "!= ");
            for (int i = 0; i < array.length; i++) {
                result *= array[i];
                if (i != array.length - 1) {
                    System.out.print(array[i] + "*");
                } else {
                    System.out.println(array[array.length - 1] + " = " + result);
                }
            }
        }
    }

    public int[] calculateFactorial(int... varargs) {
        if (varargs == null) {
            return null;
        }
        int[] array = varargs;
        int[] arr = new int[varargs.length];
        if (array.length == 0) {
            System.out.println("массив нулевой длины");
        } else {
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] < 0) {
                    System.out.println("Ошибка: факториал " + array[i] + "!  не определен");
                } else if (array[i] == 0 || array[i] == 1) {
                    System.out.println("Факториал 0 и 1 = 1");
                }
                if (array[i] != 0 && array[i] != 1 && array[i] > 0) {
                    int[] newArray = new int[array[i]];
                    for (int j = 0; j < array[i]; j++) {
                        newArray[j] = j + 1;
                    }
                    arr = newArray;
                }
            }
        }

        return arr;

    }
}