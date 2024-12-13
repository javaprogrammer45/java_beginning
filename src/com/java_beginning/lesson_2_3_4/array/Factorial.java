package com.java_beginning.lesson_2_3_4.array;

public class Factorial {
    public static void main(String[] args) {
        Factorial factorial = new Factorial();

        int[] zeroArray = new int[0];
        int[] firstArray = {8, 0, 9};
        int[] secondArray = {-3, 1, 7, 13};
        int[] thirdArray = {-22, -0};

        factorial.calculateFactorial(zeroArray);
        factorial.calculateFactorial(firstArray);
        factorial.calculateFactorial(secondArray);
        factorial.calculateFactorial(thirdArray);
    }

    public void calculateFactorial(int... varargs) {
        int[] newArray;
        if (varargs.length == 0) {
            System.out.println("массив нулевой длины");
            return;
        }

        for (int i = 0; i < varargs.length; i++) {
            int result = 1;
            if (varargs[i] < 0) {
                System.out.println("Ошибка: факториал " + varargs[i] + "!  не определен");
                result = varargs[i];
                System.out.println(result);
            } else if (varargs[i] == 0 || varargs[i] == 1) {
                System.out.println(result);
            } else {
                System.out.print(varargs[i] + " = ");
                for (int j = 1; j <= varargs[i]; j++) {
                    result *= j;
                    System.out.print((j != varargs[i]) ? j + " * " : "");
                }
                System.out.print(varargs[i] + "\n");
            }
            varargs[i] = result;
        }
        newArray = varargs;
    }
}
