package com.java_beginning.lesson_2_3_4.array;

public class ElementArray {
    public static void main(String[] args) {
        ElementArray elementArray = new ElementArray();
        elementArray.printArrayElements(elementArray.fillingSourceArray(),
                elementArray.changingArray(elementArray.fillingSourceArray(), 14));
    }

    public void printArrayElements(float[] sourceArray, float[] changeArray) {
        System.out.print("\nИсходный массив: [");
        for (int i = 0; i < sourceArray.length; i++) {
            if (i <= sourceArray.length / 2) {
                if (i != (sourceArray.length / 2)) {
                    System.out.printf("%.3f%s", sourceArray[i], ", ");
                } else {
                    System.out.printf("%.3f", sourceArray[i]);
                    System.out.print("]\n");
                }
            } else if ((i > sourceArray.length / 2)) {
                if (i == (sourceArray.length / 2) + 1) {
                    System.out.printf("%s%.3f%s", "[", sourceArray[i], ", ");
                } else if (i > (sourceArray.length / 2) + 1 && i != sourceArray.length - 1) {
                    System.out.printf("%.3f%s", sourceArray[i], ", ");
                } else if (i == sourceArray.length - 1) {
                    System.out.printf("%.3f%s", sourceArray[i], "]\n");
                }
            }
        }

        System.out.print("\nИзменённый массив: [");
        for (int i = 0; i < changeArray.length; i++) {
            if (i <= changeArray.length / 2) {
                if (i != (changeArray.length / 2)) {
                    System.out.printf("%.3f%s", changeArray[i], ", ");
                } else {
                    System.out.printf("%.3f", changeArray[i]);
                    System.out.print("]\n");
                }
            } else if ((i > changeArray.length / 2)) {
                if (i == (changeArray.length / 2) + 1) {
                    System.out.printf("%s%.3f%s", "[", changeArray[i], ", ");
                } else if (i > (changeArray.length / 2) + 1 && i != changeArray.length - 1) {
                    System.out.printf("%.3f%s", changeArray[i], ", ");
                } else if (i == changeArray.length - 1) {
                    System.out.printf("%.3f%s", changeArray[i], "]");
                }
            }
        }
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

    public float[] fillingSourceArray() {
        float[] array = new float[15];
        for (int i = 0; i < array.length; i++) {
            array[i] = (float) Math.random();
        }
        return array;
    }
}
