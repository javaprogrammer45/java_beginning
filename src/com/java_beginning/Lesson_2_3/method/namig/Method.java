package Lesson_2_3.method.namig;

public class Method {
    public static String getCurrName() {
        return Thread.currentThread().getStackTrace()[2].getMethodName();
    }
}
