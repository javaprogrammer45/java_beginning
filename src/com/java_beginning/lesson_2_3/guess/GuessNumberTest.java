package com.java_beginning.lesson_2_3.guess;

import java.util.Scanner;

public class GuessNumberTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter your name: ");
        Player player1 = new Player(sc.nextLine());

        System.out.println("Please enter your name: ");
        Player player2 = new Player(sc.nextLine());

        GuessNumber guessNumber = new GuessNumber(player1, player2);

        String result = guessNumber.start();
    }
}