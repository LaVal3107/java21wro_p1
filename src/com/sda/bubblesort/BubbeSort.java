package com.sda.bubblesort;

import java.util.Random;

public class BubbeSort {
    static int arrSize = 20, upperBound = 26;

    public static void main(String[] args) {

        int[] arr = new int[arrSize];

        Random rand = new Random();

        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(upperBound) - 5;
            //System.out.print(" " + numbers[i]);
            int[] sorteArr = sort(arr);
        }
    }

    private static int[] sort(int[] arr) {
        boolean isSorted = true;

        while (!isSorted) {
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    int tmp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = arr[i];
                    isSorted = false;

                }
            }
        }
        return arr;
    }
}
