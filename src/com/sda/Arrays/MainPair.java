package com.sda.Arrays;

public class MainPair {
    public static void main(String[] args) {
        LinkedList<Integer> arrList = new LinkedList<>();
        //arrList.add(5);
        for (int i = 0; i < 4; i++)
            arrList.add(i);
        arrList.remove(1);
        arrList.add(3, 12);
        for (int i = 0; i < arrList.size(); i++) {
            System.out.print(arrList.get(i) + " , ");
        }
    }
}
