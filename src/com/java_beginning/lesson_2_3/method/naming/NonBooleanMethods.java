package com.java_beginning.lesson_2_3.method.naming;

public class NonBooleanMethods {
    //Не boolean-методы

    public void findLongestWord() {
        System.out.println(Method.getCurrName() + "() -> найти самое длинное слово в предложении из" +
                " книги по Java");
    }

    public void selectMenuItem() {
        System.out.println(Method.getCurrName() + "() -> выбрать пункт меню в текстовом" +
                " редакторе на macOS");
    }

    public void calculateAverageGrades() {
        System.out.println(Method.getCurrName() + "() -> вычислить среднее значение оценок в школе №1234");
    }

    public void countUniqueWords() {
        System.out.println(Method.getCurrName() + "() -> подсчитать количество уникальных" +
                " слов в \"Война и Мир\"");
    }

    public void displayErrorMessage() {
        System.out.println(Method.getCurrName() + "() -> вывести сообщение об ошибке");
    }

    public void sync() {
        System.out.println(Method.getCurrName() + "() -> синхронизировать данные с облачным хранилищем");
    }

    public void restoreData() {
        System.out.println(Method.getCurrName() + "() ->восстановить данные из резервной копии " +
                "от 11.03.2024");
    }

    public void pauseDownloading() {
        System.out.println(Method.getCurrName() + "() -> приостановить загрузку mp3-файла группы \"Ария\"");
    }

    public void resetFactorySettings() {
        System.out.println(Method.getCurrName() + "() -> сбросить настройки до заводских для пылесоса Mi");
    }

    public void writeToFile() {
        System.out.println(Method.getCurrName() + "() -> записать содержимое в файл по" +
                " указанному пути на флешку");
    }

    public void toFahrenheit() {
        System.out.println(Method.getCurrName() + "() -> преобразовать температуру" +
                " из Цельсия в Фаренгейт");
    }

    public void enterMathExpr() {
        System.out.println(Method.getCurrName() + "() -> ввести математическое выражение с" +
                " тремя аргументами");
    }

    public void determineWinner() {
        System.out.println(Method.getCurrName() + "() -> выявить победителя среди гонщиков игры" +
                " \"Need For Speed\"");
    }

    public void findBookByAuthor() {
        System.out.println(Method.getCurrName() + "() -> найти книгу по имени писателя\n");
    }
}
