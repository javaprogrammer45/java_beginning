package com.java_beginning.lesson_2_3_4.array;

public class Text {
    public static void main(String[] args) throws InterruptedException {
        Text text = new Text();
        String string = "Java - это C++, из которого убрали все пистолеты, ножи и дубинки.\n" +
                "- James Gosling";
        text.printWords(text.changeStrings(string), string);
    }

    public String[] changeStrings(String string) {
        String[] words;

        if (string == null) {
            string = "null";
        } else if (string.isEmpty()) {
            string = "пустая строка";
        }

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
        String[] newWords = newString.split(" ");
        return newWords;
    }

    public void printWords(String[] words, String string) throws InterruptedException {
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

            if (index1 < index2) {
                for (int j = index1; j < newWords.length - 1; j++) {
                    char[] letters = newWords[j].toUpperCase().toCharArray();
                    for (int k = 0; k < letters.length; k++) {
                        System.out.print(letters[k]);
                        Thread.sleep(300);
                    }
                    System.out.print(" ");

                    if (j == index2) {
                        break;
                    }
                }
            } else if (index2 < index1) {
                for (int j = index2; j < newWords.length - 1; j++) {
                    char[] letters = newWords[j].toUpperCase().toCharArray();
                    for (int k = 0; k < letters.length; k++) {
                        System.out.print(letters[k]);
                        Thread.sleep(300);
                    }
                    System.out.print(" ");
                    if (j == index1) {
                        break;
                    }
                }
            }
        } else if (string.equals("null")) {
            char[] letters = string.toUpperCase().toCharArray();
            for (int k = 0; k < letters.length; k++) {

                System.out.print(letters[k]);
                Thread.sleep(300);
            }
        } else if (string.equals("пустая строка")) {
            char[] letters = string.toUpperCase().toCharArray();
            for (int k = 0; k < letters.length; k++) {
                System.out.print(letters[k]);
                Thread.sleep(300);
            }
        }
    }
}

