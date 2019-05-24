package com.sda.primenumber;

import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        System.out.println("Please insert number:");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        PrimeSelector primeSelector = new PrimeSelector();
        PrimeArray primeArr = new PrimeArray();

        System.out.println(primeSelector.isPrime(number));
        primeArr.primeArray(number);
        scanner.close();


    }

}
