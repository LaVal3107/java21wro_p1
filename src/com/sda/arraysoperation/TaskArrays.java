package com.sda.arraysoperation;

import java.lang.reflect.Array;

public class TaskArrays {
    public void TaskArr() {
        int arr[] = new int[20];
        //uzupełnienie tablicy
        for (int i = 0; i < arr.length; i++) {
            arr[i] = 3 + i;
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
    }
}
