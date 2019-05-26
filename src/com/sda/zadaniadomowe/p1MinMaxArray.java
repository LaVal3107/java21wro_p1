package com.sda.zadaniadomowe;

import java.util.Random;

public class p1MinMaxArray {
    public static void main(String[] args) {
        int sizeTable = 20;
        int[] table = new int[sizeTable];
        int minEl = Integer.MAX_VALUE, maxEl = Integer.MIN_VALUE;
        Random random = new Random();

        for (int i = 0; i < table.length; i++) {
            table[i] = random.nextInt(100);
            System.out.print(table[i] + " ");
        }
        for (int i = 0; i < table.length; i++) {
            if (table[i] < minEl)
                minEl = table[i];
            if (table[i] > maxEl)
                maxEl = table[i];
        }
        System.out.println("\nMin element = " + minEl);
        System.out.println("\nMax element = " + maxEl);
    }
}
