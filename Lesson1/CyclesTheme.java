public class CyclesTheme {
    public static void main(String[] args) {
        System.out.println("1. Подсчет суммы четных и нечетных чисел");
        int start = -10;
        int end = 21;
        int amountEven = 0;
        int amountOdd = 0;
        do {
            if (start % 2 == 0) {
                amountEven += start;
            } else {
                amountOdd += start;
            }
            start++;
        } while (start < end);
        System.out.println(amountEven);
        System.out.println(amountOdd);

        System.out.println("\n2. Вывод чисел между min и max в порядке убывания");
        int a = -1;
        int b = 5;
        int c = 10;
        int max;
        int min;
        if (a < b && a < c) {
            min = a;
        } else if (b < c && b < a) {
            min = b;
        } else {
            min = c;
        }
        if (a > b && a > c) {
            max = a;
        } else if (b > c && b > a) {
            max = b;
        } else {
            max = c;
        }
        for (int i = max - 1; i > min; i--) {
            System.out.print(i + " ");
        }

        System.out.println("\n3. Вывод реверсивного числа и суммы его цифр");
        int number = 1234;
        int count = 0;
        int amount = 0;
        while (count < 4) {
            if (count == 0) {
                amount += number % 10;
                count++;
                System.out.print(number % 10 + " ");
            } else if (count == 1) {
                amount += number % 100 / 10;
                count++;
                System.out.print(number % 100 / 10 + " ");
            } else if (count == 2) {
                amount += number % 1000 / 100;
                count++;
                System.out.print(number % 1000 / 100 + " ");
            } else if (count == 3) {
                amount += number % 10000 / 1000;
                count++;
                System.out.print(number % 10000 / 1000 + " " + "\n" + amount);
            }
        }

        System.out.println("\n4. Вывод чисел в несколько строк");
        int f = 24;
        for (int i = 0; i < f; i++) {
            if (i % 2 != 0) {
                System.out.printf("%d %d %d %d %d%n", i, 0, 0, 0, 0);
            }
        }

        System.out.println("\n5. Проверка количества двоек числа на четность/нечетность");
        int num = 3242592;
        int num2 = num;
        int g = 0;
        while (num != 0) {
            int result = num % 10;
            num /= 10;
            if (result == 2) {
                g++;
            }
        }
        if (g % 2 == 0) {
            System.out.println("В " + num2 + " четное " + "(" + g + ")" + " количество двоек");
        } else {
            System.out.println("В " + num2 + " нечетное " + "(" + g + ")" + " количество двоек");
        }

        System.out.println("\n6. Вывод геометрических фигур");
        /*
        Если нужно, я уберу пробелы в фигурах
         */
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print('*' + " ");
            }
            System.out.println();
        }
        System.out.println();
        int i = 5;
        while (i >= 1) {
            int j = 1;
            while (j <= i) {
                System.out.print('#' + " ");
                j++;
            }
            System.out.println();
            i--;
        }
        System.out.println();

        int n = 3;
        int m = 2 * n - 1;
        int k = 1;
        int d = 1;
        int w = 1;
        do {
            int j = 0;
            do {
                System.out.print("$");
            } while (++j < w);
            System.out.println();
            if (k == n) d = -1;
            w += d;
        } while (++k <= m);

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
            for (k = 1; k < 10; k++) {
                System.out.print("\t" + k * l);
            }
            System.out.println();
        }
    }
}




