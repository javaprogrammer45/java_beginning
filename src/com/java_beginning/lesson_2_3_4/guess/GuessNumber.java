package com.java_beginning.lesson_2_3_4.guess;

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
        int targetNumber = (int) (Math.random() * 100) + 1;
        currPlayer = player1;

        do {
            System.out.print("\nПопытка " + currPlayer.getAttemptsCount() + "\nЧисло вводит " +
                    currPlayer.getName() + ": ");
            if (enterNumber(currPlayer) == -1) {
                continue;
            }
            if (isGuessed(currPlayer, targetNumber)) {
                System.out.println(currPlayer.getName() + " угадал число " + targetNumber +
                        " c " + (currPlayer.getAttemptsCount() - 1) + "-й попытки");
                printEnteredNumbers(currPlayer);
                return;
            }
            System.out.print("Не угадал, " + currPlayer.getCurrNumber() +
                    " не равно " + targetNumber +
                    ", переход хода к другому игроку");
            printEnteredNumbers(currPlayer);
            currPlayer = currPlayer == player1 ? player2 : player1;
        } while (currPlayer.getAttemptsCount() <= Player.ATTEMPTS);
        player1.clear();
        player2.clear();
    }

    private int enterNumber(Player currPlayer) {
        Scanner input = new Scanner(System.in);
        boolean isEntered = false;
        int result = 0;
        do {
            try {
                currPlayer.addNumber(input.nextInt());
                isEntered = true;
                result = 1;
            } catch (InputMismatchException e) {
                System.out.println("Введите целое число!!!");
                result = -1;
                break;
            } catch (RuntimeException ex) {
                System.out.println(ex.getMessage());
            }
        } while (!isEntered);
        return result;
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
        int[] numbersPlayer = player.getNumbers();
        System.out.print("\nЧисла игрока " + player.getName() + ": ");
        for (int number : numbersPlayer) {
            System.out.print(number + " ");
        }
        System.out.println();
    }
}