package com.java_beginning.lesson_2_3_4.calculator;

public class IncorrectMathSignException extends RuntimeException {
    public IncorrectMathSignException(String message) {
        super(message);
    }
}
