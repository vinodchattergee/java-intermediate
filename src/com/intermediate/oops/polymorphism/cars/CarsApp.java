package com.intermediate.oops.polymorphism.cars;

public class CarsApp {
    public static void main(String[] args) {
        Car brv=new HondaSuv();
        brv.startTheEngine();
        brv.getDescription();
        System.out.println("---------------------");
        Car wrv=new HondaSuv();
        wrv.startTheEngine();
        wrv.getDescription();
        System.out.println("---------------------");
        Car crv=new HondaSuv("Green");
        crv.startTheEngine();
        crv.getDescription();

        System.out.println("---------------------");
        HondaSuv purpleCrv=new HondaSuv("purple",(byte)5,(short) 392,(short) 492,(short) 6700,30000,10000,false);
        purpleCrv.startTheEngine();
        purpleCrv.getDescription();
        purpleCrv.start();
        System.out.println("---------------------");
        Car redCrv=new SuzukiSuv("red",(byte)3,(short) 300,(short) 400,(short) 678,40000,10000,false);
        redCrv.startTheEngine();
        redCrv.getDescription();
        System.out.println("---------Entering City switching to electric mode------------");
        SuzukiSuv wagonR=new SuzukiSuv();
        wagonR.startTheEngine();
        wagonR.getDescription();
        System.out.println("Current Mileage +"+ wagonR.getMileage());
        wagonR.drive(100);
        System.out.println("Current Mileage +"+ wagonR.getMileage());
        wagonR.setPrice(50000);
        wagonR.getDescription();
        wagonR.start();
        System.out.println("---------------------");
    }
}
