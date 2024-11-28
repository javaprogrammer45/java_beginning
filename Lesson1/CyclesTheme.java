public class CyclesTheme {
    public static void main(String[] args) {
        System.out.println("1. Подсчет суммы четных и нечетных чисел");
        int start = -10;
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
        System.out.println("В Отрезке [" + start + ", " + end + "]" + " сумма четных чисел = " + evenSum +
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
            i--;
        }
        System.out.println();

        System.out.println("\n3. Вывод реверсивного числа и суммы его цифр");

        int number1 = 1234;
        int number1Copy = number1;
        int sum = 0;
        while (number1Copy != 0) {
            int result = number1Copy % 10;
            System.out.print(result + " ");
            sum += result;
            number1Copy /= 10;
        }
        System.out.println("\nСумма цифр в числе " + number1 + " = " + sum);

        System.out.println("\n4. Вывод чисел в несколько строк");
        int en = 30;
        int st = 1;
        int counter = 0;
        for (int i = st; i < en; i++) {
            if (i % 2 != 0) {
                counter++;
                System.out.printf("%5d", i);
            }
            if (counter % 5 == 0) {
                System.out.println();
                counter = 0;
            }
            if (i == en - 1) {
                for (int j = 0; j <= counter; j++) {
                    System.out.printf("%5d", 0);
                }
            }
        }
        System.out.println();

        System.out.println("\n5. Проверка количества двоек числа на четность/нечетность");
        int number3 = 3242522;
        int number4 = number3;
        int tensCount = 0;
        while (number3 > 0) {
            if (number3 % 10 == 2) {
                tensCount++;
            }
            number3 /= 10;
        }
        if (tensCount % 2 != 0) {
            System.out.println("В " + number4 + " нечетное " + "(" + tensCount + ")" + " количество двоек");
        } else {
            System.out.println("В " + number4 + " четное " + "(" + tensCount + ")" + " количество двоек");
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
        for (int j = 33; j <= 47; j++) {
            if (j % 2 != 0) {
                System.out.printf("%4d            %s             %s%n", j, (char) j, Character.getName(j));
            }
        }
        for (int v = 97; v <= 122; v++) {
            if (v % 2 == 0) {
                System.out.printf("%4d            %s%n", v, (char) v);
            }
        }

        System.out.println("\n8. Проверка, является ли число палиндромом");
        int pal = 1234321;
        StringBuilder builder = new StringBuilder();
        String str = builder.append(pal).reverse().toString();
        int reversedPal = Integer.parseInt(str);
        if (pal == reversedPal) {
            System.out.println("Число " + pal + " - полиндром");
        } else {
            System.out.println("Число " + pal + " - не полиндром");
        }

        System.out.println("\n9. Проверка, является ли число счастливым");
        int happy = 123321;
        int sum1 = 0;
        int sum2 = 0;
        String string = String.valueOf(happy);
        for (int e = 0; e < string.length(); e++) {
            if (e < string.length() / 2) {
                sum1 += Character.getNumericValue(string.charAt(e));
            } else {
                sum2 += Character.getNumericValue(string.charAt(e));
            }
        }
        System.out.println("Число " + happy + " - счастливое\n" + "Сумма цифр 123 = " + sum1 + "\n" +
                "Сумма 321 = " + sum2);

        System.out.println("\n10. Вывод таблицы умножения Пифагора");
        System.out.printf("%30s%n", "Таблица Пифагора");
        for (int l = 1; l < 10; l++) {
            for (int k = 1; k < 10; k++) {
                System.out.print("\t" + k * l);
            }
            System.out.println();
        }
    }
}




