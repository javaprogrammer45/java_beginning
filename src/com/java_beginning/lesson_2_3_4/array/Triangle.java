package com.java_beginning.lesson_2_3_4.array;

public class Triangle {
    private final int startChars = 33;
    private final int endChars = 47;
    private final int startNumbers = 48;
    private final int endNumbers = 57;
    private final int startUppercaseLetters = 65;
    private final int endUppercaseLetters = 90;

    public Triangle() {
    }

    public int getEndChars() {
        return endChars;
    }

    public int getEndNumbers() {
        return endNumbers;
    }

    public int getEndUppercaseLetters() {
        return endUppercaseLetters;
    }
    
    public static void main(String[] args) {
        Triangle triangle = new Triangle();
        triangle.displayTriangle(50,46);
    }

    public void displayTriangle(int start, int end) {
        StringBuilder stringBuilder = new StringBuilder();
        boolean direction = (start < end && end == getEndChars() || end == getEndNumbers() || end == getEndUppercaseLetters());
        if (direction) {
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
        } else if (!direction) {
            if (start > end) {
                System.out.println("Ошибка: левая граница " + start + " > правой " + end);
            } else {
                System.out.println("Введите корректные данные...");
            }

        }

    }
}




