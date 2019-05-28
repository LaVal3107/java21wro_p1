package com.sda.zadaniadomowe;

import java.util.Random;

public class p2SortArray {

    public static void Sorting(int[] arrSortOff, int sizeArr) {
        int i, j, tmp;
        System.out.println("\nSorted array:");
        for (i = 1; i < sizeArr; i++) {
            j = i;
            tmp = arrSortOff[i];
            while ((j > 0) && (arrSortOff[j - 1] > tmp)) {
                arrSortOff[j] = arrSortOff[j - 1];
                j--;
            }
            arrSortOff[j] = tmp;
        }
    }

    public static void main(String[] args) {
        int sizeArr = 20;
        int[] arrSort = new int[sizeArr];
        Random rand = new Random();
        for (int i = 0; i < arrSort.length; i++) {
            arrSort[i] = rand.nextInt(99);
            System.out.print(arrSort[i] + " ");
        }
        Sorting(arrSort, sizeArr);
        for (int i = 0; i < arrSort.length; i++)
            System.out.print(arrSort[i] + " ");
    }
}