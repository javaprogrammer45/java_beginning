package com.java_beginning.lesson_2_3.guess;

public class GuessNumberTest {
    public static void main(String[] args) {
        Player player1 = new Player();
        Player player2 = new Player();
        GuessNumber guess = new GuessNumber(player1, player2);
        guess.enterNumbers(player1, player2);
    }
}