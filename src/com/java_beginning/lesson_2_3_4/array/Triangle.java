package com.java_beginning.lesson_2_3_4.array;

public class Triangle {
    public static void main(String[] args) {
        Triangle triangle = new Triangle();
        triangle.printTriangle(48,57);
    }

    public void printTriangle(int start, int end) {
        StringBuilder stringBuilder = new StringBuilder();
        boolean isIncrease = (start < end);
        if (isIncrease) {
            int size = end - start;
            for (int i = 1; i <= size + 1; i++) {
                for (int j = 1; j <= size + 1 - i; j++) {
                    System.out.print(" ");
                }
                System.out.print(stringBuilder.repeat(end, i));
                stringBuilder.delete(0, stringBuilder.length());
                if (i >= 2) {
                    for (int j = size; j < size * 2; j++) {
                        System.out.print(stringBuilder.repeat(end, i));
                        stringBuilder.delete(0, stringBuilder.length());
                        break;
                    }
                }
                end--;
                System.out.println();
            }
        } else if (!isIncrease) {
            if (start > end) {
                System.out.println("Ошибка: левая граница " + start + " > правой " + end);
            } else {
                System.out.println("Введите корректные данные...");
            }

        }

    }
}




