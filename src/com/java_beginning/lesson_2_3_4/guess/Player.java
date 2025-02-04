package com.java_beginning.lesson_2_3_4.guess;

import java.util.Arrays;

public class Player {
    private final static int QUANTITY_ELEMENTS = 10;
    private final static int START = 1;
    private final static int END = 100;
    private String name;
    private int[] numbers = new int[QUANTITY_ELEMENTS];
    private int countAttempts;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getCountAttempts() {
        return countAttempts;
    }

    public int[] getNumbers() {
        return Arrays.copyOf(numbers, countAttempts);
    }

    public void addNumber(int number) {
        if (number < START || number > END) {
            throw new RuntimeException("Введите корректные данные...Число должно входить в отрезок [1, 100]");
        }
        numbers[countAttempts++] = number;
    }

    public int extractNumberArray(int[] array) {
        return array[countAttempts - 1];
    }
}







