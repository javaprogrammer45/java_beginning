package com.java_beginning.lesson_2_3_4.hangman;

import java.util.Scanner;

public class HangmanGameMain {
    public static void main(String[] args) {
        HangmanGame hangmanGame = new HangmanGame();
        Scanner scanner = new Scanner(System.in);
        do {
            hangmanGame.start(hangmanGame.getWords());
            System.out.println("Вы хотите продолжить? yes/no");

            String input = scanner.nextLine().toLowerCase();
            if (!input.equals("yes") && !input.equals("no")) {
                System.out.println("Вы хотите продолжить? yes/no");
                break;
            } else if (input.equals("yes")) {
                hangmanGame.start(hangmanGame.getWords());
            } else {
                return;
            }
        } while (true);
    }
}