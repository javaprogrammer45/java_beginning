package com.java_beginning.lesson_2_3_4.array;

import java.util.Arrays;

public class UniqueNumbers {
    public static void main(String[] args) {

        UniqueNumbers uniqueNumbers = new UniqueNumbers();

        //uniqueNumbers.sortingArray(uniqueNumbers.fillingArray(-30, -10));
//        uniqueNumbers.printArray(uniqueNumbers.sortingArray(uniqueNumbers.fillingArray(-30, -10)), 23);
    }


    public void printArray(int[] arr, int lengthString) {
        int[] arr2 = new int[lengthString];
        int counter = 0;
        for (int i = 0; i < arr2.length; i++) {
            counter++;
            arr2[i] = arr[i];
            if (arr.length != arr2.length) {
                arr2[i] = counter;

            }
            System.out.print(arr2[i] +" ");
        }
    }

    public int[] fillingArray(int start, int end) {
        int[] array = new int[((end - start) / 4) * 3];
        for (int i = 0; i <= array.length-1; i++) {
            int number = (int) (Math.random() * (end - start + 1)) + start;
            array[i] = number;
        }
        return array;
    }

//    public  sortingArray(int[] arr) {
//        for (int i = 0; i < arr.length-1; i++) {
//            if (arr[i] > arr[i + 1]) {
//                int temp = arr[i];
//                arr[i] = arr[i+1];
//                arr[i+1] = temp;
//            }
//
//        }
//        return arr;
//    }

}