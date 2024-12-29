package com.java_beginning.lesson_2_3_4.array;

import java.util.Arrays;
import java.util.Random;

public class UniqueNumbersFiller {
    public static void main(String[] args) {
        UniqueNumbersFiller un = new UniqueNumbersFiller();

        un.printArray(un.fillArray(-30, -10, 23));
        un.printArray(un.fillArray(10, 50, 10));
        un.printArray(un.fillArray(-34, -34, 0));
        un.printArray(un.fillArray(5, -8, 2));
    }

    private int[] fillArray(int start, int end, int lineLen) {
        if (lineLen <= 0) {
            System.out.println("Ошибка: количество чисел в строке не может быть меньше 1 (" +
                    lineLen + ")");
            return null;
        }
        if (start > end) {
            System.out.println("Ошибка: левая граница " + start + " > " + " правой " + end);
            return null;
        }
        int len = (int) ((end - start) * 0.75);
        int[] uniqueValues = new int[lineLen];

        if ((end - start) == 0) {
            System.out.println("Ошибка: длина массива должна быть больше 0 (" + (end - start) + ")");
            return null;
        }

        Random random = new Random();
        boolean isExist = true;
        int uniqueValue;
        for (int i = 0; i < uniqueValues.length; i++) {
            if (i < len) {
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
            } else {
                uniqueValues[i] = uniqueValues[i - len];
            }
        }
        Arrays.sort(uniqueValues);
        return uniqueValues;
    }

    private void printArray(int[] sortedArray) {
        if (sortedArray == null) {
            return;
        }
        if (sortedArray.length != 0) {
            System.out.println(Arrays.toString(sortedArray) +
                    "  Количество чисел в строке = " + sortedArray.length + "\n");
        }
    }
}
