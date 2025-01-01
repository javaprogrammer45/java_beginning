package com.java_beginning.lesson_2_3_4.array;

import java.util.Arrays;
import java.util.Random;

public class UniqueNumbersFiller {
    public static void main(String[] args) {
        UniqueNumbersFiller un = new UniqueNumbersFiller();

        un.printArray(un.fillArray(-30, -10), 23);
        un.printArray(un.fillArray(10, 50), 10);
        un.printArray(un.fillArray(-34, -34), 0);
        un.printArray(un.fillArray(5, -8), 2);
    }

    private int[] fillArray(int start, int end) {
        if (start > end) {
            System.out.println("Ошибка: левая граница " + start + " > " + " правой " + end);
            return null;
        }
        if ((end - start) == 0) {
            System.out.println("Ошибка: длина массива должна быть больше 0 (" + (0) + ")");
            return null;
        }
        int len = (int) ((end - start) * 0.75);
        int[] uniqueValues = new int[len];

        Random random = new Random();
        boolean isExist = true;
        int uniqueValue;
        for (int i = 0; i < uniqueValues.length; i++) {
            do {
                uniqueValue = random.nextInt(start, end);
                for (int value : uniqueValues) {
                    if (value == uniqueValue) {
                        isExist = false;
                        break;
                    } else {
                        isExist = true;
                    }
                }
            } while (!isExist);
            uniqueValues[i] = uniqueValue;
        }
        Arrays.sort(uniqueValues);
        return uniqueValues;
    }

    private void printArray(int[] array, int lineLen) {
        if (array == null) {
            return;
        }
        if (lineLen <= 0) {
            System.out.println("Ошибка: количество чисел в строке не может быть меньше 1 (" +
                    lineLen + ")");
            return;
        }
        if (array.length != 0) {
            if (array.length < lineLen) {
                System.out.print("[");
                for (int i = 0; i < lineLen; i++) {
                    if (i < array.length) {
                        System.out.print(array[i] + ", ");
                    } else {
                        if (i == lineLen - 1) {
                            System.out.print(0 + "]");
                        } else {
                            System.out.print(0 + ", ");
                        }
                    }
                }
                System.out.print("   Количество чисел в строке = " + lineLen + "\n\n");
            } else if (array.length > lineLen) {
                System.out.print("[");
                int counter = 0;
                for (int j = 0; j < array.length / lineLen; j++) {
                    for (int k = 0; k <= lineLen - 1; k++) {
                        if (k < lineLen - 1) {
                            System.out.print(array[k + counter] + ", ");
                        } else {
                            if (k < (array.length - 1) - (lineLen - 1)) {
                                System.out.print(array[k + counter] + "]");
                                counter += 10;
                            } else {
                                System.out.print(array[k + counter] + "]");
                            }
                        }
                    }
                    System.out.print("   Количество чисел в строке = " + lineLen + "\n\n[");
                }
            }
        }
    }
}

