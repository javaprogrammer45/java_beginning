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
            System.out.println("Ошибка: левая граница " + start + " > " + "правой " + end);
            return null;
        }
        int[] uniqueNumbers;
        if (end - start != 0) {
            int len = (int) ((end - start) * 0.75);
            uniqueNumbers = new int[len];

            Random random = new Random();
            boolean isUnique = true;
            int uniqueNumber;
            for (int i = 0; i < uniqueNumbers.length; i++) {
                do {
                    uniqueNumber = random.nextInt(start, end + 1);
                    for (int j = 0; j < i; j++) {
                        int number = uniqueNumbers[j];
                        if (number != uniqueNumber) {
                            isUnique = true;
                        } else {
                            isUnique = false;
                            break;
                        }
                    }
                } while (!isUnique);
                uniqueNumbers[i] = uniqueNumber;
            }
        } else {
            System.out.println("Ошибка: длина массива должна быть больше 0");
            return null;
        }
        Arrays.sort(uniqueNumbers);
        return uniqueNumbers;
    }

    private void printArray(int[] array, int lineLen) {
        if (lineLen <= 0) {
            System.out.println("Ошибка: количество чисел в строке не может быть меньше 1 (" + lineLen + ")\n");
            return;
        }
        if (array != null && array.length != 0) {
            for (int i = 0; i < array.length - 1; i++) {
                if (i % lineLen == 0 && i != 0) {
                    System.out.println();
                }
                System.out.print(array[i] + ", ");
            }
            System.out.print(array[array.length - 1]);
            if (array.length < lineLen) {
                System.out.print("0, ".repeat(lineLen - array.length - 1));
                System.out.print("0".repeat(1));
            }
            System.out.print("\nКоличество чисел в строке = " + lineLen + "\n\n");
        }
    }
}
