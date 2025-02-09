package com.java_beginning.lesson_2_3_4.hangman;

import java.util.Scanner;

public class HangmanGameMain {
    public static void main(String[] args) {
        HangmanGame game = new HangmanGame();
        Scanner scanner = new Scanner(System.in);
        String agreement = "yes";
        do {
            if (agreement.equals("yes")) {
                game.start();

                System.out.print("Do you want to play again? [yes/no]: ");
                agreement = scanner.nextLine().toLowerCase();
            }

            if (!agreement.equals("yes") && !agreement.equals("no")) {
                System.out.print("Enter correct answer [yes / no]: ");
                agreement = scanner.nextLine().toLowerCase();
            }
        } while (!agreement.equals("no"));
    }
}