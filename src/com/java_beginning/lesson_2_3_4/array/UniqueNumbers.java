package com.java_beginning.lesson_2_3_4.array;

import java.util.Arrays;

public class UniqueNumbers {
    public static void main(String[] args) {
        UniqueNumbers un = new UniqueNumbers();

        un.printArray(un.sortArray(un.fillArray(-30, -10, 23)));
        un.printArray(un.sortArray(un.fillArray(10, 50, 10)));
        un.printArray(un.sortArray(un.fillArray(-34, -34, 0)));
        un.printArray(un.sortArray(un.fillArray(-1, 2, -3)));
        un.printArray(un.sortArray(un.fillArray(5, -8, 2)));
    }

    private int[] fillArray(int start, int end, int length) {
        if (length <= 0 || length == 0) {
            System.out.println("Ошибка: количество чисел в строке не может быть меньше 1 (" +
                    length + ")");
            return null;
        }
        if (start > end) {
            System.out.println("Ошибка: левая граница " + start + " > " + " правой " + end);
            return null;
        }
        int lenUnsortedArray = (int) ((end - start) * 0.75);
        int[] unsortedArray = new int[length];

        if ((end - start) != 0) {
            for (int i = 0; i < unsortedArray.length; i++) {
                if (i < lenUnsortedArray) {
                    int number = (int) (Math.random() * (end - start + 1)) + start;
                    unsortedArray[i] = number;
                } else {
                    unsortedArray[i] = unsortedArray[i - lenUnsortedArray];
                }
            }
        } else {
            System.out.println("Ошибка: длина массива должна быть больше 0 (" + (end - start) + ")");
            return null;
        }
        return unsortedArray;
    }

    private int[] sortArray(int[] unsortedArray) {
        if (unsortedArray != null) {
            for (int i = 0; i < unsortedArray.length - 1; i++) {
                for (int j = 0; j < unsortedArray.length - 1 - i; j++) {
                    if (unsortedArray[j] > unsortedArray[j + 1]) {
                        int temp = unsortedArray[j];
                        unsortedArray[j] = unsortedArray[j + 1];
                        unsortedArray[j + 1] = temp;
                    }
                }
            }
        } else {
            return new int[0];
        }

        return unsortedArray;
    }

    private void printArray(int[] sortedArray) {
        if (sortedArray.length != 0) {

            System.out.println(Arrays.toString(sortedArray) +
                    "  Колличество чисел в строке = " + sortedArray.length + "\n");
        }
    }
}