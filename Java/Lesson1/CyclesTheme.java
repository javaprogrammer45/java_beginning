package Lesson1;

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
        int originNumber = 1234;
        int currentNumber = originNumber;
        int sum = 0;
        while (currentNumber > 0) {
            int lastDigit = currentNumber % 10;
            System.out.print(lastDigit + " ");
            sum += lastDigit;
            currentNumber /= 10;
        }
        System.out.println("\nСумма цифр в числе " + originNumber + " = " + sum);

        System.out.println("\n4. Вывод чисел в несколько строк");
        end = 24;
        start = 1;
        int iterationCount = 0;
        int elementsString = 5;
        for (int i = start; i < end; i++) {
            if (i % 2 != 0) {
                iterationCount++;
                System.out.printf("%5d", i);
            }
            if (iterationCount == elementsString) {
                System.out.println();
                iterationCount = 0;
            }
        }
        if (iterationCount < elementsString && iterationCount != 0) {
            for (int i = 0; i < elementsString - iterationCount; i++) {
                System.out.printf("%5d", 0);
            }
        }

        System.out.println("\n\n5. Проверка количества двоек числа на четность/нечетность");
        originNumber = 3242522;
        currentNumber = originNumber;
        int tensCount = 0;
        while (currentNumber > 0) {
            if (currentNumber % 10 == 2) {
                tensCount++;
            }
            currentNumber /= 10;
        }
        if (tensCount % 2 != 0) {
            System.out.println("В " + currentNumber + " нечетное " + "(" + tensCount + ")" +
                    " количество двоек");
        } else {
            System.out.println("В " + currentNumber + " четное " + "(" + tensCount + ")" +
                    " количество двоек");
        }

        System.out.println("\n6. Вывод геометрических фигур");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print('*' + " ");
            }
            System.out.println();
        }
        System.out.println();

        int stringCount = 5;
        while (stringCount >= 1) {
            int elemCount = 1;
            while (elemCount <= stringCount) {
                System.out.print('#' + " ");
                elemCount++;
            }
            System.out.println();
            stringCount--;
        }
        System.out.println();
        int heightTriangle = 3;
        int quantityStrings = 2 * heightTriangle - 1;
        int stringsCount = 1;
        int decreaseWidthString = 1;
        int widthString = 1;
        do {
            int counterElemString = 0;
            do {
                System.out.print("$");
            } while (++counterElemString < widthString);
            System.out.println();
            if (stringsCount == heightTriangle) decreaseWidthString = -1;
            widthString += decreaseWidthString;
        } while (++stringsCount <= quantityStrings);

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
        originNumber = 1234321;
        int sumReverse = 0;
        currentNumber = originNumber;
        while (currentNumber > 0) {
            int lastDigit = currentNumber % 10;
            sumReverse = (sumReverse * 10) + lastDigit;
            currentNumber = currentNumber / 10;
        }
        if (sumReverse == originNumber) {
            System.out.println("Number " + originNumber + " palindrome");
        } else {
            System.out.println("Number " + originNumber + " not palindrome");
        }

        System.out.println("\n9. Проверка, является ли число счастливым");
        originNumber = 123321;
        currentNumber = originNumber;
        int counterDigits = 6;
        int sum1 = 0;
        int sum2 = 0;
        for (int i = 1; i <= counterDigits; i++) {
            if (i <= counterDigits / 2) {
                sum1 += currentNumber % 10;
                currentNumber /= 10;
            } else {
                sum2 += currentNumber % 10;
                currentNumber /= 10;
            }
        }
        String result = sum1 == sum2 ? "Число " + originNumber + " - счастливое\n" + "Сумма цифр 123 = " +
                sum1 + "\n" + "Сумма цифр 321 = " + sum2 : "Число не счастливое";
        System.out.println(result);

        System.out.println("\n10. Вывод таблицы умножения Пифагора");
        System.out.printf("%26s%n%n", "Таблица Пифагора");
        for (int i = 1; i < 10; i++) {
            if (i == 1) {
                System.out.printf("%4s", " ");
            } else {
                System.out.printf("%d", i);
            }
            for (int j = 1; j < 10; j++) {
                if (j == 1) {
                    System.out.printf("%s", " ");
                } else {
                    System.out.printf("%3d%s", j * i, " ");
                }
                if (j == 1 && i >= 2) {
                    System.out.printf("%3s", '|');
                }
            }
            if (i == 1) {
                System.out.print("\n     _______________________________");
            }
            System.out.println();
        }
    }
}




