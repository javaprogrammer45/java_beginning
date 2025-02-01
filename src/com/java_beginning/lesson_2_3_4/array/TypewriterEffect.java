package com.java_beginning.lesson_2_3_4.array;

public class TypewriterEffect {
    public static void main(String[] args) throws InterruptedException {
        TypewriterEffect text = new TypewriterEffect();
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
        text.printTypewriterText(text.changeString(text.sourceMinMaxWords(string), string));
        text.printTypewriterText(text.changeString(text.sourceMinMaxWords(string1), string1));
        text.printTypewriterText(text.changeString(text.sourceMinMaxWords(string2), string2));
        text.printTypewriterText(text.changeString(text.sourceMinMaxWords(string3), string3));
    }

    public String[] sourceMinMaxWords(String originalText) {
        if (originalText == null || originalText.isBlank()) {
            System.out.println("Ошибка: введенная строка не может быть пустой или null. Введите корректный текст");
            return null;
        }
        String[] words;
        words = originalText.split("[ .,!?\\-\n]+");
        for (int i = 0; i < words.length; i++) {
            for (int j = 0; j < words.length - 1 - i; j++) {
                if (words[j].trim().length() > words[j + 1].trim().length()) {
                    String temp = words[j];
                    words[j] = words[j + 1];
                    words[j + 1] = temp;
                }
            }
        }
        String[] wordsMinMax = new String[2];
        wordsMinMax[0] = words[0];
        wordsMinMax[1] = words[words.length - 1];
        return wordsMinMax;
    }

    public String changeString(String[] wordsMinMax, String originalText) {
        if (originalText == null || originalText.isBlank()) {
            return null;
        }
        String[] strings = originalText.split(" ");
        int indexMinLength = 0;
        int indexMaxLength = 0;
        String stringTmp = "";
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < strings.length; i++) {

            stringTmp = strings[i];
            builder.append(stringTmp);

            if (builder.charAt(builder.length() - 1) == ',' || builder.charAt(builder.length() - 1) == '\n') {
                stringTmp = String.valueOf(builder.deleteCharAt(builder.length() - 1));
            }
            if (stringTmp.equals(wordsMinMax[0])) {
                indexMinLength = i;
            }
            if (stringTmp.equals(wordsMinMax[1])) {
                indexMaxLength = i;
            }

            builder.delete(0, builder.length());
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

    public void printTypewriterText(String changedString) throws InterruptedException {
        if (changedString == null || changedString.isBlank()) {
            return;
        }
        char[] elementsChangedString = changedString.toCharArray();
        for (char element : elementsChangedString) {
            System.out.print(element);
            Thread.sleep(70);
        }
        System.out.println();
    }
}