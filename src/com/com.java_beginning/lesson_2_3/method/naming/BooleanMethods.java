package lesson_2_3.method.naming;

public class BooleanMethods {
    //boolean-методы (должны возвращать true или false)

    public boolean shouldContinue() {
        System.out.println(Method.getCurrName() + "() -> программа выполняется далее или завершается? " +
                false);
        return false;
    }

    public boolean isDeletedFile() {
        System.out.println(Method.getCurrName() + "() -> удалился ли файл на жестком диске или флешке? " +
                false);
        return false;
    }

    public boolean hasUniqueDigit() {
        System.out.println(Method.getCurrName() + "() -> последовательность содержит уникальную цифру? " +
                false);
        return false;
    }

    public boolean isLetter() {
        System.out.println(Method.getCurrName() + "() -> пользователь ввел букву или что-то другое?" +
                false);
        return false;
    }

    public boolean hasEqualDigits() {
        System.out.println(Method.getCurrName() + "() -> в проверяемых числах, есть равные цифры? " +
                false);
        return false;
    }

    public boolean isAttempts() {
        System.out.println(Method.getCurrName() + "() -> в игре \"Марио\" остались попытки? " +
                false);
        return false;
    }

    public boolean isEmptyString() {
        System.out.println(Method.getCurrName() + "() -> пользователь ввёл пустую строку или из одних " +
                "пробелов? " + false);
        return false;
    }

    public boolean isEvenNumber() {
        System.out.println(Method.getCurrName() + "() -> на кубике, который бросил компьютер, выпало" +
                " четное число? " + false);
        return false;
    }

    public boolean isValidPath() {
        System.out.println(Method.getCurrName() + "() -> путь до файла, который вы ищите на ssd," +
                " действительный? " + false);
        return false;
    }

    public boolean isExistsFile() {
        System.out.println(Method.getCurrName() + "() -> файл по указанному адресу" +
                " существует? " + false);
        return false;
    }
}
