package com.java_beginning.lesson_2_3_4.array;

import java.util.Arrays;

public class UniqueNumbers {
    public static void main(String[] args) {
        UniqueNumbers uniqueNumbers = new UniqueNumbers();

        uniqueNumbers.printArray(uniqueNumbers.sortArray(uniqueNumbers.fillingArray(-30, -10, 23)));
        uniqueNumbers.printArray(uniqueNumbers.sortArray(uniqueNumbers.fillingArray(10, 50, 10)));
        uniqueNumbers.printArray(uniqueNumbers.sortArray(uniqueNumbers.fillingArray(-34, -34, 0)));
        uniqueNumbers.printArray(uniqueNumbers.sortArray(uniqueNumbers.fillingArray(-1, 2, -3)));
        uniqueNumbers.printArray(uniqueNumbers.sortArray(uniqueNumbers.fillingArray(5, -8, 2)));
    }

    public int[] fillingArray(int start, int end, int lengthString) {
        if (lengthString <= 0 || lengthString == 0) {
            System.out.println("Ошибка: количество чисел в строке не может быть меньше 1 (" +
                    lengthString + ")");
            return null;
        }
        if (start > end) {
            System.out.println("Ошибка: левая граница " + start + " > " + " правой " + end);
            return null;
        }
        int[] array = new int[((end - start) / 4) * 3];
        int[] array1 = new int[lengthString];

        if ((end - start) != 0) {
            for (int i = 0; i <= array1.length - 1; i++) {
                if (array.length != ((end - start) / 4) * 3) {
                    int number = (int) (Math.random() * (end - start + 1)) + start;
                    array1[i] = number;
                } else {
                    int number = (int) (Math.random() * (end - start + 1)) + start;
                    array1[i] = number;
                }
            }
        } else {
            System.out.println("Ошибка: длина массива должна быть больше 0 (" + (end - start) + ")");
            return null;
        }
        return array1;
    }

    public int[] sortArray(int[] arr) {
        if (arr != null) {
            for (int i = 0; i < arr.length - 1; i++) {
                for (int j = 0; j < arr.length - 1 - i; j++) {
                    if (arr[j] > arr[j + 1]) {
                        int temp = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = temp;
                    }
                }
            }
        } else {
            return new int[0];
        }

        return arr;
    }

    private void printArray(int[] arr) {
        if (arr.length != 0) {
            System.out.println(Arrays.toString(arr) + "\n");
        }
    }
}