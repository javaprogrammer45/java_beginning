package com.java_beginning.lesson_2_3_4.array;

public class ExceedValue {
    public static void main(String[] args) {
        ExceedValue exceedValue = new ExceedValue();
        exceedValue.print(exceedValue.fillSourceArray(), exceedValue.changArray(exceedValue.fillSourceArray(), -1),
                "Изменённый массив");
        exceedValue.print(exceedValue.fillSourceArray(), exceedValue.changArray(exceedValue.fillSourceArray(), 15),
                "Изменённый массив");
        exceedValue.print(exceedValue.fillSourceArray(), exceedValue.changArray(exceedValue.fillSourceArray(), -0),
                "Изменённый массив");
        exceedValue.print(exceedValue.fillSourceArray(), exceedValue.changArray(exceedValue.fillSourceArray(), 14),
                "Изменённый массив");
    }

    private float[] fillSourceArray() {
        float[] array = new float[15];
        for (int i = 0; i < array.length; i++) {
            array[i] = (float) Math.random();
        }
        return array;
    }

    private float[] changArray(float[] sourceArray, int index) {
        if (index >= 0 && index < sourceArray.length) {
            for (int i = 0; i < sourceArray.length; i++) {
                if (sourceArray[i] > sourceArray[index]) {
                    sourceArray[i] = 0;
                }
                if (i == sourceArray.length - 1) {
                    System.out.printf("%s%.3f%s", "значение из ячейки по переданному индексу  ", sourceArray[index], "\n");
                }
            }
        } else if (index < 0) {
            System.out.println("Отрицательный индекс\n\n");
        } else {
            System.out.println("Индекс должен быть меньше (15) и больше или равно (0)\n\n");
        }
        return sourceArray;
    }

    private void print(float[] sourceArray, float[] changedArray, String nameChangedArr) {

        for (int i = 0; i < sourceArray.length; i++) {
            if (i == 7) {
                System.out.println();
            }
            if (i == sourceArray.length - 1) {
                System.out.printf("%.3f%s", sourceArray[i], "\n\n");
                break;
            }
            System.out.printf("%.3f%s", sourceArray[i], ", ");
        }

        System.out.println(nameChangedArr);
        int zeroElements = 0;
        for (int i = 0; i < changedArray.length; i++) {
            if (i == 7) {
                System.out.println();
            }
            if (i == sourceArray.length - 1) {
                System.out.printf("%.3f%s", changedArray[i], "\n");
                break;
            }
            if (changedArray[i] == 0) {
                zeroElements++;
            }
            System.out.printf("%.3f%s", changedArray[i], ", ");
        }
        System.out.println("Количество обнулённых ячеек =  " + zeroElements + "\n\n");
    }
}