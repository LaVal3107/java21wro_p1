package com.sda.zadaniadomowe;

import com.sun.xml.internal.fastinfoset.util.CharArray;

import java.util.Scanner;

public class CezarKod {
    public static String ConvertToCezarKod(String str) {
        //toCharArray конвертирует строку str в массив символов charArray
        char[] charArray = str.toCharArray();
        int charIndex;
        for (int i = 0; i < str.length(); i++) {
            charIndex = charArray[i];
            if (charIndex >= 65 && charIndex <= 90) {
                charIndex = 65 + (charIndex - 42) % 26;
                charArray[i] = (char) charIndex;
            } else continue;
        }
        return new String(charArray);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Insert text to encrypt:");
        String str = scan.nextLine().toUpperCase();
        System.out.println("Your text:\n" + str);
        System.out.println("Your encrypted text:\n" + ConvertToCezarKod(str));
        scan.close();

    }
}
