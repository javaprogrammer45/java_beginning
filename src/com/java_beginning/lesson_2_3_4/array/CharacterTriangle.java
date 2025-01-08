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
            System.out.println("Ошибка: левая граница (" + start + ") > правой (" + end + ")");
            return null;
        }
        if (end - start == 0) {
            System.out.println("Ошибка: длина массива не должна равняться 0");
            return null;
        }
        char[] elementsTriangle = new char[(end - start) + 1];

        for (int i = 0; i < elementsTriangle.length; i++) {
            if (!isAsc) {
                elementsTriangle[i] = end--;
            } else {
                elementsTriangle[i] = start++;
            }
        }
        StringBuilder triangle = new StringBuilder();
        for (int i = 0; i <= elementsTriangle.length - 1; i++) {
            triangle.repeat(elementsTriangle[i], i + 1);
            if (i >= 1) {
                triangle.repeat(elementsTriangle[i], i);
            }
            triangle.deleteCharAt(triangle.length() - 1);
            triangle.append(elementsTriangle[i]);
            triangle.append(" ");
        }
        return triangle;
    }

    public void printTriangle(StringBuilder triangle) {
        if (triangle == null) {
            return;
        }
        String[] strings = triangle.toString().split(" ");
        for (int i = 0; i < strings.length; i++) {
            System.out.print(" ".repeat(strings.length -i-1));
            System.out.print(strings[i] +"\n");
        }
    }
}
