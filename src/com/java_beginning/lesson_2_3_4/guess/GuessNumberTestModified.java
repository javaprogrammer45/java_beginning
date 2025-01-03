package com.java_beginning.lesson_2_3_4.guess;

import java.util.Scanner;

public class GuessNumberTestModified {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Игра началась! У каждого игрока по 10 попыток...\nВведите имена игроков...");

        Player player1 = new Player(sc.nextLine());

        System.out.println("" );
        Player player2 = new Player(sc.nextLine());

        GuessNumberModified  game = new GuessNumberModified (player1, player2);

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
