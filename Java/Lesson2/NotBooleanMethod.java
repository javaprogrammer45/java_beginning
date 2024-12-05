package Lesson2;

public class NotBooleanMethod {
    //Не boolean-методы

    public void notBooleanMethod() {
        findLongestWordBookJava();
        selectMenuItemMacOS();
        calculateAverageGradesSchool1234();
        countNumberUniqueWordsWarAndPeace();
        displayErrorMessage();
        synchronizeDataCloudStorage();
        restoreDataBackup_03_11_2024();
        pauseDownloadingMp3FileGroup_Aria();
        resetFactorySettingsMiVacuum();
        writeContentsToFilePathFlashDrive();
        convertTemperatureCelsiusToFahrenheit();
        enterMathematicalExpressionThreeArguments();
        identifyWinnerRacers_NeedForSpeed();
        findBookWritersName();
    }

    private void findLongestWordBookJava() {
        System.out.println(getNameMethod() + "() -> найти самое длинное слово в предложении из" +
                " книги по Java");
    }

    private void selectMenuItemMacOS() {
        System.out.println(getNameMethod() + "() -> выбрать пункт меню в текстовом редакторе на macOS");
    }

    private void calculateAverageGradesSchool1234() {
        System.out.println(getNameMethod() + "() -> вычислить среднее значение оценок в школе №1234");
    }

    private void countNumberUniqueWordsWarAndPeace() {
        System.out.println(getNameMethod() + "() -> подсчитать количество уникальных слов в \"Война и Мир\"");
    }

    private void displayErrorMessage() {
        System.out.println(getNameMethod() + "() -> вывести сообщение об ошибке");
    }

    private void synchronizeDataCloudStorage() {
        System.out.println(getNameMethod() + "() -> синхронизировать данные с облачным хранилищем");
    }

    private void restoreDataBackup_03_11_2024() {
        System.out.println(getNameMethod() + "() ->восстановить данные из резервной копии от 11.03.2024");
    }

    private void pauseDownloadingMp3FileGroup_Aria() {
        System.out.println(getNameMethod() + "() -> приостановить загрузку mp3-файла группы \"Ария\"");
    }

    private void resetFactorySettingsMiVacuum() {
        System.out.println(getNameMethod() + "() -> сбросить настройки до заводских для пылесоса Mi");
    }

    private void writeContentsToFilePathFlashDrive() {
        System.out.println(getNameMethod() + "() -> записать содержимое в файл по указанному пути на флешку");
    }

    private void convertTemperatureCelsiusToFahrenheit() {
        System.out.println(getNameMethod() + "() -> преобразовать температуру из Цельсия в Фаренгейт");
    }

    private void enterMathematicalExpressionThreeArguments() {
        System.out.println(getNameMethod() + "() -> ввести математическое выражение с тремя аргументами");
    }

    private void identifyWinnerRacers_NeedForSpeed() {
        System.out.println(getNameMethod() + "() -> выявить победителя среди гонщиков игры" +
                " \"Need For Speed\"");
    }

    private void findBookWritersName() {
        System.out.println(getNameMethod() + "() -> найти книгу по имени писателя\n");
    }

    private static String getNameMethod() {
        return Thread.currentThread().getStackTrace()[2].getMethodName();
    }
}
