package com.java_beginning.lesson_2_3_4.array;

import java.util.Arrays;

public class CharacterTriangle {
    public static void main(String[] args) {
        CharacterTriangle triangle = new CharacterTriangle();

        triangle.printTriangle(triangle.formTriangle('0', '9', true));
        triangle.printTriangle(triangle.formTriangle('A', 'J', true));
        triangle.printTriangle(triangle.formTriangle('/', '!', true));

    }

    private String[] formTriangle(char start, char end, boolean isAsc) {
        StringBuilder triangle = new StringBuilder();
        String[] elementsTriangle = new String[(end - start) + 1];
        if (isAsc) {
            for (int i = 0; i <= elementsTriangle.length - 1; i++) {
                elementsTriangle[i] = triangle.repeat(end, i + 1).toString();
                if (i >= 1) {
                    elementsTriangle[i] = triangle.repeat(end, i).toString();
                }
                triangle.delete(0, triangle.length()).toString();
                end--;
            }
        } else {
            if (start > end) {
                System.out.println("Ошибка: левая граница (" + start + ") > правой (" + end + ")");
            } else {
                System.out.println("\n\nВведите корректные данные...");
            }
        }
        return elementsTriangle;
    }

    public void printTriangle(String[] elementsTriangle) {
        for (int i = 0; i < elementsTriangle.length; i++) {
            System.out.print(" ".repeat(elementsTriangle.length - i));
            System.out.print(elementsTriangle[i] + "\n");
        }
    }
}