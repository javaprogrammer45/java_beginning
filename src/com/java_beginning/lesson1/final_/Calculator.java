package com.java_beginning.lesson1.final_;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        char sign = sc.next().charAt(0);
        int c = sc.nextInt();
        int result = 0;
        if (sign == '^') {
            result = 1;
            for (int i = 1; i <= c; i++) {
                result *= a;
            }
        } else if (sign == '%') {
            result = a % c;
        } else if (sign == '+') {
            result = a + c;
        } else if (sign == '-') {
            result = a - c;
        } else if (sign == '*') {
            result = a * c;
        } else if (sign == '/') {
            result = a / c;
        }
        System.out.println(a + " " + sign + " " + c + " = " + result);
    }
}
