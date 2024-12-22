package com.java_beginning.lesson_2_3_4.hangman;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class HangmanGameMain {
    public static void main(String[] args) throws IOException {
        HangmanGame hangmanGame = new HangmanGame();
        char[] lettersMask = hangmanGame.start(hangmanGame.getWords());
        char[] letters = new char[lettersMask.length];
        int attempts = 0;
        do {

            hangmanGame.printLetters(hangmanGame.guessWord(lettersMask));


            attempts++;
        } while (attempts < hangmanGame.getStringsHang().length);


    }
}
