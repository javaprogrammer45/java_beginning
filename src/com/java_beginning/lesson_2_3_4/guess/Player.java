package com.java_beginning.lesson_2_3_4.guess;

import java.util.Arrays;
import java.util.InputMismatchException;

public class Player {
    public final static int ATTEMPTS = 10;
    public final static int START = 1;
    public final static int END = 100;
    private String name;
    private int[] numbers = new int[ATTEMPTS];
    private int attemptsCount;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getAttemptsCount() {
        return attemptsCount + 1;
    }

    public int getCurrNumber() {
        return numbers[attemptsCount-1];
    }

    public int[] getNumbers() {
        return Arrays.copyOf(numbers, attemptsCount);
    }

    public void setAttemptsCount(int attemptsCount) {
        this.attemptsCount = attemptsCount - 1;
    }

    public void addNumber(int number) {
        if (number < START || number > END) {
            throw new RuntimeException("Введите корректные данные...Число должно входить" +
                    "в отрезок [" + START + "," + END + "]");
        }
        numbers[attemptsCount++] = number;
    }
}







