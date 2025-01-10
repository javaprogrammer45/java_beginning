package com.java_beginning.lesson_2_3_4.array;

import java.util.Arrays;

public class ExceedValue {
    public static void main(String[] args) {
        ExceedValue exceedValue = new ExceedValue();
        exceedValue.print(exceedValue.fillSourceArray(),
                exceedValue.changeArray(exceedValue.fillSourceArray(), -1), "Изменённый массив");
        exceedValue.print(exceedValue.fillSourceArray(),
                exceedValue.changeArray(exceedValue.fillSourceArray(), 15), "Изменённый массив");
        exceedValue.print(exceedValue.fillSourceArray(),
                exceedValue.changeArray(exceedValue.fillSourceArray(), -0), "Изменённый массив");
        exceedValue.print(exceedValue.fillSourceArray(),
                exceedValue.changeArray(exceedValue.fillSourceArray(), 14), "Изменённый массив");
    }

    private float[] fillSourceArray() {
        float[] array = new float[15];
        for (int i = 0; i < array.length; i++) {
            array[i] = (float) Math.random();
        }
        return array;
    }

    private float[] changeArray(float[] sourceArray, int index) {
        if (index < 0) {
            System.out.println("Отрицательный индекс. Индекс = " + index + "\n\n");
            return null;
        }
        if (index >= sourceArray.length) {
            System.out.println("Индекс должен быть меньше (15) и больше или равно (0). Индекс = " + index + "\n\n");
            return null;
        }
        for (int i = 0; i < sourceArray.length; i++) {
            if (sourceArray[i] > sourceArray[index]) {
                sourceArray[i] = 0;
            }
            if (i == sourceArray.length - 1) {
                System.out.printf("%s%.3f%n", "значение из ячейки по переданному индексу  ", sourceArray[index]);
            }
        }
        return sourceArray;
    }

    private void print(float[] sourceArray, float[] changedArray, String changeArray) {
        if (changedArray == null) {
            System.out.println("Массив null\n");
            return;
        }
        for (int i = 0; i < 2; i++) {
            float[] arrayPrint = Arrays.copyOf(sourceArray, sourceArray.length);
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