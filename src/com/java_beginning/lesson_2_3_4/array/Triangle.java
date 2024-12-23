package com.java_beginning.lesson_2_3_4.array;

public class Triangle {
    public static void main(String[] args) {
        Triangle triangle = new Triangle();
        triangle.printTriangle(triangle.formTriangle(48, 57));
    }

    public StringBuilder[] formTriangle(int start, int end) {
        StringBuilder stringBuilder = new StringBuilder();
        StringBuilder[] stringBuilders = new StringBuilder[end - start + 2];
        for (int i = 0; i < stringBuilders.length; i++) {
            stringBuilders[i] = new StringBuilder();
        }
        boolean isIncrease = ((start == 33 && end == 47) || (start == 48 && end == 57) ||
                (start == 65 && end == 90));
        if (isIncrease) {
            int size = end - start;
            for (int i = 1; i <= stringBuilders.length - 1; i++) {
                for (int j = 1; j <= size + 1 - i; j++) {
                    stringBuilders[i - 1].append(" ");
                    if (i == 1 && j == size + 1 - i) {
                        stringBuilders[i - 1].append(size);
                    }
                }
                stringBuilders[i - 1].append(stringBuilder.repeat(end, i - 1));
                stringBuilders[i - 1].append(stringBuilder.delete(0, stringBuilder.length()));
                if (i >= 2) {
                    for (int j = size; j < size * 2; ++j) {
                        stringBuilders[i - 1].append(stringBuilder.repeat(end, i));
                        stringBuilders[i - 1].append(stringBuilder.delete(0, stringBuilder.length()));
                        break;
                    }
                }
                end--;
            }
        } else {
            if (start > end) {
                System.out.println("Ошибка: левая граница " + start + " > правой " + end);
            } else {
                System.out.println("Введите корректные данные...");
            }
        }
        return stringBuilders;
    }

    public void printTriangle(StringBuilder... stringBuilders) {
        for (StringBuilder stringBuilder : stringBuilders) {
            System.out.println(stringBuilder);
        }
    }
}




