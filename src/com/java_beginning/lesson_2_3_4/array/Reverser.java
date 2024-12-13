package com.java_beginning.lesson_2_3_4.array;

import java.util.Arrays;

public class Reverser {
    public static void main(String[] args) {
        Reverser reverser = new Reverser();
        int[] nullArray = null;
        int[] zeroArray = new int[0];
        int[] oneArray = {6, 8, 9, 1};
        int[] twoArray = {13, 8, 5, 3, 2, 1, 1};

        reverser.outputtingArrayValues(zeroArray);
        reverser.outputtingArrayValues(nullArray);
        reverser.outputtingArrayValues(oneArray);
        reverser.outputtingArrayValues(twoArray);
    }

    public void outputtingArrayValues(int[] arr) {
        if (arr == null) {
            System.out.println("null");
        } else if (arr.length == 0) {
            System.out.println("массив нулевой длины");
        } else {
            System.out.print("До реверса: " + Arrays.toString(arr) + "\nПосле реверса: ");
            reverse(arr);
        }
    }

    private void reverse(int[] values) {
        System.out.print("[");
        for (int i = 0; i < values.length - 1; i++) {
            System.out.print(values[values.length - 1 - i] + ", ");
        }
        System.out.println(values[0] + "]");
    }
}
