package com.sda.game;

import java.util.Random;
import java.util.Scanner;

public class Zgadywanka {
    public static void main(String[] args) {
        Random random = new Random();
        int number = random.nextInt(99);
        int numberUser;
        System.out.println("Insert number: ");

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            numberUser = scanner.nextInt();
            if (numberUser == number){
                System.out.println("Congratulations!");
                break;
            } else {
                System.out.println("Try again");
                if (numberUser < number){
                    System.out.println("The number is greater than the entered");
                }
                if (numberUser > number){
                    System.out.println("The number is less  than the entered");
                }
            }

        }

    }
}
