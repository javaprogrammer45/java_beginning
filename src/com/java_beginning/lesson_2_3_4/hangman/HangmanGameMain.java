package com.java_beginning.lesson_2_3_4.hangman;

import java.util.Scanner;

public class HangmanGameMain {
    public static void main(String[] args) {
        HangmanGame hangmanGame = new HangmanGame();
        Scanner scanner = new Scanner(System.in);
        String input = "yes";
        do {
            if (input.equals("yes")) {
                hangmanGame.start(hangmanGame.getWords());
                System.out.print("Вы хотите продолжить? yes/no: ");
                input = scanner.nextLine().toLowerCase();
            }
            if (!input.equals("yes") && !input.equals("no")) {
                System.out.print("Вы хотите продолжить? yes/no: ");
                input = scanner.nextLine().toLowerCase();
            }
        } while (!input.equals("no"));
    }
}