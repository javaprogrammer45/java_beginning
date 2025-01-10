package com.java_beginning.lesson_2_3_4.guess;

import java.io.IOException;
import java.util.Arrays;

public class Player {
    private String name;
    private int number;
    private int[] numbers = new int[10];
    private int index = 0;
    private final static int START = 1;
    private final static int END = 100;

    public Player(String name) {
        this.name = name;
    }

    public void setNumber(int number) throws IOException {

        if (number >= START && number <= END) {
            this.number = number;
        } else {
            throw new IOException();
        }
    }

    public int getNumber() {
        return number;
    }

    public String getName() {
        return name;
    }

    public int[] getNumbers() {
        return numbers;
    }

    public void setNumbers(int[] numbers) {
        this.numbers = numbers;
        Arrays.fill(numbers, index, index+1, number);
        index++;
    }
}







