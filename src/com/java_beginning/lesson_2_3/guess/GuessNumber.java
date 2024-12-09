package com.java_beginning.lesson_2_3.guess;

import java.util.Scanner;

public class GuessNumber {
    private Player player1;
    private Player player2;

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public String start(Player player1, Player player2) {
        String answer;
        do {
            int targetNum = (int) (Math.random() * 100) + 1;

            Scanner input = new Scanner(System.in);
            System.out.println("Please " + player1.getName() + " enter your number: ");
            player1.setNumber(input.nextInt());

            answer = guessNumberPlayer(player1, targetNum) != 0 ? "Не угадал, " +
                    player1.getNumber() + " не равно " + targetNum +
                    ", переход хода к другому игроку..." : player1.getName() + " is Winner ";

            System.out.println(answer);
            if (!answer.equals(player1.getName() + " is Winner")) {
                System.out.println("Please " + player2.getName() + " enter your number: ");
                player2.setNumber(input.nextInt());

                answer = guessNumberPlayer(player2, targetNum) != 0 ? "Не угадал, " +
                        player2.getNumber() + " не равно " + targetNum +
                        ", переход хода к другому игроку..." : player2.getName() + " is Winner ";

                System.out.println(answer);
            }

            return answer;
        } while (!answer.equals(player1.getName() + " is Winner") ||
                !answer.equals(player2.getName() + " is Winner"));
    }

    public int guessNumberPlayer(Player player, int number) {
        if (player.getNumber() > number) {
            System.out.println(player.getNumber() + "  Больше загаданого!");
        } else {
            System.out.println(player.getNumber() + "  Меньше загаданого!");
        }
        return player.getNumber() != number ? 1 : 0;
    }
}