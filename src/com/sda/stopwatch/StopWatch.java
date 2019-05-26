package com.sda.stopwatch;

public class StopWatch {
    int n = 100000;
    int[] tablInt = new int[n];
    float rez;


    public void Start() {
        rez = System.nanoTime();
        System.out.println(rez);
    }

    public void Table(){
        int c = 2;
        for (int i = 0; i < n; i++) {
            tablInt[i] = i;
            tablInt[i] = tablInt[i] * c;
        }
    }


    public float Stop() {
        rez = (System.nanoTime() - rez)/100000001;
        return rez;
    }
}
