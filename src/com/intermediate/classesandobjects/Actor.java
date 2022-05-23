package com.intermediate.classesandobjects;

import java.time.LocalDateTime;
import java.util.Arrays;

public class Actor {
    String nameOfActor;
    int yearOfBirth;

    public Actor(String nameOfActor, int yearOfBirth) {
        this.nameOfActor = nameOfActor;
        this.yearOfBirth = yearOfBirth;
    }

    public void getActorProfile() {
        System.out.println("Name of the Actor is " + nameOfActor);
        int age = LocalDateTime.now().getYear() - yearOfBirth;
        System.out.println("Year he born : " + yearOfBirth);
        System.out.println("Age : " + age);
    }
}
