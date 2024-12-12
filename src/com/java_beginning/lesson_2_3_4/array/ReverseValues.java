package com.java_beginning.lesson_2_3_4.array;

import java.util.Arrays;

public class ReverseValues {
    int[] nullArray;

    public void reverses(int[] values) {
        if (values.length == 0) {
            System.out.println("массив нулевой длины");
            return;
        }
        System.out.print("[");
        for (int i = 0; i < values.length - 1; i++) {
            System.out.print(values[values.length - 1 - i] + ", ");
        }
        System.out.println(values[0] + "]");
    }

    public static void main(String[] args) {
        ReverseValues reverseValues = new ReverseValues();
        int[] zeroArray = new int[0];
        int[] oneArray = {6, 8, 9, 1};

        reverseValues.reverses(zeroArray);

        System.out.println(reverseValues.nullArray);
        System.out.print("До реверса: " + Arrays.toString(oneArray) + "\nПосле реверса: ");
        reverseValues.reverses(oneArray);

        int[] twoArray = {13, 8, 5, 3, 2, 1, 1};
        System.out.print("До реверса: " + Arrays.toString(twoArray) + "\nПосле реверса: ");
        reverseValues.reverses(twoArray);
    }
}
