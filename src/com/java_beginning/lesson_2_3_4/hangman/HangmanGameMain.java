package com.java_beginning.lesson_2_3_4.hangman;

import java.util.Scanner;

public class HangmanGameMain {
    public static void main(String[] args) {
        HangmanGame game = new HangmanGame();
        Scanner scanner = new Scanner(System.in);
        String input;
        do {
            game.start();
            System.out.print("Вы хотите продолжить? yes/no: ");
            input = scanner.nextLine().toLowerCase();
        } while (input.equals("yes"));
    }
}