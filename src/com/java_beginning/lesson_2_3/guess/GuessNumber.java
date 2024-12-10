package com.java_beginning.lesson_2_3.guess;

import java.util.Scanner;

public class GuessNumber {
    private Player player1;
    private Player player2;

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public String start() {
        Scanner input = new Scanner(System.in);
        String answer;
        do {
            int targetNum = (int) (Math.random() * 100) + 1;
            System.out.println("Please " + player1.getName() + " enter your number: ");
            player1.setNumber(input.nextInt());

            answer = isGuessed(player1, targetNum) != true ? "Не угадал, " +
                    player1.getNumber() + " не равно " + targetNum +
                    ", переход хода к другому игроку..." : player1.getName() + " is Winner ";

            System.out.println(answer);
            if (!answer.equals(player1.getName() + " is Winner")) {
                System.out.println("Please " + player2.getName() + " enter your number: ");
                player2.setNumber(input.nextInt());

                answer = isGuessed(player2, targetNum) != true ? "Не угадал, " +
                        player2.getNumber() + " не равно " + targetNum +
                        ", переход хода к другому игроку..." : player2.getName() + " is Winner ";

                System.out.println(answer);
            }
            if (answer.equals(player1.getName() + " is Winner ") ||
                    answer.equals(player2.getName() + " is Winner ")) {
                System.out.println("Do you want to play again? [yes/no]: ");
                input.nextLine();
                String agreement = input.nextLine();
                while (!agreement.equals("yes") && !agreement.equals("no")) {
                    System.out.println("Do you want to play again? [yes/no]: ");
                    agreement = input.nextLine();
                }
                if (agreement.equals("no")) {
                    return answer;
                }
            }
        } while (!answer.equals(player1.getName() + " is Winner") ||
                !answer.equals(player2.getName() + " is Winner"));
        return answer;
    }

    public boolean isGuessed(Player player, int targetNum) {
        if (player.getNumber() > targetNum) {
            System.out.println(player.getNumber() + "  Больше загаданого!");
        } else {
            System.out.println(player.getNumber() + "  Меньше загаданого!");
        }
        return player.getNumber() != targetNum ? false : true;
    }
}