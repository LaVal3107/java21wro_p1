package com.sda.primenumber;

import java.util.LinkedList;

public class PrimeArray {

    public void primeArray(int n) {
        System.out.println("Prime numbers: ");
        for (int i = 2; i <= n; i++) {
            Integer rez = i;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    rez = null;
                    break;
                }
            }
            if (rez != null) {
                System.out.print(" "+rez);
            }
        }
    }
}
