package com.sda.Arrays;

public class MainPair {
    public static void main(String[] args) {
        ArrayList1<Integer> arrList = new ArrayList1();
        arrList.add(5);
        for (int i = 0; i < 4; i++)
            arrList.add(i);
        arrList.add(2,12);
        arrList.remove(1);
        for (int i = 0; i < arrList.size(); i++) {
            System.out.println(arrList.get(i) + " , ");
        }
    }
}
