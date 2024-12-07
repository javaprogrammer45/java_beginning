package Lesson2;

public class BooleanMethod {
    //boolean-методы (должны возвращать true или false)

    public boolean shouldContinue() {
        System.out.println(Method.getCurrName() + "() -> программа выполняется далее или завершается?");
        return false;
    }

    public boolean isDeletedFile() {
        System.out.println(Method.getCurrName() + "() -> удалился ли файл на жестком диске или флешке?");
        return false;
    }

    public boolean hasUniqueDigit() {
        System.out.println(Method.getCurrName() + "() -> последовательность содержит уникальную цифру?");
        return false;
    }

    public boolean isLetter() {
        System.out.println(Method.getCurrName() + "() -> пользователь ввел букву или что-то другое?");
        return false;
    }

    public boolean hasEqualDigits() {
        System.out.println(Method.getCurrName() + "() -> в проверяемых числах, есть равные цифры?");
        return false;
    }

    public boolean isAttempts() {
        System.out.println(Method.getCurrName() + "() -> в игре \"Марио\" остались попытки?");
        return false;
    }

    public boolean isEmptyString() {
        System.out.println(Method.getCurrName() + "() -> пользователь ввёл пустую строку или из одних пробелов?");
        return false;
    }

    public boolean isEvenNumber() {
        System.out.println(Method.getCurrName() + "() -> на кубике, который бросил компьютер, выпало четное число?");
        return false;
    }

    public boolean isValidPath() {
        System.out.println(Method.getCurrName() + "() -> путь до файла, который вы ищите на ssd, действительный?");
        return false;
    }

    public boolean isExistsFile() {
        System.out.println(Method.getCurrName() + "() -> файл по указанному адресу существует?\n");
        return false;
    }
}
