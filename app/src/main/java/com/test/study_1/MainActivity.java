package com.test.study_1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Car car;

    TextView txtTank;
    TextView txtWeight;
    TextView txtTakhometre;
    TextView txtWidth;
    TextView txtHeight;
    TextView txtVinCode;
    TextView txtMark;
    TextView txtIsEngine;

    int speed = 0;
    private float tank = 80;
    final float tankFull = 80;
    short takhometre = 2400;
    int weight = 1400;
    int widht = 600;
    int height = 900;
    long vinCode = 5040;
    String mark = "78";
    boolean isEngine = true;


    static String text = "";

    public static int aPlusB(int a, int b){

        return a+b;

    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtTank = findViewById(R.id.txtTank);
        txtWeight = findViewById(R.id.txtWeight);
        txtTakhometre = findViewById(R.id.txtTakhometre);
        txtWidth = findViewById(R.id.txtWidth);
        txtHeight = findViewById(R.id.txtHeight);
        txtVinCode = findViewById(R.id.txtVinCode);
        txtMark = findViewById(R.id.txtMark);
        txtIsEngine = findViewById(R.id.txtIsEngine);

        txtTank.setText("Tank=" + tank);
        txtWeight.setText("Weight=" + weight);
        txtTakhometre.setText("Takhometre=" + takhometre);
        txtWidth.setText("Width=" + widht);
        txtHeight.setText("height=" + height);
        txtVinCode.setText("VinCode=" + vinCode);
        txtMark.setText("Mark=" + mark);
        txtIsEngine.setText("IsEngine=" + isEngine);

        int sum = sum(12, 32);
        String s = "Sum a and b = " + sum;
        System.out.println(s);

        startEngine();
        accelerate(5);
        accelerate(10);
        accelerate(10);
        accelerate(10);
        accelerate(10);
        accelerate(30);
        accelerate(30);
        stopEngine();
        car = new Car();
        car.getHeight();
        car.getTank();
        car.getWidht();
        car = new Car((byte)4,80,2500,800,1000,"zaz");

        Car c;
        c = new Car();

        c = new Car();
        c.getWidht();
        System.out.println("Weight = " + c.getWeight());


        Truck truck = new Truck();
        Jeep suv = new Jeep();

        ICar iCar = new Car((byte)4,80,700,600,600, "ror");

        Singletone singletone = Singletone.getInstance();
        singletone.count++;
        Singletone singletone2 = Singletone.getInstance();
        System.out.println("Count = " + singletone2.count);


    }

    //function
    int sum(int a, int b) {
        return a + b;
    }


    void startEngine() {
        if (tank > 0 && speed == 0) {
            isEngine = true;
        } else if (isEngine) {
            System.out.println("Car is already running");
        }
        System.out.println("Car is running");
    }


    void stopEngine() {

        isEngine = false;
        System.out.println("Car is stop");
    }

    void accelerate(int velocity) {
        if (!isEngine) return;
        if (tank <= 0) {
            speed = 0;
            stopEngine();
            return;

        }
        // здесь уменьшаем кол-во бензина в баке
        tank--;
        speed = speed + velocity;

        //    speed += velocity;

        System.out.println("Наша скорость теперь: " + speed);
    }

    void decelerate(int velocity) {
        if (tank >= 0) {
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

    void refueling(int quantity) {
        if (quantity > (tankFull - tank)) {
            System.out.println("At the moment in tha tank is " + (quantity + tank) + "litres.");
            System.out.println("Exceeded the size limit " + (quantity - tankFull) + "litres.");

        } else if (quantity == tankFull) {
            System.out.println("Tank is full.");

        } else {
            tank += quantity;
            System.out.println("At the moment in tha tank is " + (quantity + tank) + "litres.");
            System.out.println("Tank is not full yet.");
        }
    }

    void someMath() {
        car.accelerate(30);
    }

    // <=
    // >=
    // <
    // >
    // ==
    // != не равно
    // &  и
    // && и
    // |  или
    // || или
    // :?

}