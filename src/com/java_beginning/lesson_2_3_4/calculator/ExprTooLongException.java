package com.java_beginning.lesson_2_3_4.calculator;

public class ExprTooLongException extends RuntimeException {
    public ExprTooLongException(String message) {
        super(message);
    }
}
