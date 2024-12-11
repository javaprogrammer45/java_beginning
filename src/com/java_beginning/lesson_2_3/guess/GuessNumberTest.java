package com.java_beginning.lesson_2_3.guess;

import java.util.Scanner;

public class GuessNumberTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter your name: ");
        Player player1 = new Player(sc.nextLine());

        System.out.println("Please enter your name: ");
        Player player2 = new Player(sc.nextLine());

        GuessNumber game = new GuessNumber(player1, player2);

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