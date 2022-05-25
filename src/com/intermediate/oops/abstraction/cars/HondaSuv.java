package com.intermediate.oops.abstraction.cars;

public class HondaSuv extends Car {
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


}
