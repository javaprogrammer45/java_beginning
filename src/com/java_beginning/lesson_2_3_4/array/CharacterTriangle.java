package com.java_beginning.lesson_2_3_4.array;

public class CharacterTriangle {
    public static void main(String[] args) {
        CharacterTriangle triangle = new CharacterTriangle();

        triangle.printTriangle(triangle.formTriangle('0', '9', false));
        triangle.printTriangle(triangle.formTriangle('A', 'J', false));
        triangle.printTriangle(triangle.formTriangle('/', '!', false));
    }

    private String[] formTriangle(char start, char end, boolean isAsc) {
        StringBuilder triangle = new StringBuilder();
        String[] elementsTriangle = new String[0];
        if (start > end) {
            System.out.println("Ошибка: левая граница (" + start + ") > правой (" + end + ")");
        } else if (end - start > 0) {
            if (!isAsc) {
                elementsTriangle = new String[(end - start) + 1];
                for (int i = 0; i <= elementsTriangle.length - 1; i++) {
                    elementsTriangle[i] = triangle.repeat(end, i + 1).toString();
                    if (i >= 1) {
                        elementsTriangle[i] = triangle.repeat(end, i).toString();
                    }
                    triangle.delete(0, triangle.length());
                    end--;
                }
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