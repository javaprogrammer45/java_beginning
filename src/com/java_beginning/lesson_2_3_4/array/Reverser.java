package com.java_beginning.lesson_2_3_4.array;

import java.util.Arrays;

public class Reverser {
    public static void main(String[] args) {
        Reverser reverser = new Reverser();
        int[] zeroArray = new int[0];
        int[] nullArray = null;
        int[] oneArray = {6, 8, 9, 1};
        int[] twoArray = {13, 8, 5, 3, 2, 1, 1};

        reverser.printReversedArrays(zeroArray, reverser.reverse(zeroArray));
        reverser.printReversedArrays(nullArray, reverser.reverse(nullArray));
        reverser.printReversedArrays(oneArray, reverser.reverse(oneArray));
        reverser.printReversedArrays(twoArray, reverser.reverse(twoArray));
    }

    private int[] reverse(int[] values) {
        if (values == null) {
            System.out.println("null");
            return null;
        } else if (values.length == 0) {
            System.out.println("массив нулевой длины");
        }
        int[] reversedValues = new int[values.length];
        int index = 0;
        for (int number : values) {
            reversedValues[reversedValues.length - 1 - index++] = number;
        }
        return reversedValues;
    }

    public void printReversedArrays(int[] arr1, int[] arr2) {
        if (arr1 == null || arr2 == null || arr1.length == 0 || arr2.length == 0) {
            return;
        }
        System.out.print("\nДо реверса: " + Arrays.toString(arr1) +
                "\nПосле реверса: " + Arrays.toString(arr2) + "\n");
    }
}
