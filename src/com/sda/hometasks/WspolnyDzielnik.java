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
        System.out.println("gcd " + a +" and " + b +" = " + gcd(a, b));
    }

    public static int gcd(int a, int b) {
        if (b == 0) return a;
        while (a != b) {
            if (a > b) {
                a = a - b;
                return a;
            } else {
                b = b - a;
                return b;
            }
        }
        return a;
    }
}
