package com.java_beginnin.lesson1.base;

public class VariablesTheme {
    public static void main(String[] args) {
        System.out.println("1. Вывод характеристик компьютера");
        byte processCores = 6;
        short socketsProcessor = 1;
        int logicalProcessors = 6;
        long osBits = 64;
        float rom = 8.00f;
        double baseSpeed = 2.38;
        char hardDrive = 'C';
        boolean isHardDriveEnabled = true;
        System.out.println("Колличество ядер процессора - " + processCores + "\n" + "Сокеты - " +
                socketsProcessor + "\n" + "Логические процесооры - " + logicalProcessors +
                "\n" + "Колличество разрядов операционной ситемы - " + osBits + "\n" +
                "Оперативная память - " + rom + "\n" + "Базовая скорость центрального процессора - " +
                baseSpeed + "\n" + "Жёсткий диск - " + hardDrive + "\n" + "Жёсткий диск включен? - " +
                isHardDriveEnabled);

        System.out.println("\n2. Расчет стоимости товара со скидкой");
        float costPen = 105.5f;
        float costBook = 235.83f;
        float baseCost = costPen * costBook;
        float discountAmount = (baseCost / 100) * 11;
        float discountPrice = baseCost - discountAmount;
        System.out.println("Стоимость товаров без скидки = " + baseCost + "\n" +
                "Сумма скидки = " + discountAmount + "\n" +
                "Стоимость товаров со скидкой = " + discountPrice);

        System.out.println("\n3. Вывод слова JAVA");
        System.out.println("   J     a  V     V  a");
        System.out.println("   J    a a  V   V  a a");
        System.out.println("J  J   aaaaa  V V  aaaaa");
        System.out.println(" JJ  a      a  V  a     a");

        System.out.println("\n4. Вывод min и max значений целых числовых типов");
        byte byteMax = 127;
        System.out.println("первоначальное значение = " + byteMax + "\n" +
                "значение после инкремента на единицу = " + ++byteMax + "\n" +
                "значение после декремента на единицу = " + --byteMax);
        short shortMax = 32767;
        System.out.println("первоначальное значение = " + shortMax + "\n" +
                "значение после инкремента на единицу = " + ++shortMax + "\n" +
                "значение после декремента на единицу = " + --shortMax);
        int intMax = 2147483647;
        System.out.println("первоначальное значение = " + intMax + "\n" +
                "значение после инкремента на единицу = " + ++intMax + "\n" +
                "значение после декремента на единицу = " + --intMax);
        long longMax = 9223372036854775807L;
        System.out.println("первоначальное значение = " + longMax + "\n" +
                "значение после инкремента на единицу = " + ++longMax + "\n" +
                "значение после декремента на единицу = " + --longMax);
        char charMax = 65535;
        System.out.println("первоначальное значение = " + (int) charMax + "\n" +
                "значение после инкремента на" + " единицу = " + (int) ++charMax + "\n" +
                "значение после декремента на единицу = " + (int) --charMax);

        System.out.println("\n5. Перестановка значений переменных");
        int a = 2;
        int b = 5;
        System.out.println(a + "\n" + b);
        System.out.println("С помощью третьей переменной");
        int swap = a;
        a = b;
        b = swap;
        System.out.println(a + "\n" + b);
        System.out.println("С помощью арифметических операций");
        a = a + b - (b = a);
        System.out.println(a + "\n" + b);
        System.out.println("С помощью побитовой операции ^");
        a ^= b;
        b ^= a;
        a ^= b;
        System.out.println(a + "\n" + b);
        System.out.println(" ");

        System.out.println("\n6. Вывод символов и их кодов");
        char dollar = '$';
        char star = '*';
        char at = '@';
        char pipe = '|';
        char tilde = '~';
        System.out.println("Code thirtySix = " + (int) dollar + "\n" + "Code fortyTwo =  " +
                (int) star + "\n" +
                "Code sixtyFour =  " + (int) at + "\n" + "Code hundredTwentyFour = " + (int) pipe + "\n" +
                "Code hundred twentySix = " + (int) tilde);

        System.out.println(" " + "\n" + "7. Вывод в консоль ASCII-арт Дюка");
        char slash = '/';
        char backSlash = '\\';
        char leftParenthesis = '(';
        char rightParenthesis = ')';
        char underscore = '_';
        System.out.println("     " + slash + " " + backSlash);
        System.out.println("    " + slash + "   " + backSlash);
        System.out.println("   " + slash + underscore + leftParenthesis + " " + rightParenthesis +
                " " + backSlash);
        System.out.println("  " + slash + "       " + backSlash);
        System.out.println(" " + slash + underscore + underscore + underscore + underscore + slash + " " +
                backSlash + underscore + underscore + backSlash);

        System.out.println("\n8. Манипуляции с сотнями, десятками и единицами числа");
        int num = 123;
        int hundreds = num / 100;
        int tens = (num % 100) / 10;
        int ones = num % 10;
        System.out.println("Число 123 содержит: " + "\n" + " сотен - " + hundreds + "\n" + " десятков -" +
                tens + "\n" + " единиц - " + ones + "\n" + " Сумма разрядов = " +
                (hundreds + tens + ones) + "\n" + " Произведение разрядов = " + (hundreds * tens * ones));

        System.out.println("\n9. Перевод секунд в часы, минуты и секунды");
        int time = 86399;
        int hh = time / 3600;
        int mm = time % 3600 / 60;
        int ss = time % 60;
        System.out.println(hh + ":" + mm + ":" + ss);
    }
}


