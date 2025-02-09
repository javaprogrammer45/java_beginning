package com.java_beginning.lesson_2_3_4.hangman;

import java.security.SecureRandom;
import java.util.Scanner;

public class HangmanGame {
    private String[] words = {"Яблоко", "Хлеб", "Сало", "Сыр", "Сок"};
    private String[] hanged = {" ", "{\"________\",", "\"|     |\",", "\"|     @\",",
            "\"|    /|\\\",", "\"|    / \\\",", "\"| GAME OVER!\"", "};"};

    public void start() {
        SecureRandom random = new SecureRandom();
        String randomWord = words[random.nextInt(words.length)];
        System.out.println(randomWord);
        char[] elements = new char[randomWord.length()];

        for (int i = 0; i < elements.length; i++) {
            elements[i] = '*';
        }
        String mask = new String(elements);
        int attempts = hanged.length - 1;
        int counter = 1;
        StringBuilder builder = new StringBuilder();
        builder.append(elements);

        Scanner scanner = new Scanner(System.in);
        StringBuilder lettersError = new StringBuilder();
        printInformation(mask, attempts, lettersError);
        do {
            attempts--;
            char letter = scanner.next().toUpperCase().charAt(0);
            String string = String.valueOf(letter);

            int result = builder.toString().toLowerCase().indexOf(string.toLowerCase());

            if (Character.UnicodeBlock.of(string.charAt(0)).equals(Character.UnicodeBlock.CYRILLIC)) {
                if (isGuess(string, randomWord) && attempts != 0) {
                    attempts++;
                    if (result == -1) {
                        for (int i = 0; i < randomWord.length(); i++) {
                            String newRandomWord = randomWord.toUpperCase();

                            if (newRandomWord.charAt(i) == letter) {
                                builder.deleteCharAt(i).insert(i, letter);
                            }
                        }
                        if (counter > 0) {
                            if (attempts < hanged.length - 1) {
                                attempts++;
                            }
                            counter--;
                            printHanged(hanged, counter);
                            counter++;
                            if (!randomWord.toUpperCase().equals(builder.toString().toUpperCase())) {
                                printInformation(builder.toString(), attempts, lettersError);
                            }
                        }
                    } else {
                        System.out.print("\nТакой символ уже есть в строке...\n\n");
                        printInformation(builder.toString(), attempts, lettersError);
                        continue;
                    }
                } else if (!isGuess(string, randomWord) && attempts != 0) {
                    lettersError.append(letter);
                    if (counter > 0) {
                        printHanged(hanged, counter);
                        counter++;
                    } else {
                        counter = 1;
                        printHanged(hanged, counter);
                        counter++;
                    }
                    printInformation(builder.toString(), attempts, lettersError);
                }
            } else {
                System.out.print("\nСимвол не кириллический...\n");
                attempts++;
                printInformation(builder.toString(), attempts, lettersError);
                continue;
            }
            if (randomWord.toUpperCase().equals(builder.toString().toUpperCase())) {
                System.out.println("\nУгадываемое слово: " + builder + "\nОшибки: " +
                        lettersError + "\n" + "Осталось попыток: " + attempts);
                System.out.println("\nYou won!!!");
                return;
            }
            if (attempts == 0) {
                printHanged(hanged, counter);
                System.out.println("\nУгадываемое слово: " + mask + "\nОшибки: " + lettersError +
                        "\n" + "Осталось попыток: " + attempts);
                System.out.println("Вы не угадали слово : " + randomWord);
                System.out.println("\nYou lost!!!");
                return;
            }
        } while (attempts == 1 || attempts <= hanged.length);
    }

    public boolean isGuess(String letter, String randomWord) {
        for (int i = 0; i < randomWord.length(); i++) {
            if (i != 0) {
                if (randomWord.toLowerCase().charAt(i) == letter.toLowerCase().charAt(0)) {
                    return true;
                }
            } else if (i == 0) {
                if (randomWord.charAt(i) == letter.charAt(0)) {
                    return true;
                }
            }
        }
        return false;
    }

    public void printHanged(String[] hanged, int counter) {
        for (int i = 0; i < hanged.length; i++) {
            System.out.println(hanged[i]);
            if (i == counter) {
                break;
            }
        }
    }

    public void printInformation(String mask, int attempts, StringBuilder lettersError) {
        System.out.println("\nУгадываемое слово: " + mask + "\nОшибки: " + lettersError +
                "\n" + "Осталось попыток: " + attempts);
        System.out.print("Введите букву: ");
    }
}