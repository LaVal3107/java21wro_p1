package com.sda.powtorka;

import java.util.Scanner;

public class PowtorkaMain {
    public static void main(String[] args) {
        System.out.println("To write rectangle type 1");
        System.out.println("To write square type 2");
        System.out.println("To write triangle type 3");

        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        switch (number) {
            case 1:
                System.out.println("Please enter length od side A");
                int sideA = scanner.nextInt();
                System.out.println("Please enter length od side B");
                int sideB = scanner.nextInt();
                Rectangle rec = new Rectangle(sideA, sideB);
                rec.draw();
                break;
            case 2:
                System.out.println("Please enter length od side");
                int side = scanner.nextInt();
                Square square = new Square(side);
                square.draw();
                break;
            case 3:
                System.out.println("Please enter length od side");
                int sideT = scanner.nextInt();
                EquilateralTriangle eqTriangle = new EquilateralTriangle(sideT);
                eqTriangle.draw();
                break;
        }
    }
}
