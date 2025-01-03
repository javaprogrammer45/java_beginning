package com.java_beginning.lesson_2_3_4.guess;

import java.util.Scanner;

public class GuessNumberModified {
    private Player player1;
    private Player player2;

    public GuessNumberModified (Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void start() {
        Scanner input = new Scanner(System.in);
        do {
            int targetNum = (int) (Math.random() * 100) + 1;

            System.out.println("Please " + player1.getName() + " enter your number: ");
            choiceNumber(player1, input.nextInt());
            if (isGuessed(player1, targetNum)) {
                System.out.println(player1.getName() + " is Winner");
                break;
            }
            System.out.println("Не угадал, " + player1.getNumber() + " не равно " + targetNum +
                    ", переход хода к другому игроку...\n" + "Please " + player2.getName() +
                    " enter your number: ");
            choiceNumber(player2, input.nextInt());
            if (isGuessed(player2, targetNum)) {
                System.out.println(player2.getName() + " is Winner");
                break;
            }
            System.out.println("Не угадал, " + player2.getNumber() + " не равно " + targetNum +
                    ", переход хода к другому игроку...");
        } while (true);
    }

    private boolean isGuessed(Player player, int targetNum) {
        if (player.getNumber() > targetNum) {
            System.out.println(player.getNumber() + "  Больше загаданого!");
        } else if (player.getNumber() < targetNum) {
            System.out.println(player.getNumber() + "  Меньше загаданого!");
        }
        return player.getNumber() == targetNum ? true : false;
    }

    private void choiceNumber(Player player, int number) {
        player.setNumber(number);
    }
}
