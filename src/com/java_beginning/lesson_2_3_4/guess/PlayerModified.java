package com.java_beginning.lesson_2_3_4.guess;

import java.io.IOException;
import java.util.Arrays;

public class PlayerModified {
    private String name;
    private int number;
    private int[] numbers = new int[10];
    private int index = 0;
    private final static int START = 1;
    private final static int END = 100;

    public PlayerModified(String name) {
        this.name = name;
    }

    public int getIndex() {
        return index;
    }

    public void setNumber(int number) {
        try {
            if (number >= START && number <= END) {
                this.number = number;
            } else {
                throw new Exception();
            }
        } catch (Exception e) {
            System.out.println("Число должно входить в отрезок [1, 100].\n" +
                    "Попробуйте еще раз:" + e.getMessage());
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
        Arrays.fill(numbers, index, index, number);
        index++;
        this.numbers = numbers;
    }
}







