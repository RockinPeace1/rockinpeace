package com.antipov;

import java.util.Arrays;
import java.util.Random;

public class Main5 {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();

    }

    private static void task1() {
        Random random = new Random();
        int[] array1 = new int[12];
        for (int i = 0; i < array1.length; i++) {
            array1[i] = random.nextInt(-15, 15);
        }
        int maxValue = array1[0];
        int indexForMaxValue = 0;
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] >= maxValue) {
                maxValue = array1[i];
                indexForMaxValue = i;
            }
        }
        System.out.printf("The last maximum element of the array is %d, its index is %d%n", maxValue, indexForMaxValue);
    }

    //task 2
    private static void task2() {
        Random random = new Random();
        int[] array2 = new int[8];
        for (int i = 0; i < array2.length; i++) {
            array2[i] = random.nextInt(1, 10);
        }
        System.out.println(Arrays.toString(array2));
        for (int i = 0; i < array2.length; i++) {
            if (!(i % 2 == 0)) {
                array2[i] = 0;
            }
        }
        System.out.println(Arrays.toString(array2));
    }

    //task3
    private static void task3() {
        Random random = new Random();
        int[] array3 = new int[4];
        for (int i = 0; i < array3.length; i++) {
            array3[i] = random.nextInt(10, 99);
        }
        System.out.println(Arrays.toString(array3));
        boolean arrayIsIncreasing = false;
        for (int i = 0; i < array3.length - 1; i++) {
            if (array3[i] <= array3[i + 1]) {
                arrayIsIncreasing = true;
            } else {
                arrayIsIncreasing = false;
                break;
            }
        }
        System.out.println("Array is increasing: " + arrayIsIncreasing);
    }

    //task4
    private static void task4() {
        double sumArray1 = 0, sumArray2 = 0;
        int[] array4 = new int[5];
        for (int i = 0; i < array4.length; i++) {
            array4[i] = (int) (Math.random() * 6);
            System.out.println(array4[i] + " ");
            sumArray1 += (double) array4[i] / array4.length;
        }
        System.out.println("-------");
        int[] array2 = new int[5];
        for (int i = 0; i < array2.length; i++) {
            array2[i] = (int) (Math.random() * 6);
            System.out.println(array2[i] + " ");
            sumArray2 += (double) array2[i] / array2.length;
        }
        System.out.println(" ");
        if (sumArray1 == sumArray2)
            System.out.println("Arithmetic average of two arrays of levels");
        else {
            if (sumArray1 > sumArray2)
                System.out.println("The arithmetic mean of the first array is greater");
            else System.out.println("The arithmetic mean of the second array is greater");
        }
    }
}
