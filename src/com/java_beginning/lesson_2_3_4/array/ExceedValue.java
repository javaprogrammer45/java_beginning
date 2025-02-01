package com.java_beginning.lesson_2_3_4.array;

public class ExceedValue {
    public static void main(String[] args) {
        ExceedValue exceedValue = new ExceedValue();
        exceedValue.print(exceedValue.fillSourceArray(), exceedValue.changeArray(-1),
                "Изменённый массив", -1);
        exceedValue.print(exceedValue.fillSourceArray(), exceedValue.changeArray(15),
                "Изменённый массив", 15);
        exceedValue.print(exceedValue.fillSourceArray(), exceedValue.changeArray(-0),
                "Изменённый массив", -0);
        exceedValue.print(exceedValue.fillSourceArray(), exceedValue.changeArray(14),
                "Изменённый массив", 14);
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
            System.out.println("Ошибка: индекс не может быть отрицательным (" + index + ")");
            return sourceArray;
        }
        if (index >= sourceArray.length) {
            System.out.println("Ошибка: текущий индекс (" + index + ") должен быть >= 0 и < 15");
            return sourceArray;
        }
        for (int i = 0; i < sourceArray.length; i++) {
            if (sourceArray[i] > sourceArray[index]) {
                sourceArray[i] = 0;
            }
            if (i == sourceArray.length - 1) {
                System.out.printf("%s%d%s%.3f%n", "значение из ячейки по переданному индексу  [", index, "]: ",
                        sourceArray[index]);
            }
        }
        return sourceArray;
    }

    private void print(float[] sourceArray, float[] changedArray, String changeArray, int index) {
        if (changedArray == null) {
            System.out.println("Массив null\n");
            return;
        }

        for (int i = 0; i < 2; i++) {
            float[] arrayPrint = sourceArray;
            if (i == 1) {
                if (index < 0 || index >= 15) {
                    System.out.println();
                    break;
                }
                arrayPrint = changedArray;
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