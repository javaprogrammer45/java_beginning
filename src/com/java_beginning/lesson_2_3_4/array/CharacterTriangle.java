package com.java_beginning.lesson_2_3_4.array;

public class CharacterTriangle {
    public static void main(String[] args) {
        CharacterTriangle triangle = new CharacterTriangle();

        triangle.printTriangle(triangle.formTriangle('0', '9', false));
        triangle.printTriangle(triangle.formTriangle('A', 'J', false));
        triangle.printTriangle(triangle.formTriangle('/', '!', false));
    }

    private StringBuilder formTriangle(char start, char end, boolean isAsc) {
        if (start > end) {
            System.out.println("\nОшибка: левая граница (" + start + ") > правой (" + end + ")");
            return null;
        }
        if (end - start == 0) {
            System.out.println("Ошибка: длина массива не должна равняться 0");
            return null;
        }
        char[] sortedChars = new char[(end - start) + 1];
        int len = sortedChars.length;
        for (int i = 0; i < len; i++) {
            sortedChars[i] = (!isAsc) ? end-- : start++;
        }

        StringBuilder triangle = new StringBuilder();
        for (int i = 0; i < len; i++) {
            triangle.append(" ".repeat(len - i));
            triangle.repeat(sortedChars[i], i);
            if (i >= 1) {
                triangle.repeat(sortedChars[i], i);
            }
            triangle.append(sortedChars[i]);
        }
        return triangle;
    }

    private void printTriangle(StringBuilder triangle) {
        if (triangle == null) {
            return;
        }
        for (int i = 0; i < triangle.length(); i++) {
            if (triangle.charAt(i) == ' ') {
                System.out.print(triangle.charAt(i));
            } else {
                System.out.print(triangle.charAt(i));
                if (i != triangle.length() - 1) {
                    if (triangle.charAt(i) != triangle.charAt(i + 1)) {
                        System.out.println();
                    }
                }
            }
        }
        System.out.println();
    }
}

