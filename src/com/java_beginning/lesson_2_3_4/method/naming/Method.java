package com.java_beginning.lesson_2_3_4.method.naming;

public class Method {
    public static String getCurrName() {
        return Thread.currentThread().getStackTrace()[2].getMethodName();
    }
}
