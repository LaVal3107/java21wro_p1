package com.sda.arraysoperation;

import java.lang.reflect.Array;

public class TaskArrays {
    public void TaskArr() {
        int arr[] = new int[20];
        //uzupełnienie tablicy
        System.out.println("Wszystkie elementy tablicy po kolei: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = 3 + i;
            System.out.print(arr[i] + " ");
        }
        System.out.println("\nWszystkie elementy tablicy od końca:");

        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }

        System.out.println("\nWszystkie elementy na nieparzystych pozycjach:");
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 1) {
                System.out.print("el[" + i + "]= " + arr[i] + " ");
            }

        }
        System.out.println("\nWszystkie elementy podzielne przez 3:");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 3 == 0) {
                System.out.print(arr[i] + " ");
            }
        }
        System.out.println("\nSumma wszystkich elementów tablicy:");
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        System.out.print(sum);

        System.out.println("\nSumma pierwszych 4 elementów tablicy:");
        int sum4 = 0;
        for (int i = 0; i < 4; i++) {
            sum4 = sum4 + arr[i];
        }
        System.out.print(sum4);

        System.out.println("\nSumma ostatnich 5 elementów tablicy:");
        int sum5 = 0;
        for (int i = arr.length - 1; i >= 15; i--) {
            sum5 = sum5 + arr[i];
        }
        System.out.print(sum5);
    }
}
