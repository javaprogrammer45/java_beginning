package com.java_beginning.lesson_2_3_4.guess;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class GuessNumber {
    private Player player1;
    private Player player2;

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void start() {
        System.out.println("Игра началась! У каждого игрока по 10 попыток...");
        int attemptsPlayer1 = 1;
        int attemptsPlayer2 = 1;
        Scanner input = new Scanner(System.in);
        do {
            int targetNum = (int) (Math.random() * 100) + 1;

            do {
                System.out.println("Попытка " + attemptsPlayer1 + "\nЧисло вводит " +
                        player1.getName() + ": ");
                if (choiceNumber(player1, input.nextLine())) {
                    break;
                }
            } while (!choiceNumber(player1, input.nextLine()));

            if (isGuessed(player1, targetNum)) {
                System.out.println(player1.getName() + " угадал число " + targetNum +
                        " c " + attemptsPlayer1 + "-й попытки");
                break;
            }
            attemptsPlayer1++;
            System.out.println("Не угадал, " + player1.getNumber() + " не равно " + targetNum +
                    ", переход хода к другому игроку...\n");

            do {
                System.out.println("Попытка " + attemptsPlayer2 + "\nЧисло вводит " + player2.getName() + ": ");
                if (choiceNumber(player2, input.nextLine())) {
                    break;
                }
            } while (!choiceNumber(player2, input.nextLine()));

            if (isGuessed(player2, targetNum)) {
                System.out.println(player2.getName() + " угадал число " + targetNum + " c " + attemptsPlayer2 + "-й попытки");
                break;
            }
            attemptsPlayer2++;
            System.out.println("Не угадал, " + player2.getNumber() + " не равно " + targetNum +
                    ", переход хода к другому игроку...");

        } while (true);
        printEnteredNumbers(player1, attemptsPlayer1);
        printEnteredNumbers(player2, attemptsPlayer2);
    }

    private boolean isGuessed(Player player, int targetNum) {
        if (player.getNumber() != targetNum) {
            System.out.println((player.getNumber() > targetNum ? "Больше " : "Меньше ") + "загаданного!");
        }
        return player.getNumber() == targetNum;
    }

    private boolean choiceNumber(Player player, String number) {
        try {
            player.setNumber(Integer.parseInt(number));
            player.setNumbers(player.getNumbers());
            return true;
        } catch (NumberFormatException e) {
            System.out.println("Это не число...Введите число!!!");
            return false;
        } catch (IOException e) {
            System.out.println(e.getMessage());
            return false;
        }
    }

    private void printEnteredNumbers(Player player, int attemptsPlayer) {
        int[] numbersPlayer = Arrays.copyOf(player.getNumbers(), attemptsPlayer);
        for (int j : numbersPlayer) {
            System.out.print(j + " ");
        }
        System.out.println();
    }
}