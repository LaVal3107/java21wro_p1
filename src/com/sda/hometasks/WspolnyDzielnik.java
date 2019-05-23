package com.sda.hometasks;

import java.util.Scanner;

public class WspolnyDzielnik {

    public static void main(String[] args) {
        int a, b;
        Scanner scan = new Scanner(System.in);
        System.out.println("Insert number a: ");
        a = scan.nextInt();
        System.out.println("Insert number b:");
        b = scan.nextInt();
        scan.close();
        System.out.println("gcd " + a + " and " + b + " = " + gcd(a, b));
    }

    public static int gcd(int a, int b) {
        if (b == 0 || a == b) return a;
        if (a == 0) return b;
        while (a != b) {
            if (a > b) {
                a = a - b;
            } else {
                b = b - a;
            }
        }
        return a;
    }

}

