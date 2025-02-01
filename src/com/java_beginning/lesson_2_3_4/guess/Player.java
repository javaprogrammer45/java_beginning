package com.java_beginning.lesson_2_3_4.guess;

import java.util.Arrays;

public class Player {
    private final static int LENGTH_ARRAY = 10;
    private final static int START = 1;
    private final static int END = 100;
    private String name;
    private int[] numbers = new int[LENGTH_ARRAY];
    private int countNumbers = 0;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int[] getNumbers() {
        return Arrays.copyOf(numbers, countNumbers);
    }

    public void setNumber(int number) {
        if (number >= START && number <= END) {
            fillArray(numbers, number);
        } else {
            throw new RuntimeException("Введите корректные данные...Число должно входить в отрезок [1, 10]." +
                    " Попробуйте еще раз: ");
        }
    }

    public void fillArray(int[] numbers, int number) {
        numbers[countNumbers++] = number;
    }
}







