package com.java_beginning.lesson_2_3.guess;

import java.util.Scanner;

public class GuessNumberTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter your name: ");
        Player player1 = new Player(sc.nextLine());

        System.out.println("Please enter your name: ");
        Player player2 = new Player(sc.nextLine());
        String result;

        GuessNumber guessNumber = new GuessNumber(player1, player2);

        do {
            result = guessNumber.start(player1, player2);
            if (result.equals(player1.getName() + " is Winner ") ||
                    result.equals(player2.getName() + " is Winner ")) {
                System.out.println("Do you want to play again? [yes/no]: ");
                String agreement = sc.nextLine();
                while (!agreement.equals("yes") && !agreement.equals("no")) {
                    System.out.println("Do you want to play again? [yes/no]: ");
                    agreement = sc.nextLine();
                }
                if (agreement.equals("no")) {
                    return;
                }
            }
        } while (!result.equals(player1.getName() + " is Winner ") ||
                !result.equals(player2.getName() + " is Winner "));
    }
}