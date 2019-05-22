package com.sda.powtorka;

public class EquilateralTriangle implements IDrawable {
    public int sideT;

    public EquilateralTriangle(int sideT) {
        this.sideT = sideT;
    }

    @Override
    public void draw(){
        for (int i = 0; i < sideT; i++){
            for (int j = 0; j < sideT; j++){
                System.out.print(" * ");
                if (i==j)
                    break;
            }
            System.out.println();
        }
    }
}
