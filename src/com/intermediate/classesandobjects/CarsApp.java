package com.intermediate.classesandobjects;

public class CarsApp {
    public static void main(String[] args) {
        HondaSuv brv=new HondaSuv();
        brv.startTheEngine();
        brv.getDescription();
        System.out.println("---------------------");
        HondaSuv wrv=new HondaSuv();
        wrv.startTheEngine();
        wrv.getDescription();
        System.out.println("---------------------");
        HondaSuv crv=new HondaSuv("Green");
        crv.startTheEngine();
        crv.getDescription();

        System.out.println("---------------------");
        HondaSuv purpleCrv=new HondaSuv("purple",(byte)5,(short) 392,(short) 492,(short) 6700,30000,10000,false);
        purpleCrv.startTheEngine();
        purpleCrv.getDescription();
        System.out.println("---------------------");
        HondaSuv redCrv=new HondaSuv("red",(byte)3,(short) 300,(short) 400,(short) 678,40000,10000,false);
        redCrv.startTheEngine();
        redCrv.getDescription();
    }
}
