package Lesson_2_3.guess;

import java.util.Scanner;

public class GuessNumber {
    private Player player1;
    private Player player2;

    public GuessNumber() {
    }

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public int guessNumberPlayer(Player player, int number) {
        return player.getNumber() != number ? 1 : 0;
    }

    public void enterDataPlayer(Player player) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your name: ");
        player.setName(input.nextLine());
        System.out.println("Please enter your number: ");
        player.setNumber(input.nextInt());
    }
}