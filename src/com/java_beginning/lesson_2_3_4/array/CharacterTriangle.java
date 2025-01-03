package com.java_beginning.lesson_2_3_4.array;

public class CharacterTriangle {
    public static void main(String[] args) {
        CharacterTriangle triangle = new CharacterTriangle();

        triangle.printTriangle(triangle.formTriangle('0', '9', true));
        triangle.printTriangle(triangle.formTriangle('A', 'J', true));
        triangle.printTriangle(triangle.formTriangle('/', '!', true));
    }

    private StringBuilder formTriangle(char start, char end, boolean isIncrease) {
        StringBuilder triangle = new StringBuilder();
        isIncrease = start < end;
        if (isIncrease) {
            char[] spaces = new char[(end - start) + 2];
            for (int i = 0; i <= spaces.length - 1; i++) {
                spaces[i] = ' ';
            }
            StringBuilder temp = new StringBuilder();
            int size = end - start;
            for (int i = 1; i < size + 2; i++) {
                for (int j = 0; j <= size + 1 - i; j++) {
                    triangle.append(spaces[j]);
                }
                triangle.append(temp.repeat(end, i));
                if (i >= 2) {
                    temp.repeat(end, i);
                    triangle.append(temp.delete(0, i + 1));
                }
                temp.delete(0, temp.length());
                end--;
            }
        } else {
            if (start > end) {
                System.out.println("Ошибка: левая граница (" + start + ") > правой (" + end + ")");
            } else {
                System.out.println("\n\nВведите корректные данные...");
            }
        }
        return triangle;
    }

    public void printTriangle(StringBuilder triangle) {
        for (int i = 1; i <= triangle.length(); i++) {
            if (triangle.charAt(i) == ' ') {
                System.out.print(triangle.charAt(i));
            } else if (triangle.charAt(i) != ' ') {
                do {
                    System.out.print(triangle.charAt(i));
                    i++;
                    if (i == triangle.length()) {
                        break;
                    }
                } while (triangle.charAt(i) != ' ');
                System.out.println();
            }
        }
    }
}


