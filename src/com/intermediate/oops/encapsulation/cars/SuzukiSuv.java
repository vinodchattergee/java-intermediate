package com.intermediate.oops.encapsulation.cars;

public class SuzukiSuv extends Car {
    public SuzukiSuv() {
        super();
    }

    public SuzukiSuv(String color) {
       super(color);
    }

    public SuzukiSuv(String color, byte numberOfVehicleOwners, short power, short horsePower, short cubicCapacity, int price, int mileage, boolean isDamaged) {
        super( color,  numberOfVehicleOwners,  power,  horsePower,  cubicCapacity,  price,  mileage,  isDamaged);
    }

    @Override
    public void startTheEngine() {
        System.out.println("A Suzuki car is started!");
    }
}
