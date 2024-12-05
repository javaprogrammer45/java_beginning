package Lesson2;

public class BooleanMethod {
    //boolean-методы (должны возвращать true или false)

    public void booleanMethod() {
        shouldContinue();
        isDeletedFile();
        hasUniqueDigit();
        isLetter();
        hasEqualDigits();
        isAttempts();
        isEmptyString();
        isEvenNumber();
        isValidPath();
        isExistsFile();
    }

    private boolean shouldContinue() {
        System.out.println(getNameMethod() + "() -> программа выполняется далее или завершается?");
        return false;
    }

    private boolean isDeletedFile() {
        System.out.println(getNameMethod() + "() -> удалился ли файл на жестком диске или флешке?");
        return false;
    }

    private boolean hasUniqueDigit() {
        System.out.println(getNameMethod() + "() -> последовательность содержит уникальную цифру?");
        return false;
    }

    private boolean isLetter() {
        System.out.println(getNameMethod() + "() -> пользователь ввел букву или что-то другое?");
        return false;
    }

    private boolean hasEqualDigits() {
        System.out.println(getNameMethod() + "() -> в проверяемых числах, есть равные цифры?");
        return false;
    }

    private boolean isAttempts() {
        System.out.println(getNameMethod() + "() -> в игре \"Марио\" остались попытки?");
        return false;
    }

    private boolean isEmptyString() {
        System.out.println(getNameMethod() + "() -> пользователь ввёл пустую строку или из одних пробелов?");
        return false;
    }

    private boolean isEvenNumber() {
        System.out.println(getNameMethod() + " () -> на кубике, который бросил компьютер, выпало четное число?");
        return false;
    }

    private boolean isValidPath() {
        System.out.println(getNameMethod() + "() -> путь до файла, который вы ищите на ssd, действительный?");
        return false;
    }

    private boolean isExistsFile() {
        System.out.println(getNameMethod() + "() -> файл по указанному адресу существует?\n");
        return false;
    }

    private static String getNameMethod() {
        return Thread.currentThread().getStackTrace()[2].getMethodName();
    }
}
