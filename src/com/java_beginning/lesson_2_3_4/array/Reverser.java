package com.java_beginning.lesson_2_3_4.array;

import java.util.Arrays;

public class Reverser {
    public static void main(String[] args) {
        Reverser reverser = new Reverser();
        int[] zeroArray = new int[0];
        int[] nullArray = null;
        int[] oneArray = {6, 8, 9, 1};
        int[] twoArray = {13, 8, 5, 3, 2, 1, 1};

        reverser.printResult(zeroArray, reverser.reverse(zeroArray));
        reverser.printResult(nullArray, reverser.reverse(nullArray));
        reverser.printResult(oneArray, reverser.reverse(oneArray));
        reverser.printResult(twoArray, reverser.reverse(twoArray));

    }

    public void printResult(int[] arr1, int[] arr2) {
        if (arr1 == null || arr2 == null) {
            return;
        } else if (arr1.length == 0 || arr2.length == 0) {
            return;
        } else {
            System.out.print("\nДо реверса: " + Arrays.toString(arr1) + "\nПосле реверса: " + Arrays.toString(arr2) + "\n");
        }
    }

    private int[] reverse(int[] values) {
        if (values == null) {
            System.out.println("null");
            return null;
        } else if (values.length == 0) {
            System.out.println("массив нулевой длины");
        }
        int[] newValues = new int[values.length];
        for (int i = 0; i <= values.length - 1; i++) {
            newValues[i] = values[values.length - 1 - i];
        }
        return newValues;
    }
}
