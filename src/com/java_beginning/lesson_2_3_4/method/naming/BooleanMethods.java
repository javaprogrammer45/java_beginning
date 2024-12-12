package com.java_beginning.lesson_2_3_4.method.naming;

public class BooleanMethods {
    //boolean-методы (должны возвращать true или false)

    public boolean shouldContinue() {
        System.out.print(Method.getCurrName() + "() -> программа выполняется далее или завершается? ");
        return false;
    }

    public boolean isDeletedFile() {
        System.out.print(Method.getCurrName() + "() -> удалился ли файл на жестком диске или флешке? ");
        return false;
    }

    public boolean hasUniqueDigit() {
        System.out.print(Method.getCurrName() + "() -> последовательность содержит уникальную цифру? ");
        return false;
    }

    public boolean isLetter() {
        System.out.print(Method.getCurrName() + "() -> пользователь ввел букву или что-то другое? ");
        return false;
    }

    public boolean hasEqualDigits() {
        System.out.print(Method.getCurrName() + "() -> в проверяемых числах, есть равные цифры? ");
        return false;
    }

    public boolean isAttempts() {
        System.out.print(Method.getCurrName() + "() -> в игре \"Марио\" остались попытки? ");
        return false;
    }

    public boolean isEmptyString() {
        System.out.print(Method.getCurrName() + "() -> пользователь ввёл пустую строку или из одних " +
                "пробелов? ");
        return false;
    }

    public boolean isEvenNumber() {
        System.out.print(Method.getCurrName() + "() -> на кубике, который бросил компьютер, выпало" +
                " четное число? ");
        return false;
    }

    public boolean isValidPath() {
        System.out.print(Method.getCurrName() + "() -> путь до файла, который вы ищите на ssd," +
                " действительный? ");
        return false;
    }

    public boolean isExistsFile() {
        System.out.print(Method.getCurrName() + "() -> файл по указанному адресу" +
                " существует? ");
        return false;
    }
}
