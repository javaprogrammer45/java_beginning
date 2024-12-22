package com.java_beginning.lesson_2_3_4.hangman;

import java.io.IOException;
import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Scanner;

public class HangmanGame {
    private String[] words = {"Яблоко", "Хлеб", "Сало", "Сыр", "Сок"};
    private String[] stringsHang = {"{\"________\",", "\"|     |\",", "\"|     @\",", "\"|    /|\\\\\",", "\"|    / \\\\\",", "\"| GAME OVER!\"", "};"};


    public HangmanGame() {
    }

    public HangmanGame(String[] words, String[] stringsHang) {
        this.words = words;
        this.stringsHang = stringsHang;
    }

    public String[] getWords() {
        return words;
    }

    public String[] getStringsHang() {
        return stringsHang;
    }

    public char[] start(String[] words) {

        SecureRandom random = new SecureRandom();
        String randomWord = words[random.nextInt(words.length)];
        System.out.println(randomWord);
        char[] elements = new char[randomWord.length()];
        for (int i = 0; i < elements.length; i++) {
            elements[i] = '*';
        }
        String mask = new String(elements);
        System.out.println("Введите букву...\n" + mask);
        char[] array =randomWord.toCharArray();
        return array;
    }

    public char[] guessWord(char[] array) throws IOException {
        Scanner scanner = new Scanner(System.in);
        char letter = scanner.next().toUpperCase().charAt(0);
        String string = new String(new char[]{letter});
        int attempts= array.length;

        int counter = 0;
        do {

            for (int i = counter; i < array.length; i++) {

                attempts--;
                if (i != 0) {
                    if (string.toLowerCase().charAt(0) != array[i]) {
                        array[i] = '*';
                    }
                } else {
                    if (string.charAt(0) != array[i]) {
                            array[i] = '*';
                    }
                }
            }
            counter++;
        }while (attempts!=0);

        return array;
    }

    public void printLetters(char[] letters) throws IOException {
        for (int i = 0; i < letters.length; i++) {
            System.out.print(letters[i] + " ");

        }

    }

    public void printHang(String[] stringsHang, int attempt) throws IOException {
        for (int i = 0; i < stringsHang.length; i++) {
            System.out.println(stringsHang[i]);
        }
    }
}
