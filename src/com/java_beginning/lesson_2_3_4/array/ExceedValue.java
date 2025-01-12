package com.java_beginning.lesson_2_3_4.array;

import java.util.Arrays;

public class ExceedValue {
    public static void main(String[] args) {
        ExceedValue exceedValue = new ExceedValue();
        exceedValue.print(exceedValue.changeArray(-1), "Изменённый массив");
        exceedValue.print(exceedValue.changeArray(15), "Изменённый массив");
        exceedValue.print(exceedValue.changeArray(-0), "Изменённый массив");
        exceedValue.print(exceedValue.changeArray(14), "Изменённый массив");
    }

    private float[] fillSourceArray() {
        float[] array = new float[15];
        for (int i = 0; i < array.length; i++) {
            array[i] = (float) Math.random();
        }
        return array;
    }

    private float[] changeArray(int index) {
        float[] sourceArray = fillSourceArray();
        if (index < 0) {
            System.out.println("Ошибка: индекс не может быть отрицательным (" + index + ")\n\n");
            return null;
        }
        if (index >= sourceArray.length) {
            System.out.println("Ошибка: текущий индекс (" + index + ") должен быть >= 0 и < 15\n\n");
            return null;
        }
        for (int i = 0; i < sourceArray.length; i++) {
            if (sourceArray[i] > sourceArray[index]) {
                sourceArray[i] = 0;
            }
            if (i == sourceArray.length - 1) {
                System.out.printf("%s%d%s%.3f%n", "значение из ячейки по переданному индексу  [", index, "]: ", sourceArray[index]);
            }
        }
        return sourceArray;
    }

    private void print(float[] changedArray, String changeArray) {
        if (changedArray == null) {
            System.out.println("Массив null\n");
            return;
        }
        for (int i = 0; i < 2; i++) {
            float[] arrayPrint = Arrays.copyOf(fillSourceArray(), fillSourceArray().length);
            if (i == 1) {
                arrayPrint = Arrays.copyOf(changedArray, changedArray.length);
                System.out.println(changeArray);
            }
            int zeroElements = 0;
            for (int j = 0; j < arrayPrint.length; j++) {
                if (j == 8) {
                    System.out.println();
                }
                if (j == arrayPrint.length - 1) {
                    System.out.printf("%.3f%n", arrayPrint[j]);
                    break;
                }
                if (arrayPrint[j] == 0) {
                    zeroElements++;
                }
                System.out.printf("%.3f%s", changedArray[j], ", ");
            }
            if (i == 1) {
                System.out.println("Количество обнулённых ячеек =  " + zeroElements + "\n\n");
            }
        }
    }
}