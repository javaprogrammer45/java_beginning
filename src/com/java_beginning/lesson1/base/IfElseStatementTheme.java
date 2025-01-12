package com.java_beginnin.lesson1.base;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class IfElseStatementTheme {
    public static void main(String[] args) {
        System.out.println("1. Перевод псевдокода на язык Java");
        boolean isMaleGender = false;
        if (!isMaleGender) {
            System.out.println("Male gender");
        } else {
            System.out.println("Female gender");
        }
        int age = 18;
        if (age > 18) {
            System.out.println("He(she) is adult");
        } else {
            System.out.println("He(she) is child");
        }
        float height = 1.0f;
        if (height < 1.8) {
            System.out.println("Height is less than 1.8");
        } else {
            System.out.println("Height is greater than 1.8");
        }
        String name = "Andrey";
        char firstLetterOfName = name.charAt(0);
        if (firstLetterOfName == 'M') {
            System.out.println("His name is Misha.");
        } else if (firstLetterOfName == 'I') {
            System.out.println("His name is Igor.");
        } else {
            System.out.println("Everything will be fine! ");
        }

        System.out.println("\n2. Поиск большего числа");
        int first = 7;
        int second = 9;
        if (first < second) {
            System.out.println(second + "  greater than  " + first);
        } else if (first > second) {
            System.out.println(first + "  greater than  " + second);
        } else {
            System.out.println(first + " ==  " + second);
        }

        System.out.println("\n3. Проверка числа");
        int number = 7;
        if (number == 0) {
            System.out.println("The number is zero");
        } else {
            if (number < 0) {
                System.out.println(number + " - negative");
            } else {
                System.out.println(number + " - positive");
            }
            if (number % 2 == 0) {
                System.out.println(number + " - even");
            } else {
                System.out.println(number + " - odd");
            }
        }

        System.out.println("\n4. Поиск одинаковых цифр в числах");
        int number1 = 123;
        int number2 = 223;
        System.out.println("Исходные числа : " + number1 + " и " + number2);
        if (number1 == number2) {
            System.out.println("Числа равны. Цифры и разряды равны!!!");
        } else {
            if (number1 % 10 == number2 % 10) {
                System.out.println("Разряды под номером один - равны -> " + number1 % 10 +
                        " = " + number2 % 10);
            }
            if (number1 / 10 % 10 == number2 / 10 % 10) {
                System.out.println("Разряды под номером два - равны -> " + number1 / 10 % 10 +
                        " = " + number2 / 10 % 10);
            }
            if (number1 / 100 % 10 == number2 / 100 % 10) {
                System.out.println("Разряды под номером три - равны -> " + number1 / 100 % 10 +
                        " = " + number2 / 100 % 10);
            }
        }

        System.out.println("\n5. Определение символа по его коду");
        char code = '\u0031';
        if (Character.isUpperCase(code)) {
            System.out.println("This is the letter in the upperCase: '" + code + "'");
        } else if (Character.isLowerCase(code)) {
            System.out.println("This is the letter in the lowerCase: '" + code + "'");
        } else if (Character.isDigit(code)) {
            System.out.println("This is number: '" + code + "'");
        } else {
            System.out.println("Neither is a letter nor a number: '" + code + "'");
        }

        System.out.println("\n6. Подсчет начисленных банком %");
        float deposit = 321123.59f;
        float interestRate = (float) 5;
        if (deposit >= 100000f && deposit <= 300000f) {
            interestRate = (float) 7;
        } else if (deposit > 300000f) {
            interestRate = (float) 10;
        }
        float totalAmount = ((deposit / (float) 100) * interestRate) + deposit;
        System.out.println("Сумма вклада = " + deposit + "\nСумма начисленного процента = " +
                (totalAmount - deposit) + "\nИтоговая сумма с % = " + totalAmount);

        System.out.println("\n7. Определение оценки по предметам");
        int percentHistory = 59;
        int gradeHistory = 2;
        if (percentHistory > 60) {
            gradeHistory = 3;
        } else if (percentHistory > 73) {
            gradeHistory = 4;
        } else if (percentHistory > 91) {
            gradeHistory = 5;
        }
        int percentProgramming = 92;
        int gradeProgramming = 5;
        if (percentProgramming <= 60) {
            gradeProgramming = 2;
        } else if (percentProgramming > 60) {
            gradeProgramming = 3;
        } else if (percentProgramming > 73) {
            gradeProgramming = 4;
        }
        float averageGrade = (float) (gradeProgramming + gradeHistory) / 2;
        float averagePercent = (float) (percentHistory + percentProgramming) / 2;
        System.out.println("History: " + gradeHistory + "\n" + "Programming: " + gradeProgramming + "\n" +
                "Average grade: " + averageGrade + "\n" + "Average percent: " + averagePercent);

        System.out.println("\n8. Расчет годовой прибыли");
        float goodsSoldMonthly = 13025.233f;
        float premisesRentalMonthly = 5123.018f;
        float productionCostMonthly = 9001.729f;
        float profitYear = (goodsSoldMonthly - (premisesRentalMonthly + productionCostMonthly)) * 12;
        if (profitYear > 0) {
            System.out.println("Profit for the year is:  " + "+" + profitYear);
        } else {
            System.out.println("Profit for the year is:  " + profitYear);
        }

        System.out.println("\n9. Расчет годовой прибыли");
        BigDecimal goodsSoldMonthlyBigD = new BigDecimal("13025.233");
        BigDecimal premisesRentalMonthlyBigD = new BigDecimal("5123.018");
        BigDecimal productionCostMonthlyBigD = new BigDecimal("9001.729");
        BigDecimal profitYearBigD = (goodsSoldMonthlyBigD.subtract(premisesRentalMonthlyBigD.add(productionCostMonthlyBigD))
                .multiply(BigDecimal.valueOf(12)));
        if (profitYearBigD.doubleValue() > 0) {
            System.out.println("Profit for the year is:  " + "+" + profitYearBigD);
        } else {
            System.out.println("Profit for the year is:  " + profitYearBigD);
        }

        System.out.println("\n10. Подсчет начисленных банком %");
        BigDecimal depositBigD = new BigDecimal("321123.59");
        BigDecimal interestRateBigD = BigDecimal.valueOf(5);
        if (depositBigD.doubleValue() >= 100000f && depositBigD.floatValue() <= 300000f) {
            interestRateBigD = BigDecimal.valueOf(7);
        } else if (depositBigD.floatValue() > 300000f) {
            interestRateBigD = BigDecimal.valueOf(10);
        }
        BigDecimal totalAmountBigD = (depositBigD.divide(new BigDecimal("100")).multiply(interestRateBigD)
                .add(depositBigD).setScale(3, RoundingMode.HALF_UP));
        System.out.println("Сумма вклада = " + depositBigD + "\nСумма начисленного процента = " +
                totalAmountBigD.subtract(depositBigD).setScale(3, RoundingMode.HALF_UP) +
                "\nИтоговая сумма с % = " + totalAmountBigD.setScale(3, RoundingMode.HALF_UP));
    }
}
