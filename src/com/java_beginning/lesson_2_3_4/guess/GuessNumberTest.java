package com.java_beginning.lesson_2_3_4.guess;

import java.util.Scanner;

public class GuessNumberTest {
    public static void main(String[] args) {
        GuessNumber game = new GuessNumber(new Player("Andrey"), new Player("Aleksey"));
        Scanner input = new Scanner(System.in);
        String agreement = "";
        do {
            game.start();

            System.out.println("Do you want to play again? [yes/no]: ");
            do {
                agreement = input.nextLine();

            } while (!agreement.equals("yes") && !agreement.equals("no"));
        } while (agreement.equals("yes"));
    }
}
