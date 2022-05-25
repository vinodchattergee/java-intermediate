package com.intermediate.oops.polymorphism.cars;

public class HondaSuv extends Car implements IStartMode{
    public HondaSuv() {
        super();
    }

    public HondaSuv(String color) {
       super(color);
    }

    public HondaSuv(String color, byte numberOfVehicleOwners, short power, short horsePower, short cubicCapacity, int price, int mileage, boolean isDamaged) {
        super( color,  numberOfVehicleOwners,  power,  horsePower,  cubicCapacity,  price,  mileage,  isDamaged);
    }

    @Override
    public void startTheEngine() {

    }


    @Override
    public void start() {
        System.out.println("This is a new generation car.Use push button to start the car!");
    }
}
