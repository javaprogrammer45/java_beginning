package com.java_beginning.lesson_2_3_4.guess;

import java.util.Scanner;

public class GuessNumberTestModified {
    public static void main(String[] args) {
        GuessNumberModified  game = new GuessNumberModified (new PlayerModified("Andrey"), new PlayerModified("Aleksey"));
        Scanner sc = new Scanner(System.in);
        Scanner input = new Scanner(System.in);

        String agreement = "";
        do {
            game.start();

            System.out.println("Do you want to play again? [yes/no]: ");
            do {
                agreement = input.nextLine();
                System.out.println("Do you want to play again? [yes/no]: ");
            } while (!agreement.equals("yes") && !agreement.equals("no"));
        } while (agreement.equals("yes"));
    }
}
