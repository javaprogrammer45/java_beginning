package com.java_beginning.lesson_2_3_4.hangman;

import java.security.SecureRandom;
import java.util.Scanner;

public class HangmanGame {
    private String[] guessableWord = {"Яблоко", "Хлеб", "Сало", "Сыр", "Сок"};
    private String[] gallows = {" ",
            "{\"________\",",
            "\"|     |\",",
            "\"|     @\",",
            "\"|    /|\\\",",
            "\"|    / \\\",",
            "\"| GAME OVER!\"",
            "};"};
    private boolean isInput = true;

    public void start() {
        SecureRandom random = new SecureRandom();
        String randomWord = guessableWord[random.nextInt(guessableWord.length)];
        System.out.println(randomWord);
        int attempts = gallows.length - 1;
        int counter = 1;
        StringBuilder mask = new StringBuilder();
        mask.repeat('*', randomWord.length());

        Scanner scanner = new Scanner(System.in);
        StringBuilder wrongLetters = new StringBuilder();
        printInformation(mask, attempts, wrongLetters);
        do {
            attempts--;
            char letter = scanner.next().toUpperCase().charAt(0);
            String string = String.valueOf(letter);

            int result = mask.toString().toLowerCase().indexOf(string.toLowerCase());

            if (Character.UnicodeBlock.of(string.charAt(0)).equals(Character.UnicodeBlock.CYRILLIC)) {
                if (isGuessed(string, randomWord) && attempts != 0) {
                    attempts++;
                    if (result == -1) {
                        insertLetter(randomWord, letter, mask);
                        if (counter > 0) {
                            if (attempts < gallows.length - 1) {
                                attempts++;
                            }
                            counter--;
                            drawGallows(counter);
                            counter++;
                            if (!randomWord.toUpperCase().equals(mask.toString().toUpperCase())) {
                                printInformation(mask, attempts, wrongLetters);
                            }
                        }
                    } else {
                        System.out.print("\nТакой символ уже есть в строке...\n\n");
                        printInformation(mask, attempts, wrongLetters);
                        continue;
                    }
                } else if (!isGuessed(string, randomWord) && attempts != 0) {
                    wrongLetters.append(letter);
                    if (counter > 0) {
                        drawGallows(counter);
                        counter++;
                    } else {
                        counter = 1;
                        drawGallows(counter);
                        counter++;
                    }
                    printInformation(mask, attempts, wrongLetters);
                }
            } else {
                System.out.print("\nСимвол не кириллический...\n");
                attempts++;
                printInformation(mask, attempts, wrongLetters);
                continue;
            }

            determineWinner(randomWord, mask, attempts, wrongLetters, counter);
        } while (attempts == 1 || attempts <= gallows.length);
    }

    private boolean isGuessed(String letter, String randomWord) {
        for (int i = 0; i < randomWord.length(); i++) {
            if (i != 0) {
                if (randomWord.toLowerCase().charAt(i) == letter.toLowerCase().charAt(0)) {
                    return true;
                }
            } else {
                if (randomWord.charAt(i) == letter.charAt(0)) {
                    return true;
                }
            }
        }
        return false;
    }

    private void insertLetter(String randomWord, char letter, StringBuilder mask) {
        for (int i = 0; i < randomWord.length(); i++) {
            String newRandomWord = randomWord.toUpperCase();

            if (newRandomWord.charAt(i) == letter) {
                mask.deleteCharAt(i).insert(i, letter);
            }
        }
    }

    private void drawGallows(int counter) {
        for (int i = 0; i < counter; i++) {
            System.out.println(gallows[i]);
        }
    }

    private void determineWinner(String randomWord, StringBuilder mask, int attempts,
                                 StringBuilder wrongLetters, int counter) {
        if (randomWord.toUpperCase().equals(mask.toString().toUpperCase())) {
            isInput = false;
            printInformation(mask, attempts, wrongLetters);
            System.out.println("\nYou won!!!");
            return;
        }
        if (attempts == 0) {
            isInput = false;
            drawGallows(counter);
            printInformation(mask, attempts, wrongLetters);
            System.out.println("Вы не угадали слово : " + randomWord);
            System.out.println("\nYou lost!!!");
            return;
        }
    }

    private void printInformation(StringBuilder mask, int attempts, StringBuilder lettersError) {
        if (isInput) {
            System.out.println("\nУгадываемое слово: " + mask + "\nОшибки: " + lettersError +
                    "\n" + "Осталось попыток: " + attempts);
            System.out.print("Введите букву: ");
        } else {
            System.out.println("\nУгадываемое слово: " + mask + "\nОшибки: " + lettersError +
                    "\n" + "Осталось попыток: " + attempts);
        }
    }
}