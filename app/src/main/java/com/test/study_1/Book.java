package com.test.study_1;

public class Book {
    private static Book instance;
     int pageNumber;

     private Book(){

     }
     public static Book getInstance(){
         if(instance == null){
             instance = new Book();
         }
         return instance;
     }
     }
