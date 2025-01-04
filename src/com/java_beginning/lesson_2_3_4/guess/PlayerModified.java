package com.java_beginning.lesson_2_3_4.guess;

import java.io.IOException;
import java.util.Arrays;

public class PlayerModified {
    private String name;
    private int number;
    private int[] numbers = new int[10];
    private int index = 0;

    public PlayerModified(String name) {
        this.name = name;
    }

    public void setNumber(int number){
        try {
            if (number >= 1 && number <= 100) {
                this.number = number;
            }else {throw new Exception();}
        } catch (Exception e) {
            System.out.println("Число должно входить в отрезок [1, 100].\n" +
                    "Попробуйте еще раз:" +e.getMessage());
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
        this.numbers=numbers;
        Arrays.fill(numbers, index, index + 1, number);
        index++;
    }
}
