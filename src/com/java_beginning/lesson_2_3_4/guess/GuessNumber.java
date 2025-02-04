package com.java_beginning.lesson_2_3_4.guess;

import java.util.InputMismatchException;
import java.util.Scanner;

public class GuessNumber {
    private Player player1;
    private Player player2;
    int attemptsPlayer;
    private Scanner input = new Scanner(System.in);

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void start() throws InputMismatchException {
        System.out.println("Игра началась! У каждого игрока по 10 попыток...");
        Player currPlayer;
        do {
            int targetNum = (int) (Math.random() * 100) + 1;
            currPlayer = player1;
            boolean isEnd = false;

            do {
                if (currPlayer.equals(player1)) {
                    attemptsPlayer = player1.getCountAttempts() + 1;
                } else {
                    attemptsPlayer = player2.getCountAttempts() + 1;
                    isEnd = true;
                }
                System.out.println("Попытка " + attemptsPlayer + "\nЧисло вводит " +
                        currPlayer.getName() + ": ");
                enterNumbers(currPlayer, input.nextInt());

                if (isGuessed(currPlayer, targetNum)) {
                    System.out.println(currPlayer.getName() + " угадал число " + targetNum +
                            " c " + attemptsPlayer + "-й попытки");
                    printEnteredNumbers(player1);
                    printEnteredNumbers(player2);
                    return;
                }

                System.out.println("Не угадал, " + currPlayer.extractNumberArray(currPlayer.getNumbers()) +
                        " не равно " + targetNum +
                        ", переход хода к другому игроку...\n");
                currPlayer = !isEnd ? player2 : player1;
            } while (!isEnd);
        } while (true);
    }

    private void enterNumbers(Player player, int number) {
        do {
            if (choiceNumber(player, number)) {
                break;
            }
        } while (false);
    }

    private boolean choiceNumber(Player player, int number) {
        try {
            player.addNumber(number);
            return true;
        } catch (RuntimeException r) {
            System.out.println(r.getMessage());
            return false;
        }
    }

    private boolean isGuessed(Player currPlayer, int targetNum) {
        if (currPlayer.extractNumberArray(currPlayer.getNumbers()) != targetNum) {
            System.out.println((currPlayer.extractNumberArray(currPlayer.getNumbers()) > targetNum ?
                    "Больше " : "Меньше ") + "загаданного!");
        }
        return currPlayer.extractNumberArray(currPlayer.getNumbers()) == targetNum;
    }

    private void printEnteredNumbers(Player player) {
        int[] numbersPlayer = player.getNumbers();
        for (int j : numbersPlayer) {
            System.out.print(j + " ");
        }
        System.out.println();
    }
}