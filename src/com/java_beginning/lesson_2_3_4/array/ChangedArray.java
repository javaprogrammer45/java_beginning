package com.java_beginning.lesson_2_3_4.array;

public class ChangedArray {
    public static void main(String[] args) {
        ChangedArray elementArray = new ChangedArray();
        elementArray.printArrayElements(elementArray.fillingSourceArray(),
                elementArray.changingArray(elementArray.fillingSourceArray(), 14));
    }

    public float[] fillingSourceArray() {
        float[] array = new float[15];
        for (int i = 0; i < array.length; i++) {
            array[i] = (float) Math.random();
        }
        return array;
    }

    public float[] changingArray(float[] sourceArray, int number) {
        int counter = 0;
        if (number >= 0 && number < sourceArray.length) {
            for (int i = 0; i < sourceArray.length; i++) {
                if (sourceArray[i] > sourceArray[number]) {
                    sourceArray[i] = 0;
                    counter++;
                }
            }
            System.out.println("значение из ячейки по переданному индексу  " + sourceArray[number]);
        } else if (number < 0) {
            System.out.println("Отрицательный индекс");
        } else {
            System.out.println("Индекс должен быть меньше (15) и больше или равно (0)");
        }
        System.out.println("Количество обнулённых ячеек =  " + counter);
        return sourceArray;
    }

    public void print(float[] array) {
        for (int i = 0; i < array.length; i++) {
            if (i <= array.length / 2) {
                if (i != (array.length / 2)) {
                    System.out.printf("%.3f%s", array[i], ", ");
                } else {
                    System.out.printf("%.3f", array[i]);
                    System.out.print("]\n");
                }
            } else if ((i > array.length / 2)) {
                if (i == (array.length / 2) + 1) {
                    System.out.printf("%s%.3f%s", "[", array[i], ", ");
                } else if (i > (array.length / 2) + 1 && i != array.length - 1) {
                    System.out.printf("%.3f%s", array[i], ", ");
                } else if (i == array.length - 1) {
                    System.out.printf("%.3f%s", array[i], "]\n");
                }
            }
        }
    }

    public void printArrayElements(float[] sourceArray, float[] changeArray) {
        System.out.print("\nИсходный массив: [");
        print(sourceArray);

        System.out.print("\nИзменённый массив: [");
        print(changeArray);
    }
}
