package com.test.study_1;

public class Singletone {
    private static Singletone instance;
    int count;

   private Singletone() {

   }
    public static Singletone getInstance(){
        if(instance == null){
            instance = new Singletone();
        }
        return instance;
    }
}
