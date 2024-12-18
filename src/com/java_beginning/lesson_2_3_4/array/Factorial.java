package com.java_beginning.lesson_2_3_4.array;

public class Factorial {
    public static void main(String[] args) {
        Factorial factorial = new Factorial();

        int[] zeroArray = new int[0];
        int[] nullArray = null;
        int[] firstArray = {8, 0, 9};
        int[] secondArray = {-3, 1, 7, 13};
        int[] thirdArray = {-22, -0};

        factorial.printFactorials(factorial.calculateFactorial(zeroArray));
        factorial.printFactorials(factorial.calculateFactorial(nullArray));
        factorial.printFactorials(factorial.calculateFactorial(firstArray));
        factorial.printFactorials(factorial.calculateFactorial(secondArray));
        factorial.printFactorials(factorial.calculateFactorial(thirdArray));
    }

    public int[] calculateFactorial(int... varargs) {
        if (varargs == null) {
            return null;
        }
        int[] array = varargs;
        int[] arr = new int[varargs.length];
        if (array.length == 0) {
            System.out.println("массив нулевой длины");
        }
        int len = 0;
        for (int num : array) {
            if (num != 0 && num != 1 && num > 0) {
                arr[len++] = num;
            }
        }
        return arr;
    }

    public void printFactorials(int[] array) {
        if (array == null) {
            System.out.println("null");
        } else {
            int result = 1;
            for (int i = 0; i < array.length; i++) {
                if (array[i] == 0) {
                    return;
                }
                System.out.print(array[i] + "!= ");
                for (int j = 1; j <= array[i]; j++) {
                    result *= j;
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