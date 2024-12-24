package com.java_beginning.lesson_2_3_4.array;

public class Text {
    public static void main(String[] args) throws InterruptedException {
        Text text = new Text();
        String string = " Java - это C++, из которого убрали все пистолеты, ножи и дубинки.\n" +
                "- James Gosling";
        text.printString(text.definitionMinMaxWords(text.changeString(string), string));
    }

    public String[] changeString(String string) {
        String[] words;
        words = string.split("[ ,.\\-\\n]");
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

    public String[] definitionMinMaxWords(String[] words, String string) throws InterruptedException {
        String[] strings = new String[words.length];
        if (!string.equals("null") && !string.isEmpty() && !string.equals("пустая строка")) {
            String minLength = "";
            String maxLength = "";
            for (int i = 0; i < words.length - 1; i++) {
                minLength = words[0];
                maxLength = words[words.length - 1];
            }
            String[] arrayStrings = string.split("[ .,\\-\\n] ");
            String newString = String.join(" ", arrayStrings).trim();
            String[] newWords = newString.split(" ");
            int index1 = 0;
            int index2 = 0;
            for (int i = 0; i < newWords.length; i++) {
                if (newWords[i].equals(minLength)) {
                    index1 = i;
                } else if (newWords[i].equals(maxLength)) {
                    index2 = i;
                }
            }
            int numberIndex;
            int num;
            if (index1 < index2) {
                numberIndex = index1;
                num = index2;
            } else {
                numberIndex = index2;
                num = index1;
            }
            for (int j = numberIndex; j <= num; j++) {
                strings[j] = newWords[j].toUpperCase();
            }
        } else if (string.equals("null")) {
            for (int k = 0; k < strings.length; k++) {
                strings[k] = string;
            }
        } else if (string.equals("пустая строка")) {
            for (int k = 0; k < strings.length; k++) {
                strings[k] = string.toUpperCase();
            }
        }
        return strings;
    }

    public void printString(String[] strings) throws InterruptedException {
        for (String string : strings) {
            if (string == null) {
                continue;
            } else if (string.equals("null") || string.equals("пустая строка")) {
                string.toLowerCase();
            }
            char[] letters = string.toCharArray();
            for (char letter : letters) {
                System.out.print(letter);
                Thread.sleep(300);
            }
            System.out.print("  ");
        }
    }
}