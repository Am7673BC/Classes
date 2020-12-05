package com.test.study_1;

public class Motorcycle extends Car {
    public static int count1 = 0;
    public Motorcycle(byte count, int tankFull, int weigh,int height, int width, String mark){
        super(count,tankFull, weigh,height, width, mark);
    }
    public Motorcycle(int tankFull, int weigh,int height, int width, String mark){

        super((byte)2,tankFull, weigh,height, width, mark);
        MainActivity.text = "MAIN ACTIVITY";
        int sum = MainActivity.aPlusB(2,6);
    }
}
