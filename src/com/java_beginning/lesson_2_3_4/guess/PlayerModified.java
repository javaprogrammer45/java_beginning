package com.java_beginning.lesson_2_3_4.guess;

public class PlayerModified {
    private String name;
    private int number;
    private int[] numbers;

    public PlayerModified(String name) {
        this.name = name;

    }

    public String getName() {
        return name;
    }

    public int getNumber() {
        return number;
    }

    public int[] getNumbers() {
        return numbers;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
