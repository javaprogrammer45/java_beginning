package com.java_beginning.lesson_2_3_4.guess;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class GuessNumber {
    private Player player1;
    private Player player2;

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void start() {
        System.out.println("Игра началась! У каждого игрока по " + Player.ATTEMPTS + " попыток:");
        Player currPlayer;
        do {
            int targetNumber = (int) (Math.random() * 100) + 1;
            currPlayer = player1;
            boolean isEnd = false;

            do {
                if (currPlayer == player2) {
                    isEnd = true;
                }
                System.out.print("\nПопытка " + currPlayer.getAttemptsCount() + "\nЧисло вводит " +
                        currPlayer.getName() + ": ");
                try {
                    enterNumber(currPlayer);
                } catch (InputMismatchException i) {
                    System.out.println("Введите целое число!!!");
                    continue;
                }
                if (isGuessed(currPlayer, targetNumber)) {
                    System.out.println(currPlayer.getName() + " угадал число " + targetNumber +
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
                System.out.print("Не угадал, " + (currPlayer.getCurrNumber() - 1) +
                        " не равно " + targetNumber +
                        ", переход хода к другому игроку");
                printEnteredNumbers(currPlayer);
                currPlayer = !isEnd ? player2 : player1;
            } while (!isEnd);
        } while (true);
    }

    private void enterNumber(Player currPlayer) {
        Scanner input = new Scanner(System.in);
        boolean isEntered;
        do {
            currPlayer.addNumber(input.nextInt());
            isEntered = true;
        } while (!isEntered);
    }

    private boolean isGuessed(Player currPlayer, int targetNumber) {
        int currNumber = currPlayer.getCurrNumber();
        if (currNumber != targetNumber) {
            System.out.println((currNumber > targetNumber ?
                    "больше " : "меньше ") + "загаданного!");
        }
        return currNumber == targetNumber;
    }

    private void printEnteredNumbers(Player player) {
        int[] playerNumbers = player.getNumbers();
        System.out.print("\nЧисла игрока " + player.getName() + ": ");
        for (int number : playerNumbers) {
            System.out.print(number + " ");
        }
        System.out.println();
    }

    private void fillNumbers(Player currPlayer) {
        Arrays.fill(currPlayer.getNumbers(), 0, currPlayer.getAttemptsCount() - 1, 0);
    }
}