package com.java_beginning.lesson_2_3.method.naming;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.execNonBooleanMethods();
        main.execBooleanMethods();
    }

    private void execNonBooleanMethods() {
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

    private void execBooleanMethods() {
        BooleanMethods bm = new BooleanMethods();
        System.out.println(bm.shouldContinue());
        System.out.println(bm.isDeletedFile());
        System.out.println(bm.hasUniqueDigit());
        System.out.println(bm.isLetter());
        System.out.println(bm.hasEqualDigits());
        System.out.println(bm.isAttempts());
        System.out.println(bm.isEmptyString());
        System.out.println(bm.isEvenNumber());
        System.out.println(bm.isValidPath());
        System.out.println(bm.isExistsFile());
    }
}
