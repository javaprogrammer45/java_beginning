package com.java_beginning.lesson_2_3.method.naming;

public class Main {
    private void execNonBooleanMethod() {
        NonBooleanMethods nonBm = new NonBooleanMethods();
        nonBm.findLongestWord();
        nonBm.selectMenuItem();
        nonBm.calculateAverageGrades();
        nonBm.countUniqueWords();
        nonBm.displayErrorMessage();
        nonBm.sync();
        nonBm.restoreData();
        nonBm.pauseDownloading();
        nonBm.resetFactorySettings();
        nonBm.writeToFile();
        nonBm.toFahrenheit();
        nonBm.enterMathExpr();
        nonBm.determineWinner();
        nonBm.findBookByAuthor();
    }

    private void execBooleanMethod() {
        BooleanMethods bm = new BooleanMethods();
        boolean shouldContinue = bm.shouldContinue();
        System.out.println(shouldContinue);
        boolean isDeleteFile = bm.isDeletedFile();
        System.out.println(isDeleteFile);
        boolean hasUniqueDigit = bm.hasUniqueDigit();
        System.out.println(hasUniqueDigit);
        boolean isLetter = bm.isLetter();
        System.out.println(isLetter);
        boolean hasEqualDigits = bm.hasEqualDigits();
        System.out.println(hasEqualDigits);
        boolean isAttempts  = bm.isAttempts();
        System.out.println(isAttempts);
        boolean isEmptyString = bm.isEmptyString();
        System.out.println(isEmptyString);
        boolean isEvenNumber = bm.isEvenNumber();
        System.out.println(isEvenNumber);
        boolean isValidPath = bm.isValidPath();
        System.out.println(isValidPath);
        boolean isExistsFile = bm.isExistsFile();
        System.out.println(isExistsFile);
    }

    public static void main(String[] args) {
        Main main = new Main();
        main.execNonBooleanMethod();
        main.execBooleanMethod();
    }
}
