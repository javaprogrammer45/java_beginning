package com.java_beginning.lesson_2_3_4.guess;

import java.util.Scanner;

public class GuessNumberModified {

    private PlayerModified player1;
    private PlayerModified player2;

    public GuessNumberModified(PlayerModified player1, PlayerModified player2) {
        this.player1 = new PlayerModified("Andrey");
        this.player2 = new PlayerModified("Aleksey");
    }

    public void start() {
        System.out.println("Игра началась! У каждого игрока по 10 попыток...");
        int attemptsPlayer1 = 1;
        int attemptsPlayer2 = 1;
        Scanner input = new Scanner(System.in);
        do {
            int targetNum = (int) (Math.random() * 100) + 1;
            System.out.println("Попытка " + attemptsPlayer1 + "\nЧисло вводит " + player1.getName() + ": ");

            choiceNumber(player1, input.nextInt());



            if (isGuessed(player1, targetNum)) {
                System.out.println(player1.getName() + " угадал число " + targetNum + " c " + attemptsPlayer1 + "-й попытки");
                break;
            }
            attemptsPlayer1++;
            System.out.println("Не угадал, " + player1.getNumber() + " не равно " + targetNum +
                    ", переход хода к другому игроку...\n" + "Попытка " + attemptsPlayer2 + "\nЧисло вводит " + player2.getName() +
                    ": ");

            choiceNumber(player2, input.nextInt());



            if (isGuessed(player2, targetNum)) {
                System.out.println(player2.getName() + " угадал число " + targetNum + " c " + attemptsPlayer2 + "-й попытки");
                break;
            }
attemptsPlayer2++;
            System.out.println("Не угадал, " + player2.getNumber() + " не равно " + targetNum +
                    ", переход хода к другому игроку...");

        } while (true);
    }

    private boolean isGuessed(PlayerModified player, int targetNum) {
        if (player.getNumber() != targetNum) {
            System.out.println((player.getNumber() > targetNum ? "Больше " : "Меньше ") + "загаданного!");
        }
        return player.getNumber() == targetNum;
    }

    private void choiceNumber(PlayerModified player, int number) {
        player.setNumber(number);
        player.setNumbers(player.getNumbers());
    }


}
