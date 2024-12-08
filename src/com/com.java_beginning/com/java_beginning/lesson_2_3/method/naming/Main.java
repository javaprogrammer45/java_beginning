package com.java_beginning.lesson_2_3.method.naming;

public class Main {
    NonBooleanMethods nonBm = new NonBooleanMethods();
    BooleanMethods bm = new BooleanMethods();

    public void executeNonBooleanMethod() {
        nonBm.findLongestWord();
        nonBm.selectMenuItem();
        nonBm.calculateAverageGrades();
        nonBm.countNumberUniqueWords();
        nonBm.displayErrorMessage();
        nonBm.synchronizeData();
        nonBm.restoreData();
        nonBm.pauseDownloading();
        nonBm.resetFactorySettings();
        nonBm.writeContents();
        nonBm.convertTemperature();
        nonBm.enterMathematicalExpression();
        nonBm.identifyWinner();
        nonBm.findBook();
    }

    public void executeBooleanMethod() {
        bm.shouldContinue();
        bm.isDeletedFile();
        bm.hasUniqueDigit();
        bm.isLetter();
        bm.hasEqualDigits();
        bm.isAttempts();
        bm.isEmptyString();
        bm.isEvenNumber();
        bm.isValidPath();
        bm.isExistsFile();
    }

    public static void main(String[] args) {
        Main m = new Main();
        m.executeNonBooleanMethod();
        m.executeBooleanMethod();
    }
}
