package Lesson2;

public class Method {
    public static String getCurrName() {
        return Thread.currentThread().getStackTrace()[2].getMethodName();
    }
}
