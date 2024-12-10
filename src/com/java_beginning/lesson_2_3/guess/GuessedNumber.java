package com.java_beginning.lesson_2_3.guess;

import java.util.Scanner;

public class GuessedNumber {
    private Player player1;
    private Player player2;

    public GuessedNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void start() {
        Scanner input = new Scanner(System.in);
        do {
            int targetNum = (int) (Math.random() * 100) + 1;
            System.out.println("Please " + player1.getName() + " enter your number: ");
            enterNumber(player1, input.nextInt());
            if (isGuessed(player1, targetNum)) {
                break;
            }
            System.out.println("Не угадал, " + player1.getNumber() + " не равно " + targetNum +
                    ", переход хода к другому игроку...");
            System.out.println("Please " + player2.getName() + " enter your number: ");
            enterNumber(player2, input.nextInt());
            if (isGuessed(player2, targetNum)) {
                break;
            }
            System.out.println("Не угадал, " + player2.getNumber() + " не равно " + targetNum +
                    ", переход хода к другому игроку...");
        } while (true);
    }

    public boolean isGuessed(Player player, int targetNum) {
        if (player.getNumber() > targetNum) {
            System.out.println(player.getNumber() + "  Больше загаданого!");
        } else if (player.getNumber() < targetNum) {
            System.out.println(player.getNumber() + "  Меньше загаданого!");
        }
        return player.getNumber() != targetNum ? false : true;
    }

    public void enterNumber(Player player, int number) {
        player.setNumber(number);
    }
}