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
        Scanner input = new Scanner(System.in);
        int attemptsPlayer1 = 1;
        int attemptsPlayer2 = 1;
        int attemptsPlayer;
        Player player;
        do {
            int targetNum = (int) (Math.random() * 100) + 1;
            player = player1;
            boolean isEnd = false;
            do {
                if (player.equals(player1)) {
                    attemptsPlayer = attemptsPlayer1++;
                } else {
                    attemptsPlayer = attemptsPlayer2++;
                    isEnd = true;
                }
                System.out.println("Попытка " + attemptsPlayer + "\nЧисло вводит " + player.getName() + ": ");
                enterNumbers(player, input.nextLine());
                if (isGuessed(player, targetNum)) {
                    System.out.println(player.getName() + " угадал число " + targetNum +
                            " c " + attemptsPlayer + "-й попытки");
                    printEnteredNumbers(player1, attemptsPlayer1);
                    printEnteredNumbers(player2, attemptsPlayer2);
                    return;
                }
                System.out.println("Не угадал, " + player.getNumber() + " не равно " + targetNum +
                        ", переход хода к другому игроку...\n");

                player = player2;
            } while (!isEnd);
        } while (true);
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

    private void enterNumbers(Player player, String number) {
        do {
            if (choiceNumber(player, number)) {
                break;
            }
        } while (false);
    }
}