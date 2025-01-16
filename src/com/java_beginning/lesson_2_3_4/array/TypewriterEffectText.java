package com.java_beginning.lesson_2_3_4.array;

public class TypewriterEffectText {
    public static void main(String[] args) throws InterruptedException {
        TypewriterEffectText text = new TypewriterEffectText();
        String string = """
                Java - это C++, из которого убрали все пистолеты, ножи и
                 дубинки.
                - James Gosling""";
        String string1 = """
                Чтобы написать чистый код, мы сначала пишем грязный код, затем рефакторим его.
                - Robert Martin
                """;
        String string2 = null;
        String string3 = " ";
        text.printTypewriterText(text.choiceMinMaxWords(text.changeString(string), string));
        text.printTypewriterText(text.choiceMinMaxWords(text.changeString(string1), string1));
        text.printTypewriterText(text.choiceMinMaxWords(text.changeString(string2), string2));
        text.printTypewriterText(text.choiceMinMaxWords(text.changeString(string3), string3));
    }

    public String[] changeString(String string) {
        if (string == null) {
            System.out.println("Строка null");
            return null;
        }
        if (string.isBlank()) {
            System.out.println("Строка пустая");
            return null;
        }
        String[] words;
        words = string.split("[ .\\-]");
        for (int i = 0; i < words.length; i++) {
            for (int j = 0; j < words.length - 1 - i; j++) {
                if (words[j].trim().length() > words[j + 1].trim().length()) {
                    String temp = words[j];
                    words[j] = words[j + 1];
                    words[j + 1] = temp;
                }
            }
        }
        String newString = String.join(" ", words).trim();
        return newString.split(" ");
    }

    public String choiceMinMaxWords(String[] words, String string) {
        if (string == null) {
            return null;
        }
        if (string.isBlank()) {
            return null;
        }
        String minLength = words[0];
        String maxLength = words[words.length - 1];
        String[] strings = string.split(" ");
        int indexMinLength = 0;
        int indexMaxLength = 0;

        for (int i = 0; i < strings.length; i++) {
            if (strings[i].equals(minLength)) {
                indexMinLength = i;
            }
            if (strings[i].equals(maxLength)) {
                indexMaxLength = i;
            }
        }
        for (int i = 0; i < strings.length; i++) {
            if (indexMinLength > indexMaxLength) {
                if (i >= indexMaxLength && i <= indexMinLength) {
                    strings[i] = strings[i].toUpperCase();
                }
            } else {
                if (i >= indexMinLength && i <= indexMaxLength) {
                    strings[i] = strings[i].toUpperCase();
                }
            }
        }
        return String.join(" ", strings).trim();
    }

    public void printTypewriterText(String newString) throws InterruptedException {
        if (newString == null || newString.isBlank()) {
            return;
        }
        char[] letters = newString.toCharArray();
        for (char letter : letters) {
            System.out.print(letter);
            Thread.sleep(300);
        }
        System.out.println();
    }
}