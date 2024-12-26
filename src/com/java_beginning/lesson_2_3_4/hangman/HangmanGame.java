package com.java_beginning.lesson_2_3_4.hangman;

import java.security.SecureRandom;
import java.util.Scanner;

public class HangmanGame {
    private String[] words = {"Яблоко", "Хлеб", "Сало", "Сыр", "Сок"};
    private String[] stringsHang = {" ", "{\"________\",", "\"|     |\",", "\"|     @\",", "\"|    /|\\\\\",", "\"|    / \\\\\",", "\"| GAME OVER!\"", "};"};

    public String[] getWords() {
        return words;
    }

    public void start(String[] words) {
        SecureRandom random = new SecureRandom();
        String randomWord = words[random.nextInt(words.length)];
        System.out.println(randomWord);
        char[] elements = new char[randomWord.length()];
        for (int i = 0; i < elements.length; i++) {
            elements[i] = '*';
        }
        String mask = new String(elements);
        System.out.println("Введите букву...\n" + mask);
        StringBuilder builder = new StringBuilder();
        builder.append(elements);
        int attempts = stringsHang.length;
        int counter = 1;
        do {
            attempts--;
            Scanner scanner = new Scanner(System.in);
            char letter = scanner.next().toUpperCase().charAt(0);
            String string = String.valueOf(letter);

            int result = builder.toString().toLowerCase().indexOf(string.toLowerCase());

            if (Character.UnicodeBlock.of(string.charAt(0)).equals(Character.UnicodeBlock.CYRILLIC)) {
                if (isGuess(string, randomWord)) {
                    attempts++;
                    counter--;
                    if (result == -1) {
                        for (int i = 0; i < randomWord.length(); i++) {
                            String newRandomWord = randomWord.toUpperCase();

                            if (newRandomWord.charAt(i) == letter) {
                                builder.deleteCharAt(i).insert(i, letter);
                            }
                        }
                        if (counter > 0) {
                            counter--;
                            System.out.print(attempts + " ");
                            System.out.println(builder + "           " + stringsHang[counter]);
                        } else {
                            System.out.print(attempts + " ");
                            System.out.println(builder);
                        }
                    } else {
                        System.out.print("Такой символ уже есть в строке...\nВведите букву...\n");
                        continue;
                    }
                } else if (!isGuess(string, randomWord)) {
                    if (counter > 0) {
                        System.out.print(attempts + " ");
                        System.out.println(letter + "           " + stringsHang[counter]);
                        counter++;
                    } else if (counter <= 0) {
                        counter = 1;
                        System.out.print(attempts + " ");
                        System.out.println(letter + "           " + stringsHang[counter]);
                        counter++;
                    }
                }
            } else {
                System.out.print("Символ не кириллический...\nВведите букву...\n");
                continue;
            }
            if (randomWord.toUpperCase().equals(builder.toString().toUpperCase())) {
                System.out.println("You won!!!");
                return;
            }
            if (attempts == 0) {
                System.out.println("You lost!!!");
                return;
            }
        } while (attempts > 1 || attempts < stringsHang.length);
    }

    public boolean isGuess(String letter, String randomWord) {
        for (int j = 0; j < randomWord.length(); j++) {
            if (j != 0) {
                if (randomWord.toLowerCase().charAt(j) == letter.toLowerCase().charAt(0)) {
                    return true;
                }
            } else if (j == 0) {
                if (randomWord.charAt(j) == letter.charAt(0)) {
                    return true;
                }
            }
        }
        return false;
    }
}