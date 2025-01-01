package com.java_beginning.lesson_2_3_4.array;

public class SortedCharacters {
    public static void main(String[] args) {
        SortedCharacters triangle = new SortedCharacters();
        triangle.formTriangle('/', '!');
        triangle.formTriangle('0', '9');
        triangle.formTriangle('A', 'J');
    }

    private void formTriangle(char start, char end) {
        boolean isIncrease = ((start == '!' && end == '/') || (start == '0' && end == '9') ||
                (start == 'A' && end == 'Z'));
        if (isIncrease) {
            char[] values = new char[end - start + 2];
            StringBuilder stringBuilder = new StringBuilder();
            int size = end - start;
            for (int i = 1; i <= values.length - 1; i++) {
                System.out.println();
                for (int j = 1; j <= size + 1 - i; j++) {
                    values[i - 1] = ' ';
                    System.out.print(values[i - 1]);
                    if (j == size + 1 - i) {
                        System.out.print(j);
                    }
                    if (i == 1 && j == size + 1 - i) {
                        values[i - 1] = (char) size;
                        System.out.print(values[i - 1]);
                    }
                }
                System.out.print(stringBuilder.repeat(end, i - 1));
                System.out.print(stringBuilder.delete(0, stringBuilder.length()));
                if (i >= 2) {
                    for (int j = size; j < size * 2; ++j) {
                        if (i == values.length - 1) {
                            System.out.print(0);
                        }
                        System.out.print(stringBuilder.repeat(end, i - 1));
                        System.out.print(stringBuilder.delete(0, stringBuilder.length()));
                        break;
                    }
                }
                end--;
            }
        } else {
            if (start > end) {
                System.out.println("Ошибка: левая граница (" + start + ") > правой (" + end + ")");
            } else {
                System.out.println("\n\nВведите корректные данные...");
            }
        }
    }
}




