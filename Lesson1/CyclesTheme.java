public class CyclesTheme {
    public static void main(String[] args) {
        System.out.println("1. Подсчет суммы четных и нечетных чисел");
        int start = -10;
        int startCopy = start;
        int end = 21;
        int evenSum = 0;
        int oddSum = 0;
        do {
            if (start % 2 == 0) {
                evenSum += start;
            } else {
                oddSum += start;
            }
            start++;
        } while (start <= end);
        System.out.println("В Отрезке [" + startCopy + ", " + end + "]" + " сумма четных чисел = " + evenSum +
                ", а нечетных = " + oddSum);

        System.out.println("\n2. Вывод чисел между min и max в порядке убывания");
        int a = -1;
        int b = 5;
        int c = 10;
        int max = 0;
        int min = 0;
        if (a < b) {
            max = b;
            min = a;
        }
        if (c < a) {
            min = c;
        }
        if (c > b) {
            max = c;
        }
        System.out.printf("%d %d\n", min, max);
        for (int i = max - 1; i > min; i--) {
            System.out.print(i + " ");
        }

        System.out.println("\n\n3. Вывод реверсивного числа и суммы его цифр");

        int number1 = 1234;
        int number1Copy = number1;
        int sum = 0;
        while (number1Copy > 0) {
            int digit = number1Copy % 10;
            System.out.print(digit + " ");
            sum += digit;
            number1Copy /= 10;
        }
        System.out.println("\nСумма цифр в числе " + number1 + " = " + sum);

        System.out.println("\n4. Вывод чисел в несколько строк");
        int endSegment = 24;
        int startSegment = 1;
        int counter = 0;
        int quantityElements = 5;
        for (int i = startSegment; i < endSegment; i++) {
            if (i % 2 != 0) {
                counter++;
                System.out.printf("%5d", i);
            }
            if (counter == quantityElements) {
                System.out.println();
                counter = 0;
            }
        }
        if (counter < quantityElements && counter != 0) {
            for (int i = 0; i < quantityElements - counter; i++) {
                System.out.printf("%5d", 0);
            }
        }

        System.out.println("\n\n5. Проверка количества двоек числа на четность/нечетность");
        int number3 = 3242522;
        int number3Copy = number3;
        int tensCount = 0;
        while (number3 > 0) {
            if (number3 % 10 == 2) {
                tensCount++;
            }
            number3 /= 10;
        }
        if (tensCount % 2 != 0) {
            System.out.println("В " + number3Copy + " нечетное " + "(" + tensCount + ")" + " количество двоек");
        } else {
            System.out.println("В " + number3Copy + " четное " + "(" + tensCount + ")" + " количество двоек");
        }

        System.out.println("\n6. Вывод геометрических фигур");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print('*' + " ");
            }
            System.out.println();
        }
        System.out.println();

        int counterString = 5;
        while (counterString >= 1) {
            int counterElem = 1;
            while (counterElem <= counterString) {
                System.out.print('#' + " ");
                counterElem++;
            }
            System.out.println();
            counterString--;
        }
        System.out.println();
        int heightTriangle = 3;
        int quantityStrings = 2 * heightTriangle - 1;
        int counterStrings = 1;
        int decreaseWidthString = 1;
        int widthString = 1;
        do {
            int counterElemString = 0;
            do {
                System.out.print("$");
            } while (++counterElemString < widthString);
            System.out.println();
            if (counterStrings == heightTriangle) decreaseWidthString = -1;
            widthString += decreaseWidthString;
        } while (++counterStrings <= quantityStrings);

        System.out.println("\n7. Вывод ASCII-символов");
        System.out.println("DECIMAL     " + "CHARACTER    " + "DESCRIPTION");
        for (int i = 33; i <= 47; i++) {
            if (i % 2 != 0) {
                System.out.printf("%4d            %s             %s%n", i, (char) i, Character.getName(i));
            }
        }
        for (int i = 97; i <= 122; i++) {
            if (i % 2 == 0) {
                System.out.printf("%4d            %s             %s%n", i, (char) i, Character.getName(i));
            }
        }

        System.out.println("\n8. Проверка, является ли число палиндромом");
        int numberTask8 = 1234321;
        int sumReverse = 0;
        int numberTask8Copy = numberTask8;
        while (numberTask8Copy > 0) {
            int lastDigit = numberTask8Copy % 10;
            sumReverse = (sumReverse * 10) + lastDigit;
            numberTask8Copy = numberTask8Copy / 10;
        }
        if (sumReverse == numberTask8) {
            System.out.println("Number " + numberTask8 + " palindrome");
        } else {
            System.out.println("Number " + numberTask8 + " not palindrome");
        }

        System.out.println("\n9. Проверка, является ли число счастливым");
        int happy = 123321;
        int happyCopy = happy;
        int counterDigits = 6;
        int sum1 = 0;
        int sum2 = 0;
        for (int i = 1; i <= counterDigits; i++) {
            if (i <= counterDigits / 2) {
                sum1 += happyCopy % 10;
                happyCopy /= 10;
            } else {
                sum2 += happyCopy % 10;
                happyCopy /= 10;
            }
        }
        System.out.println("Число " + happy + " - счастливое\n" + "Сумма цифр 123 = " + sum1 + "\n" +
                "Сумма 321 = " + sum2);

        System.out.println("\n10. Вывод таблицы умножения Пифагора\n");
        System.out.printf("%26s%n", "Таблица Пифагора");
        for (int i = 1; i < 10; i++) {
            if (i == 1) {
                System.out.printf("%s", " ");
            } else {
                System.out.printf("%1d", i);
            }
            for (int j = 1; j < 10; j++) {
                if (j == 1) {
                    System.out.printf("%s", " ");
                } else {
                    System.out.printf("%4d%s", j * i, " ");
                }
                if (j == 1) {
                    System.out.print("|");
                }
            }
            if (i == 1) {
                System.out.print("\n__________________________________________");
            }
            System.out.println();
        }
    }
}




