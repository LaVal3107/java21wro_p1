package com.sda.zadaniadomowe;

import java.util.Random;

public class Duplicate {
    public static void DuplicateElement(int[] array, int sizeArr) {
        int i;


        System.out.println("Duplicate element: ");
        for (i = 0; i < array.length; i++) {
            for (int j = 1; j < array.length; j++) {
                if (array[i] == array[j])
                    System.out.print(array[j] + "");
            }
        }

    }

    public static void main(String[] args) {
        int sizeArr = 20;
        int[] array = new int[sizeArr];
        Random rand = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(sizeArr - 1);
            System.out.print(array[i] + " ");
        }

        DuplicateElement(array, sizeArr);
    }
}
