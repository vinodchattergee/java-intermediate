package com.intermediate.oops.inheritance.cars;

import java.util.Random;

public class Car {
    String color;


    byte numberOfSeats = 5;
    byte numberOfDoors = 3;
    byte numberOfVehicleOwners = 1;
    byte emissionSticker = 4;

    short power = 362;
    short horsePower = 492;
    short co2Emission = 333;
    short cubicCapacity = 6417;

    int price = 29999;
    int mileage = 14999;

    long registrationNumber = 9223372036854775807L;


    float fuelConsumptionCombined = 15.5F;
    float fuelConsumptionUrban = 21.4F;
    float fuelConsumptionExtraUrban = 13.6F;

    double fuelConsumptionPreciseAverage = 13.64553435353453453453446546464645F;

    boolean isDamaged = true;

    char energyEfficiencyCategory = 'S';

    public Car() {
        System.out.println("An object of "+ getClass().getName() +" is created!");
    }

    public Car(String color) {
        this.color = color;
        System.out.println("An object of Honda Suv with " + this.color + " is created!");
    }

    public Car(String color, byte numberOfVehicleOwners, short power, short horsePower, short cubicCapacity, int price, int mileage, boolean isDamaged) {
        this.color = color;
        this.numberOfVehicleOwners = numberOfVehicleOwners;
        this.power = power;
        this.horsePower = horsePower;
        this.cubicCapacity = cubicCapacity;
        this.price = price;
        this.mileage = mileage;
        this.isDamaged = isDamaged;
        Random randomNumberGenerator=new Random();
        this.registrationNumber=randomNumberGenerator.nextLong();
    }

    public void startTheEngine() {
        System.out.println("The engine is started");
    }

    public void getDescription() {
        System.out.println(color + " Honda SUV ");
        System.out.println("Price INR : " + price);
        System.out.println("Mileage : " + mileage + " KM");
        System.out.println("The car is damaged  : " + isDamaged);
        System.out.println("Registration  : " + registrationNumber);
        System.out.println("Cubic Capacity  : " + cubicCapacity);
        System.out.println("Power  : " + power + " KW(" + horsePower + ")");
        System.out.println("CO2 Emission " + co2Emission + "g/km");
        System.out.println("Emission Sticker " + emissionSticker + "(Energy efficient category " + energyEfficiencyCategory + ")");
        System.out.println("Combined fuel consumption " + fuelConsumptionCombined + " l/100KM");
        System.out.println("Urban fuel consumption " + fuelConsumptionUrban + " l/100KM");
        System.out.println("Extra urban fuel consumption " + fuelConsumptionExtraUrban + " l/100KM");
        System.out.println("Precise average fuel consumption " + fuelConsumptionPreciseAverage + " l/100KM");
        System.out.println("Number of previous owners  : " + numberOfVehicleOwners);
        System.out.println("Number of doors : " + numberOfDoors);
        System.out.println("Number of seats : " + numberOfSeats);
    }
}
