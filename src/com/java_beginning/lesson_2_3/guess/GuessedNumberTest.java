package com.java_beginning.lesson_2_3.guess;

import java.util.Scanner;

public class GuessedNumberTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter your name: ");
        Player player1 = new Player(sc.nextLine());

        System.out.println("Please enter your name: ");
        Player player2 = new Player(sc.nextLine());

        GuessedNumber game = new GuessedNumber(player1, player2);

        String agreement = "";
        do {
            game.start();
            System.out.println("Do you want to play again? [yes/no]: ");
            Scanner input = new Scanner(System.in);
            agreement = input.nextLine();
            while (!agreement.equals("yes") && !agreement.equals("no")) {
                System.out.println("Do you want to play again? [yes/no]: ");
                agreement = input.nextLine();
            }
        } while (agreement.equals("yes"));
    }
}