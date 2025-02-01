package com.java_beginning.lesson_2_3_4.guess;

import java.util.Scanner;

public class GuessNumberTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter name firstGamer...");
        Player player1 = new Player(input.nextLine());

        System.out.println("Enter name secondGamer...");
        Player player2 = new Player(input.nextLine());

        GuessNumber game = new GuessNumber(player1, player2);
        String agreement = "yes";
        do {
            if (agreement.equals("yes")) {
                game.start();

                System.out.print("Do you want to play again? [yes/no]: ");
                agreement = input.nextLine().toLowerCase();
            }

            if (!agreement.equals("yes") && !agreement.equals("no")) {
                System.out.print("Enter correct answer [yes / no]: ");
                agreement = input.nextLine().toLowerCase();
            }
        } while (!agreement.equals("no"));
    }
}
