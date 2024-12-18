package com.java_beginning.lesson_2_3_4.array;

public class DeletedArrayElements {
    public static void main(String[] args) {
        DeletedArrayElements deletedArrayElements = new DeletedArrayElements();
        deletedArrayElements.overwritingValues(-1);
        deletedArrayElements.overwritingValues(15);
        deletedArrayElements.overwritingValues(0);
        deletedArrayElements.overwritingValues(14);
    }

    public void overwritingValues(int number) {
        float[] array = new float[15];
        boolean isValue = false;
        float digit = 0;

        System.out.print("Исходный массив: [");
        for (int i = 0; i < array.length; i++) {
            array[i] = (float) Math.random();
            if (i == number) {
                isValue = false;
                digit = array[i];
            } else if (i != number) {
                isValue = true;
            }

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

        System.out.print((isValue == false) ? "Значение из ячейки по переданному индексу - " :
                "Значения не обнулялись\n");
        if (isValue == false) {
            System.out.printf("%.3f%s", digit, " \n");
        }

        int counter = 0;
        System.out.print("\nИзменённый массив: [");
        for (int i = 0; i < array.length; i++) {
            if (array[i] > number) {
                array[i] = 0;
                counter++;
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
                        System.out.printf("%.3f%s", array[i], "]");
                    }
                }
            } else if (array[i] < number || array[i] == number || array[i] == 0) {
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
                        System.out.printf("%.3f%s", array[i], "]");
                    }
                }
            }
        }
        System.out.print("\nКоличество обнуленных ячеек - " + counter + "\n\n");
    }
}
