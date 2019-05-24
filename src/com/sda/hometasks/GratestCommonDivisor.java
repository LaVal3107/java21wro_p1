package com.sda.hometasks;

public class GratestCommonDivisor {

    // Алгоритм Евклида. Наибольший общий делитель

        public static void main(String[] args) {
            System.out.println(gcd(12, 64));
        }

        public static int gcd(int a, int b) {
            if (b == 0) return a;
            int x = a % b;
            return gcd(b, x);
        }
    }
