package com.java_beginning.lesson_2_3_4.guess;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class GuessNumber {
    private Player player1;
    private Player player2;
    private Scanner input = new Scanner(System.in);

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void start() throws InputMismatchException {
        System.out.println("Игра началась! У каждого игрока по " + Player.getAttempts() + " попыток...");
        Player currPlayer;
        do {
            int targetNum = (int) (Math.random() * 100) + 1;
            currPlayer = player1;
            boolean isEnd = false;

            do {
                if (currPlayer.equals(player2)) {
                    isEnd = true;
                }
                System.out.println("Попытка " + currPlayer.getAttemptsCount() + "\nЧисло вводит " +
                        currPlayer.getName() + ": ");

                if (!enterNumber(currPlayer, input.nextInt())) {
                    continue;
                }

                if (isGuessed(currPlayer, targetNum)) {
                    System.out.println(currPlayer.getName() + " угадал число " + targetNum +
                            " c " + currPlayer.getAttemptsCount() + "-й попытки");
                    printEnteredNumbers(player1);
                    printEnteredNumbers(player2);
                    fillNumbers(player1);
                    fillNumbers(player2);
                    int newAttempts = 1;
                    player1.setAttemptsCount(newAttempts);
                    player2.setAttemptsCount(newAttempts);
                    return;
                }
                System.out.println("Не угадал, " + currPlayer.getCurrNumber() +
                        " не равно " + targetNum +
                        ", переход хода к другому игроку...\n");
                currPlayer = !isEnd ? player2 : player1;
            } while (!isEnd);
        } while (true);
    }

    private boolean enterNumber(Player currPlayer, int number) {
        boolean isEnter = false;
        try {
            currPlayer.addNumber(number);
            isEnter = true;
        } catch (RuntimeException r) {
            System.out.println(r.getMessage());
        }
        return isEnter;
    }

    private boolean isGuessed(Player currPlayer, int targetNum) {
        int currNumber = currPlayer.getCurrNumber();
        if (currNumber != targetNum) {
            System.out.println((currNumber > targetNum ?
                    "больше " : "меньше ") + "загаданного!");
        }
        return currNumber == targetNum;
    }

    private void printEnteredNumbers(Player player) {
        int[] playerNumbers = player.getNumbers();
        for (int number : playerNumbers) {
            System.out.print(number + " ");
        }
        System.out.println();
    }

    private void fillNumbers(Player currPlayer) {
        Arrays.fill(currPlayer.getNumbers(), 0, currPlayer.getAttemptsCount() - 1, 0);
    }
}