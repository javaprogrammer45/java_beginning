package com.java_beginning.lesson_2_3.guess;

import java.util.Scanner;

public class GuessNumber {
    private Player player1;
    private Player player2;

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void enterNumbers(Player player1, Player player2) {
        int targetNum;
        do {
            targetNum = (int) (Math.random() * 100) + 1;
            Scanner input = new Scanner(System.in);
            System.out.println("Please enter your name: ");
            player1 = new Player(input.nextLine());
            System.out.println("Please enter your number: ");
            player1.setNumber(input.nextInt());
            String string = input.nextLine();

            String answer = guessNumberPlayer(player1, targetNum) != 0 ? "Не угадал, " +
                    player1.getNumber() + " не равно " + targetNum +
                    ", переход хода к другому игроку..." : player1.getName() + " is Winner ";
            if (answer.equals(player1.getName() + " is Winner ")) {
                System.out.println(answer);
                System.out.println("Do you want to play again? [yes/no]: ");
                Scanner sc = new Scanner(System.in);
                String agreement = sc.nextLine();
                if (agreement.equals("yes")) {
                    continue;
                } else if (agreement.equals("no")) {
                    return;
                } else {
                    while (!agreement.equals("yes") && !agreement.equals("no")) {
                        System.out.println("Do you want to play again? [yes/no]: ");
                        agreement = sc.nextLine();
                    }
                }
                if (agreement.equals("yes")) {
                    continue;
                }
                if (agreement.equals("no")) {
                    return;
                }
            }
            System.out.println(answer);

            System.out.println("Please enter your name: ");
            player2 = new Player(input.nextLine());
            System.out.println("Please enter your number: ");
            player2.setNumber(input.nextInt());

            answer = guessNumberPlayer(player2, targetNum) != 0 ? "Не угадал, " + player2.getNumber() +
                    " не равно " + targetNum +
                    ", переход хода к другому игроку..." : player2.getName() + " is Winner ";
            if (answer.equals(player2.getName() + " is Winner ")) {
                System.out.println(answer);
                System.out.println("Do you want to play again? [yes/no]: ");
                Scanner sc = new Scanner(System.in);
                String agreement = sc.nextLine();
                if (agreement.equals("yes")) {
                    continue;
                } else if (agreement.equals("no")) {
                    return;
                } else {
                    while (!agreement.equals("yes") && !agreement.equals("no")) {
                        System.out.println("Do you want to play again? [yes/no]: ");
                        agreement = sc.nextLine();
                    }
                }
                if (agreement.equals("yes")) {
                    continue;
                }
                if (agreement.equals("no")) {
                    return;
                }
            }
            System.out.println(answer);
        } while (guessNumberPlayer(player1, targetNum) != 0 ||
                guessNumberPlayer(player2, targetNum) != 0);
    }

    public int guessNumberPlayer(Player player, int number) {
        return player.getNumber() != number ? 1 : 0;
    }
}