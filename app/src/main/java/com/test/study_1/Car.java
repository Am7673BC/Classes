package com.test.study_1;

import android.widget.TextView;

public class Car implements ICar {


    private int speed = 0;
    private float tank;
    private int tankFull;
    private short takhometre;
    private  int weight;
    private int widht;
    private int height;
    private long vinCode;
    private int engineTemp;
    private int pressure;
    private String mark;
    private byte count;







    public Car(byte count, int tankFull, int weigh,int height, int width, String mark){
        this.tankFull = tankFull;
        this.weight = weigh;
        this.height = height;
        this.widht = width;
        this.mark = mark;
        this.count = count;

    }


    public Car(){

    }


    public float getTank(){
       return (tank);
   }
    public int getWeight(){
       return(weight);
   }
    public int getHeight(){
       return height;
   }
    public int getWidht(){
        return widht;
    }
    public int getEngineTemp() {return engineTemp;}
    public int getSpeed() {return speed;}
    public int getPressure() {return pressure;}



    public void setHeight(int height){
       this.height = height;
   }
    public void setTank(int tank){
       this.tank = tank;
   }
    public void setWeight(int weight){
       this.weight = weight;
   }
    public void setWidht(int widht){
        this.widht = widht;
    }
    public void setEngineTemp(int temp){
        this.engineTemp = temp;
    }
    public void setSpeed(int speed){
        this.speed = speed;
    }
    public void setPressure(int pressure){
        this.pressure = pressure;
    }



    public void setText(String text) {
        this.text = text;
    }

    public void getWeight(int weight){
       this.weight = weight;
   }

    boolean isEngine = true;


    String text = "";

    int sum(int a, int b) {
        return a + b;
    }


   @Override
   public void startEngine() {
        if (tank > 0 && speed == 0){
            isEngine = true;
        } else if (isEngine){
            System.out.println("Car is already running");
        }
        System.out.println("Car is running");
    }


    @Override
    public void stopEngine() {


        isEngine = false;
        System.out.println("Car is stop");
    }

    private boolean isTempNormal(){
        return engineTemp>10&&engineTemp<90;
    }




    void accelerate(int velocity) {
        if (!isEngine) return;
        if (tank<=0){
            speed = 0;
            stopEngine();
            engineTemp++;
            return;

        }
        // здесь уменьшаем кол-во бензина в баке
        tank--;
        speed = speed + velocity;

        //    speed += velocity;

        System.out.println("Наша скорость теперь: " + speed);
    }

    void decelerate(int velocity) {
        if (tank>=0){
            speed = 0;
            stopEngine();
            return;
        }
        if ((speed - velocity) <= 0) {
            speed = 0;
        } else {
            speed = speed - velocity;

            //     speed -= velocity;
        }
        System.out.println("Наша скорость теперь: " + speed);
        // System.out.println("Наша скорость теперь: " + ((speed - velocity) ? 0:(speed -= velocity)));

    }

    void refueling(int quantity){
        if (quantity > (tankFull - tank)){
            System.out.println("At the moment in tha tank is " + (quantity + tank) + "litres.");
            System.out.println("Exceeded the size limit " + (quantity - tankFull) + "litres.");

        } else if (quantity == tankFull){
            System.out.println("Tank is full.");

        } else {
            tank += quantity;
            System.out.println("At the moment in tha tank is " + (quantity + tank) + "litres.");
            System.out.println("Tank is not full yet.");
        }
    }


}
